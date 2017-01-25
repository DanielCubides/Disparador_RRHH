package jobs;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import javax.sql.DataSource;

import co.com.unionsoluciones.servicios.seguridad.DataSourceIbatis;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

class EntityManager {

	
	private static Map<String, SqlMapClient> sqlMaps = new HashMap<String, SqlMapClient>();
	
	public EntityManager(){
		
	}
	
	public SqlMapClient getSqlMapClient(DataSourceIbatis dataSource) throws Exception{
		String llave = dataSource.toString();
		if (sqlMaps.get(llave)!=null){
			return sqlMaps.get(llave);
		}
		
		Properties properties = new Properties();
		String ruta = "";
		properties.put("jndi.name", dataSource.getUrl());
		ruta = "co/com/unionsoluciones/persistencia/dao/ibatis/config/sql-map-configJNDI.xml";
		Reader reader = Resources.getResourceAsReader(ruta);
		SqlMapClient sqlMap = (SqlMapClient) SqlMapClientBuilder.buildSqlMapClient(reader, properties);
		sqlMaps.put(llave,sqlMap);
		return sqlMap;
		
		
	}

	public List<?> queryForList(DataSourceIbatis dataSource,String arg0, Object arg1) throws Exception {
		return getSqlMapClient(dataSource).queryForList(arg0, arg1);
	}


	public Object queryForObject(DataSourceIbatis dataSource,String arg0, Object arg1) throws Exception {
		return getSqlMapClient(dataSource).queryForObject(arg0, arg1);
	}

	public DataSource getDataSource(DataSourceIbatis db, Object arg1)  throws Exception{
		for (Entry<String, SqlMapClient> mapa : sqlMaps.entrySet()) {
			if(mapa.getKey().startsWith(db.toString())){
				return  mapa.getValue().getDataSource();	
			}
		}
		getSqlMapClient(db);
		return getDataSource(db, arg1);
	}
	

}
