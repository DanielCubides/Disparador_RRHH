package co.com.unionsoluciones.servicios.seguridad;

import java.io.Serializable;

public class DataSourceIbatis implements Serializable {


	private String url;
	private static DataSourceIbatis dataSourceSOA;
	/**
	 *
	 */
	private static final long serialVersionUID = -8702158841172798327L;


	public DataSourceIbatis(String url) {
		if(url.contains("java:") && !url.contains("java:/")){
			this.url=url.replace("java:", "java:/");
		}else{
			this.url = url;
		}
	}

	
	public static DataSourceIbatis getDataSourceSOA() throws Exception{
		if (dataSourceSOA==null){
			try {
				String url = "jdbc/SaraIntegracionDS";
				dataSourceSOA = new DataSourceIbatis(url);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dataSourceSOA;
	}


	public String getUrl() {
		return url;
	}


}

