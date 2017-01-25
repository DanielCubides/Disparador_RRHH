package co.com.unionsoluciones.servicios.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ContratoDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3476541216036840364L;
	private String tipoDocumento;
	private String numeroDocumento;
	private String codigoContrato;
	private String vinculacion;
	private String estadoAdministrativo;
	private BigDecimal sueldo;
	private String cargo;
	private Date ingreso;
	private Date retiro;
	private Integer turno;
	private String area;
	private String dependencia;
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getCodigoContrato() {
		return codigoContrato;
	}
	public void setCodigoContrato(String codigoContrato) {
		this.codigoContrato = codigoContrato;
	}
	public String getVinculacion() {
		return vinculacion;
	}
	public void setVinculacion(String vinculacion) {
		this.vinculacion = vinculacion;
	}
	public BigDecimal getSueldo() {
		return sueldo;
	}
	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Date getIngreso() {
		return ingreso;
	}
	public void setIngreso(Date ingreso) {
		this.ingreso = ingreso;
	}
	public Date getRetiro() {
		return retiro;
	}
	public void setRetiro(Date retiro) {
		this.retiro = retiro;
	}
	public Integer getTurno() {
		return turno;
	}
	public void setTurno(Integer turno) {
		this.turno = turno;
	}
	public String getEstadoAdministrativo() {
		return estadoAdministrativo;
	}
	public void setEstadoAdministrativo(String estadoAdministrativo) {
		this.estadoAdministrativo = estadoAdministrativo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDependencia() {
		return dependencia;
	}
	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}
}
