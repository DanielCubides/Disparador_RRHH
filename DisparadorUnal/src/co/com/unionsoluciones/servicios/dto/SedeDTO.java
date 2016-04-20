package co.com.unionsoluciones.servicios.dto;

import java.io.Serializable;

public class SedeDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3476541216036840364L;
	private String sede;
	private String aplicativo;
	private int tipoPeriodo;
	
	public int getTipoPeriodo() {
		return tipoPeriodo;
	}
	public void setTipoPeriodo(int tipoPeriodo) {
		this.tipoPeriodo = tipoPeriodo;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public String getAplicativo() {
		return aplicativo;
	}
	public void setAplicativo(String aplicativo) {
		this.aplicativo = aplicativo;
	}
	

}