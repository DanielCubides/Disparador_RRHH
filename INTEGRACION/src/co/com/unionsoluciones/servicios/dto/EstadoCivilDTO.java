package co.com.unionsoluciones.servicios.dto;

import java.io.Serializable;

public class EstadoCivilDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3476541216036840364L;
	private String estadoCivilSOA;
	private String estadoCivilSARA;
	
	public String getEstadoCivilSOA() {
		return estadoCivilSOA;
	}
	public void setEstadoCivilSOA(String estadoCivilSOA) {
		this.estadoCivilSOA = estadoCivilSOA;
	}
	public String getEstadoCivilSARA() {
		return estadoCivilSARA;
	}
	public void setEstadoCivilSARA(String estadoCivilSARA) {
		this.estadoCivilSARA = estadoCivilSARA;
	}
	
	
}