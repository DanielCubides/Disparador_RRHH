package co.com.unionsoluciones.servicios.dto;

import java.io.Serializable;

public class PaisDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3476541216036840364L;
	private String paisSoa;
	private String paisSara;
	private String ubicacion;
	
	public String getPaisSoa() {
		return paisSoa;
	}
	public void setPaisSoa(String paisSoa) {
		this.paisSoa = paisSoa;
	}
	public String getPaisSara() {
		return paisSara;
	}
	public void setPaisSara(String paisSara) {
		this.paisSara = paisSara;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}