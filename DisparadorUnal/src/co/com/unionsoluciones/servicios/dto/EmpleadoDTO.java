package co.com.unionsoluciones.servicios.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EmpleadoDTO implements Serializable, Comparable<EmpleadoDTO> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2453728521465557326L;
	private BigDecimal contrato;
	private BigDecimal cedula;
	private String tipoDocumento;
	private String tipoDocumentoSoa;
	private String unidad;
	private String zonaEconomica;
	private String centroCosto;
	private String cargo;
	private Integer vinculacion;
	private Date fechaIngreso;
	private Date fechaRetiro;
	private Date fechaEngache;
	private Date fechaTermina;
	private Integer numeroProrroga;
	private BigDecimal asignacion;
	private Date fechaVigencia;
	private BigDecimal totalAsignacion;
	private String estadoLaboral;
	private String lineaCosto;
	private Integer tipoPeriodo;
	private Integer turno;
	private Integer turnoFuncion;
	private Date fechaLiquidacion;
	private String cargoFuncion;
	private String unidadFuncion;
	private Integer empresa;
	private String ubicacionfisica;
	private BigDecimal cupo;
	private String alterno;
	private Date congela;
	private BigDecimal contratoAnt;
	private Integer empresaAnt;
	
	// Datos para el criterio de selección de la consulta de la base de datos
	private Date fechaInicial;
	private Date fechaFinal;
	
	
	// Datos para la revisión de las fechas de adición y Modificación del contrato
	private Date adicionado;
	private Date modificado;
	private Date modificadohv;

	public BigDecimal getContrato() {
		return contrato;
	}

	public void setContrato(BigDecimal contrato) {
		this.contrato = contrato;
	}

	public BigDecimal getCedula() {
		return cedula;
	}

	public void setCedula(BigDecimal cedula) {
		this.cedula = cedula;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getZonaEconomica() {
		return zonaEconomica;
	}

	public void setZonaEconomica(String zonaEconomica) {
		this.zonaEconomica = zonaEconomica;
	}

	public String getCentroCosto() {
		return centroCosto;
	}

	public void setCentroCosto(String centroCosto) {
		this.centroCosto = centroCosto;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Integer getVinculacion() {
		return vinculacion;
	}

	public void setVinculacion(Integer vinculacion) {
		this.vinculacion = vinculacion;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(Date fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

	public Date getFechaEngache() {
		return fechaEngache;
	}

	public void setFechaEngache(Date fechaEngache) {
		this.fechaEngache = fechaEngache;
	}

	public Date getFechaTermina() {
		return fechaTermina;
	}

	public void setFechaTermina(Date fechaTermina) {
		this.fechaTermina = fechaTermina;
	}

	public Integer getNumeroProrroga() {
		return numeroProrroga;
	}

	public void setNumeroProrroga(Integer numeroProrroga) {
		this.numeroProrroga = numeroProrroga;
	}

	public BigDecimal getAsignacion() {
		return asignacion;
	}

	public void setAsignacion(BigDecimal asignacion) {
		this.asignacion = asignacion;
	}

	public Date getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	public BigDecimal getTotalAsignacion() {
		return totalAsignacion;
	}

	public void setTotalAsignacion(BigDecimal totalAsignacion) {
		this.totalAsignacion = totalAsignacion;
	}

	public String getEstadoLaboral() {
		return estadoLaboral;
	}

	public void setEstadoLaboral(String estadoLaboral) {
		this.estadoLaboral = estadoLaboral;
	}

	public String getLineaCosto() {
		return lineaCosto;
	}

	public void setLineaCosto(String lineaCosto) {
		this.lineaCosto = lineaCosto;
	}

	public Integer getTipoPeriodo() {
		return tipoPeriodo;
	}

	public void setTipoPeriodo(Integer tipoPeriodo) {
		this.tipoPeriodo = tipoPeriodo;
	}

	public Integer getTurno() {
		return turno;
	}

	public void setTurno(Integer turno) {
		this.turno = turno;
	}

	public Date getFechaLiquidacion() {
		return fechaLiquidacion;
	}

	public void setFechaLiquidacion(Date fechaLiquidacion) {
		this.fechaLiquidacion = fechaLiquidacion;
	}

	public String getCargoFuncion() {
		return cargoFuncion;
	}

	public void setCargoFuncion(String cargoFuncion) {
		this.cargoFuncion = cargoFuncion;
	}

	public String getUnidadFuncion() {
		return unidadFuncion;
	}

	public void setUnidadFuncion(String unidadFuncion) {
		this.unidadFuncion = unidadFuncion;
	}

	public Integer getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Integer empresa) {
		this.empresa = empresa;
	}

	public String getUbicacionfisica() {
		return ubicacionfisica;
	}

	public void setUbicacionfisica(String ubicacionfisica) {
		this.ubicacionfisica = ubicacionfisica;
	}

	public BigDecimal getCupo() {
		return cupo;
	}

	public void setCupo(BigDecimal cupo) {
		this.cupo = cupo;
	}

	public BigDecimal getContratoAnt() {
		return contratoAnt;
	}

	public void setContratoAnt(BigDecimal contratoAnt) {
		this.contratoAnt = contratoAnt;
	}

	public Integer getEmpresaAnt() {
		return empresaAnt;
	}

	public void setEmpresaAnt(Integer empresaAnt) {
		this.empresaAnt = empresaAnt;
	}

	public Integer getTurnoFuncion() {
		return turnoFuncion;
	}

	public void setTurnoFuncion(Integer turnoFuncion) {
		this.turnoFuncion = turnoFuncion;
	}

	public Date getCongela() {
		return congela;
	}

	public void setCongela(Date congela) {
		this.congela = congela;
	}

	public String getAlterno() {
		return alterno;
	}

	public void setAlterno(String alterno) {
		this.alterno = alterno;
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getTipoDocumentoSoa() {
		return tipoDocumentoSoa;
	}

	public void setTipoDocumentoSoa(String tipoDocumentoSoa) {
		this.tipoDocumentoSoa = tipoDocumentoSoa;
	}
	
	
	
	//comparetor to 
	// --------------------------------------------------------------------------------------
	@Override
    public int compareTo(EmpleadoDTO another) {
        if (this.getCedula().compareTo(another.getCedula())< 0 ){
            return -1;
        }else{
            return 1;
        }
    }
	
	@Override
	public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmpleadoDTO)) {
            return false;
        }
        EmpleadoDTO other = (EmpleadoDTO) obj;
        return this.cedula.equals(other.cedula);
    }

	public Date getAdicionado() {
		return adicionado;
	}

	public void setAdicionado(Date adicionado) {
		this.adicionado = adicionado;
	}

	public Date getModificado() {
		return modificado;
	}

	public void setModificado(Date modificado) {
		this.modificado = modificado;
	}

	/**
	 * @return the modificadohv
	 */
	public Date getModificadohv() {
		return modificadohv;
	}

	/**
	 * @param modificadohv the modificadohv to set
	 */
	public void setModificadohv(Date modificadohv) {
		this.modificadohv = modificadohv;
	}

}
