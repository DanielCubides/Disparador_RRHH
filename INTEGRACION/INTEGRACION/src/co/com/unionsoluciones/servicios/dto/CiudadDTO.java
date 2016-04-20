package co.com.unionsoluciones.servicios.dto;

import java.io.Serializable;

public class CiudadDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3476541216036840364L;
	private String ciudadSoa;
	private String ciudadSara;

	public String getCiudadSoa() {
		return ciudadSoa;
	}
	public void setCiudadSoa(String ciudadSoa) {
		this.ciudadSoa = ciudadSoa;
	}
	public String getCiudadSara() {
		return ciudadSara;
	}
	public void setCiudadSara(String ciudadSara) {
		this.ciudadSara = ciudadSara;
	}
	

}