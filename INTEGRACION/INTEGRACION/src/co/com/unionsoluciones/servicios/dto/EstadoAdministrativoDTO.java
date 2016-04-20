package co.com.unionsoluciones.servicios.dto;

import java.io.Serializable;

public class EstadoAdministrativoDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3476541216036840364L;
	private String estadoAdministrativoSOA;
	private String estadoAdministrativoSARA;
	
	public String getEstadoAdministrativoSOA() {
		return estadoAdministrativoSOA;
	}
	public void setEstadoAdministrativoSOA(String estadoAdministrativoSOA) {
		this.estadoAdministrativoSOA = estadoAdministrativoSOA;
	}
	public String getEstadoAdministrativoSARA() {
		return estadoAdministrativoSARA;
	}
	public void setEstadoAdministrativoSARA(String estadoAdministrativoSARA) {
		this.estadoAdministrativoSARA = estadoAdministrativoSARA;
	}

	
	

}