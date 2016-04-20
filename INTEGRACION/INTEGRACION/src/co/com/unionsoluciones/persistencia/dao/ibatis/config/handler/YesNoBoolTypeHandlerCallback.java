package co.com.unionsoluciones.persistencia.dao.ibatis.config.handler;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.extensions.ParameterSetter;
import com.ibatis.sqlmap.client.extensions.ResultGetter;
import com.ibatis.sqlmap.client.extensions.TypeHandlerCallback;

public class YesNoBoolTypeHandlerCallback implements TypeHandlerCallback {
	private static final String YES = "S";
	private static final String NO = "N";
	
	public Object getResult(ResultGetter getter) throws SQLException {
		String s = getter.getString();
		if (YES.equalsIgnoreCase(s)) {
			return new Boolean (true);
		} else if (NO.equalsIgnoreCase(s)) {
			return new Boolean (false);
		} else {
			throw new SQLException ("Unexpected value " + s + " found where " + YES + " or " + NO + " was expected.");
		}
	}
	
	public void setParameter(ParameterSetter setter, Object parameter) throws SQLException {
		boolean b = ((Boolean)parameter).booleanValue();
		if (b) {
			setter.setString(YES);
		} else {
			setter.setString(NO);
		}
	}
	
	public Object valueOf(String s) {
		if (YES.equalsIgnoreCase(s)) {
			return new Boolean (true);
		} else if (NO.equalsIgnoreCase(s)) {
			return new Boolean (false);
		} else {
//			throw new SQLException ("Unexpected value " + s + " found where " + YES + " or " + NO + " was expected.");
		}
		return null;
	}
}