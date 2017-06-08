/**
 * ServicioGestionEmpleadoSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package co.edu.unal.interoperabilidad.ws.gestionempleado;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.commons.lang.StringUtils;

import co.com.unionsoluciones.servicios.dto.CiudadDTO;
import co.com.unionsoluciones.servicios.dto.ContratoDTO;
import co.com.unionsoluciones.servicios.dto.DocumentoDTO;
import co.com.unionsoluciones.servicios.dto.EmpleadoDTO;
import co.com.unionsoluciones.servicios.dto.EstadoAdministrativoDTO;
import co.com.unionsoluciones.servicios.dto.EstadoCivilDTO;
import co.com.unionsoluciones.servicios.dto.PaisDTO;
import co.com.unionsoluciones.servicios.dto.SedeDTO;
import co.com.unionsoluciones.servicios.seguridad.DataSourceIbatis;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.NomTercero_type0;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoArea;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoCabeceraContrato;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoCadenaVacia;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoCargoEmpleado;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoCodContrato;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoCorreoE;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoDedicacion;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoDependencia;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoDetalleContrato;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoDireccionFisica;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoEmpleado;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoEstadoAdministrativo;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoEstadoCivil;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFecha;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFechaHora;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFechaVacio;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoGenerotercero;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdCiudad;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdMoneda;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdPais;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdSede;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdSistema;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoIdTercero;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoInfoBasicaPersonal;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoInfoContacto;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoInfoContrato;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoInfoMensaje;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoInfoTributariaTercero;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoMontoMonetario;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoMsjDetalleContratos;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoMsjGenericoSequence;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoMsjGenericoSequence2;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoMsjGenericoSequence3;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoMsjGenericoSequenceE;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoMsjRespuestaCabeceraContratos;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoMsjRespuestaEmpleado;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoMsjTercero;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoNaturalezaTercero;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoNombrePersonaNatural;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoNumeroDocumento;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoNumeroTelefono;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoPrimerNombre;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoSegundoApellido;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoSegundoNombre;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTercero;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTerceroSequence;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTipoContribuyente;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTipoDocumento;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTipoTercero;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoTipoVinculacion;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoUbicacion;
import co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoValorMonetario;



/**
 * ServicioGestionEmpleadoSkeleton java skeleton for the axisService
 */
public class ServicioGestionEmpleadoSkeleton {

	EntityManager entity = new EntityManager();
	/**
	 * Auto generated method signature
	 * 
	 * @param elemConsultaPorTipoVinculacion
	 * @return elemRespuestaCabeceraContratos
	 */

	public co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos opConsultaPorTipoVinculacion(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion elemConsultaPorTipoVinculacion) throws Exception{
		ElemRespuestaCabeceraContratos elemRespuestaCabeceraContratos=new ElemRespuestaCabeceraContratos();
	    TipoMsjRespuestaCabeceraContratos tipoMsjRespuestaCabeceraContratos = new TipoMsjRespuestaCabeceraContratos();
	     
		TipoMsjGenericoSequenceE[] listaCabeceraContrato=null;

		List<ContratoDTO> listaContrato=new ArrayList<ContratoDTO>();
		TipoMsjGenericoSequenceE tipoMsjGenericoSequenceE;
		
		listaContrato=new ArrayList<ContratoDTO>();
		for(TipoMsjGenericoSequence3 unaVinculacion:elemConsultaPorTipoVinculacion.getElemConsultaPorTipoVinculacion().getTipoMsjGenericoSequence()){
			ContratoDTO contratoDTO=new ContratoDTO();
			contratoDTO.setVinculacion(unaVinculacion.getElemTipoVinculacion().getValue());
			listaContrato.addAll((List<ContratoDTO>) entity.queryForList(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerContratoTerceroUNAL", contratoDTO));
		}	
		
		if(listaContrato != null && listaContrato.size()>0){
			listaCabeceraContrato=new TipoMsjGenericoSequenceE[listaContrato.size()];
			int x=0;
			for(ContratoDTO unContrato:listaContrato){
				tipoMsjGenericoSequenceE = new TipoMsjGenericoSequenceE();
				tipoMsjGenericoSequenceE.setElemCabeceraContrato(cargarCabeceraContrato(unContrato));
				listaCabeceraContrato[x] = tipoMsjGenericoSequenceE;
				x++;
			}
		}else{
			listaCabeceraContrato=new TipoMsjGenericoSequenceE[1];
			tipoMsjGenericoSequenceE = new TipoMsjGenericoSequenceE();
			tipoMsjGenericoSequenceE.setElemCabeceraContrato(cargarCabeceraContratoVacia());
			listaCabeceraContrato[0] = tipoMsjGenericoSequenceE;
		}
		
		tipoMsjRespuestaCabeceraContratos.setTipoMsjGenericoSequence(listaCabeceraContrato);
		TipoInfoMensaje msj = cargarInformacion();
		msj.setIdSede(elemConsultaPorTipoVinculacion.getElemConsultaPorTipoVinculacion().getInfoMensaje().getIdSede());
		msj.setIdSistema(elemConsultaPorTipoVinculacion.getElemConsultaPorTipoVinculacion().getInfoMensaje().getIdSistema());
		tipoMsjRespuestaCabeceraContratos.setInfoMensaje(msj);
		elemRespuestaCabeceraContratos.setElemRespuestaCabeceraContratos(tipoMsjRespuestaCabeceraContratos);
		return elemRespuestaCabeceraContratos;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param elemConsultaTercero
	 * @return elemRespuestaEmpleado
	 */

	public co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado opConsultaInformacionEmpleado(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero elemConsultaTercero) throws Exception{
		ElemRespuestaEmpleado elemRespuestaEmpleado = new ElemRespuestaEmpleado();
		TipoMsjRespuestaEmpleado tipoMsjRespuestaEmpleado=new TipoMsjRespuestaEmpleado();
		TipoEmpleado tipoEmpleado = new TipoEmpleado();
		
		DocumentoDTO documento= new DocumentoDTO();
		documento.setDocumentoSoa(elemConsultaTercero.getElemConsultaTercero().getIdTercero().getTipoDocumento().getValue());
		documento = (DocumentoDTO) entity.queryForObject(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerTipoDocumentoUNAL", documento);
			
		if(documento == null){
		  throw new Exception("no existe documento homologado");
		}
		
		EmpleadoDTO empleadoDTO=new EmpleadoDTO();
		empleadoDTO.setTipoDocumento(documento.getDocumentoSara());
		empleadoDTO.setNumeroDocumento(elemConsultaTercero.getElemConsultaTercero().getIdTercero().getNumeroDocumento().toString());
		empleadoDTO = (EmpleadoDTO) entity.queryForObject(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerTerceroUNAL", empleadoDTO); 
			
		if(empleadoDTO == null){
			tipoEmpleado.setInfoBasicaTercero(cargarTipoInformacionBasicaPersonalVacia());
			tipoEmpleado.setInfoContacto(cargarContactoVacio());
			tipoEmpleado.setInfoTributaria(cargarInfoTributario());
		}else{
			tipoEmpleado.setInfoBasicaTercero(cargarTipoInformacionBasicaPersonal(empleadoDTO,elemConsultaTercero.getElemConsultaTercero().getIdTercero()));
			tipoEmpleado.setInfoContacto(cargarContacto(empleadoDTO));
			tipoEmpleado.setInfoTributaria(cargarInfoTributario());
		}
			
		List<ContratoDTO> listaContrato=new ArrayList<ContratoDTO>();
		ContratoDTO contratoDTO=new ContratoDTO();
		contratoDTO.setTipoDocumento(documento.getDocumentoSara());
		contratoDTO.setNumeroDocumento(elemConsultaTercero.getElemConsultaTercero().getIdTercero().getNumeroDocumento().toString());
		
		listaContrato = (List<ContratoDTO>) entity.queryForList(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerContratoTerceroUNAL", contratoDTO);
			
		TipoInfoContrato tipoInfoContrato=new TipoInfoContrato();
		TipoTerceroSequence tipoTerceroSequence;
		
		TipoTerceroSequence[] listaTipoTercero=null;
		if(listaContrato != null && listaContrato.size()>0){
			listaTipoTercero=new TipoTerceroSequence[listaContrato.size()];
			int x=0;
			for (ContratoDTO unContrato:listaContrato) {
				tipoInfoContrato=new TipoInfoContrato();
				tipoInfoContrato.setCabeceraContrato(cargarCabeceraContrato(unContrato));
				tipoInfoContrato.setDetalleContrato(cargarDetalleContrato(unContrato));
				tipoTerceroSequence=new TipoTerceroSequence();
				tipoTerceroSequence.setVinculacion(tipoInfoContrato);
				listaTipoTercero[x]=tipoTerceroSequence;
				x++;		
				
			}
		}else{
			listaTipoTercero=new TipoTerceroSequence[1];
			tipoInfoContrato=new TipoInfoContrato();
			tipoInfoContrato.setCabeceraContrato(cargarCabeceraContratoVacia());
			tipoInfoContrato.setDetalleContrato(cargarDetalleContratoVacio());
			tipoTerceroSequence=new TipoTerceroSequence();
			tipoTerceroSequence.setVinculacion(tipoInfoContrato);
			listaTipoTercero[0] = tipoTerceroSequence;
		}
		
		tipoEmpleado.setTipoTerceroSequence(listaTipoTercero);	
		tipoMsjRespuestaEmpleado.setEmpleado(tipoEmpleado);
		TipoInfoMensaje msj = cargarInformacion();
		msj.setIdSede(elemConsultaTercero.getElemConsultaTercero().getInfoMensaje().getIdSede());
		msj.setIdSistema(elemConsultaTercero.getElemConsultaTercero().getInfoMensaje().getIdSistema());
		tipoMsjRespuestaEmpleado.setInfoMensaje(msj);
		elemRespuestaEmpleado.setElemRespuestaEmpleado(tipoMsjRespuestaEmpleado);
		return elemRespuestaEmpleado;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param elemConsultaEmpleadoPorIdTercero
	 * @return elemRespuestaConsultaTercero
	 */

	public co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero opConsultaEmpleadoTerceroPorId(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero elemConsultaEmpleadoPorIdTercero) throws Exception{
		ElemRespuestaConsultaTercero elemRespuestaConsultaTercero= new ElemRespuestaConsultaTercero();
		TipoMsjTercero tipoMsjTercero=new TipoMsjTercero();
		TipoTercero tipoTercero=new TipoTercero();
			
		DocumentoDTO documento= new DocumentoDTO();
		documento.setDocumentoSoa(elemConsultaEmpleadoPorIdTercero.getElemConsultaEmpleadoPorIdTercero().getIdTercero().getTipoDocumento().getValue());
		documento = (DocumentoDTO) entity.queryForObject(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerTipoDocumentoUNAL", documento);
			
		if(documento == null){
		  throw new Exception("no existe documento homologado");
		}
			
		EmpleadoDTO empleadoDTO=new EmpleadoDTO();
		empleadoDTO.setTipoDocumento(documento.getDocumentoSara());
		empleadoDTO.setNumeroDocumento(elemConsultaEmpleadoPorIdTercero.getElemConsultaEmpleadoPorIdTercero().getIdTercero().getNumeroDocumento().toString());
		empleadoDTO = (EmpleadoDTO) entity.queryForObject(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerTerceroUNAL", empleadoDTO); 
		
		TipoMsjGenericoSequence[] listaTipoMsjGenericoSequence=new TipoMsjGenericoSequence[1];
		TipoMsjGenericoSequence tipoMsjGenericoSequence;
		if(empleadoDTO != null){
			tipoTercero.setInfoBasicaTercero(cargarTipoInformacionBasicaPersonal(empleadoDTO,elemConsultaEmpleadoPorIdTercero.getElemConsultaEmpleadoPorIdTercero().getIdTercero()));
			tipoTercero.setInfoContacto(cargarContacto(empleadoDTO));
			tipoTercero.setInfoTributaria(cargarInfoTributario());
			tipoMsjGenericoSequence = new TipoMsjGenericoSequence();
			tipoMsjGenericoSequence.setTercero(tipoTercero);
			listaTipoMsjGenericoSequence[0]=tipoMsjGenericoSequence;
		}else{
			tipoTercero.setInfoBasicaTercero(cargarTipoInformacionBasicaPersonalVacia());
			tipoTercero.setInfoContacto(cargarContactoVacio());
			tipoTercero.setInfoTributaria(cargarInfoTributario());
			tipoMsjGenericoSequence = new TipoMsjGenericoSequence();
			tipoMsjGenericoSequence.setTercero(tipoTercero);
			listaTipoMsjGenericoSequence[0]=tipoMsjGenericoSequence;
		}
		
		tipoMsjTercero.setTipoMsjGenericoSequence(listaTipoMsjGenericoSequence);
		TipoInfoMensaje msj = cargarInformacion();
		msj.setIdSede(elemConsultaEmpleadoPorIdTercero.getElemConsultaEmpleadoPorIdTercero().getInfoMensaje().getIdSede());
		msj.setIdSistema(elemConsultaEmpleadoPorIdTercero.getElemConsultaEmpleadoPorIdTercero().getInfoMensaje().getIdSistema());
		tipoMsjTercero.setInfoMensaje(msj);
		elemRespuestaConsultaTercero.setElemRespuestaConsultaTercero(tipoMsjTercero);
		return elemRespuestaConsultaTercero;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param elemConsultaEmpleadoPorIdTercero0
	 * @return elemRespuestaConsultaDetalleEmpleado
	 */

	public co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado opConsultaContratoEmpleado(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero elemConsultaEmpleadoPorIdTercero0) throws Exception{
		ElemRespuestaConsultaDetalleEmpleado elemRespuestaConsultaDetalleEmpleado= new ElemRespuestaConsultaDetalleEmpleado();
		TipoMsjDetalleContratos tipoMsjDetalleContratos= new TipoMsjDetalleContratos();
		EntityManager entity= new EntityManager();
			
		DocumentoDTO documento= new DocumentoDTO();
		documento.setDocumentoSoa(elemConsultaEmpleadoPorIdTercero0.getElemConsultaEmpleadoPorIdTercero().getIdTercero().getTipoDocumento().getValue());
		documento = (DocumentoDTO) entity.queryForObject(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerTipoDocumentoUNAL", documento);
			
		if(documento == null){
		  throw new Exception("no existe documento homologado");
		}
			
		List<ContratoDTO> listaContrato=new ArrayList<ContratoDTO>();
		ContratoDTO contratoDTO=new ContratoDTO();
		contratoDTO.setTipoDocumento(documento.getDocumentoSara());
		contratoDTO.setNumeroDocumento(elemConsultaEmpleadoPorIdTercero0.getElemConsultaEmpleadoPorIdTercero().getIdTercero().getNumeroDocumento().toString());
		listaContrato = (List<ContratoDTO>) entity.queryForList(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerContratoTerceroUNAL", contratoDTO);
		
		TipoMsjGenericoSequence2[] listaTipoMsjGenericoSequence2=null;
		TipoMsjGenericoSequence2 tipoMsjGenericoSequence2;
		if(listaContrato != null && listaContrato.size()>0){
			listaTipoMsjGenericoSequence2=new TipoMsjGenericoSequence2[listaContrato.size()];
			int x=0;
			for (ContratoDTO unContrato:listaContrato) {
				tipoMsjGenericoSequence2 = new  TipoMsjGenericoSequence2();
				tipoMsjGenericoSequence2.setElemDetallesContratos(cargarDetalleContrato(unContrato));
				listaTipoMsjGenericoSequence2[x]=tipoMsjGenericoSequence2;
				x++;
			}
		}else{
			listaTipoMsjGenericoSequence2=new TipoMsjGenericoSequence2[1];
			tipoMsjGenericoSequence2 = new  TipoMsjGenericoSequence2();
			tipoMsjGenericoSequence2.setElemDetallesContratos(cargarDetalleContratoVacio());
			listaTipoMsjGenericoSequence2[0]=tipoMsjGenericoSequence2;
		}
		tipoMsjDetalleContratos.setTipoMsjGenericoSequence(listaTipoMsjGenericoSequence2);
		TipoInfoMensaje msj = cargarInformacion();
		msj.setIdSede(elemConsultaEmpleadoPorIdTercero0.getElemConsultaEmpleadoPorIdTercero().getInfoMensaje().getIdSede());
		msj.setIdSistema(elemConsultaEmpleadoPorIdTercero0.getElemConsultaEmpleadoPorIdTercero().getInfoMensaje().getIdSistema());
		tipoMsjDetalleContratos.setInfoMensaje(msj);
		elemRespuestaConsultaDetalleEmpleado.setElemRespuestaConsultaDetalleEmpleado(tipoMsjDetalleContratos);
		return elemRespuestaConsultaDetalleEmpleado;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param elemConsultaCabeceraContrato
	 * @return elemRespuestaCabeceraContratos1
	 */

	public co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos opConsultaCabeceraContratos(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato elemConsultaCabeceraContrato) throws Exception{
		ElemRespuestaCabeceraContratos elemRespuestaCabeceraContratos= new ElemRespuestaCabeceraContratos();
		TipoMsjRespuestaCabeceraContratos tipoMsjRespuestaCabeceraContratos=new TipoMsjRespuestaCabeceraContratos();
		
		TipoMsjGenericoSequenceE[] listaTipoCabeceraContrato=null;
		
		
		DocumentoDTO documento= new DocumentoDTO();
		documento.setDocumentoSoa(elemConsultaCabeceraContrato.getElemConsultaCabeceraContrato().getIdTercero().getTipoDocumento().getValue());
		documento = (DocumentoDTO) entity.queryForObject(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerTipoDocumentoUNAL", documento);
			
		if(documento == null){
		  throw new Exception("no existe documento homologado");
		}
		TipoMsjGenericoSequenceE tipoMsjGenericoSequenceE;
		List<ContratoDTO> listaContrato=new ArrayList<ContratoDTO>();
		ContratoDTO contratoDTO=new ContratoDTO();
		contratoDTO.setTipoDocumento(documento.getDocumentoSara());
		contratoDTO.setNumeroDocumento(elemConsultaCabeceraContrato.getElemConsultaCabeceraContrato().getIdTercero().getNumeroDocumento().toString());
		listaContrato = (List<ContratoDTO>) entity.queryForList(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerContratoTerceroUNAL", contratoDTO);
		
		if(listaContrato != null && listaContrato.size()>0){
			int x=0;
			listaTipoCabeceraContrato=new TipoMsjGenericoSequenceE[listaContrato.size()];
			for (ContratoDTO unContrato:listaContrato) {
				tipoMsjGenericoSequenceE = new TipoMsjGenericoSequenceE();
				tipoMsjGenericoSequenceE.setElemCabeceraContrato(cargarCabeceraContrato(unContrato));
				listaTipoCabeceraContrato[x] = tipoMsjGenericoSequenceE;
				x++;
			}
		}else{
			listaTipoCabeceraContrato=new TipoMsjGenericoSequenceE[1];
			tipoMsjGenericoSequenceE = new TipoMsjGenericoSequenceE();
			tipoMsjGenericoSequenceE.setElemCabeceraContrato(cargarCabeceraContratoVacia());
			listaTipoCabeceraContrato[0] = tipoMsjGenericoSequenceE;
		}
		tipoMsjRespuestaCabeceraContratos.setTipoMsjGenericoSequence(listaTipoCabeceraContrato);
		TipoInfoMensaje msj = cargarInformacion();
		msj.setIdSede(elemConsultaCabeceraContrato.getElemConsultaCabeceraContrato().getInfoMensaje().getIdSede());
		msj.setIdSistema(elemConsultaCabeceraContrato.getElemConsultaCabeceraContrato().getInfoMensaje().getIdSistema());
		tipoMsjRespuestaCabeceraContratos.setInfoMensaje(msj);
		elemRespuestaCabeceraContratos.setElemRespuestaCabeceraContratos(tipoMsjRespuestaCabeceraContratos);
		return elemRespuestaCabeceraContratos;
	}

	private TipoInfoMensaje cargarInformacion() throws DatatypeConfigurationException, Exception {
		TipoInfoMensaje tipoInfoMensaje = new TipoInfoMensaje();

		TipoFechaHora tipoFechaHora = new TipoFechaHora();
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		tipoFechaHora.setTipoFechaHora(c);
		tipoInfoMensaje.setFechaHora(tipoFechaHora);

		//SedeDTO sede = (SedeDTO) entity.queryForObject(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerSedeUNAL", new SedeDTO());
		
		//tipoInfoMensaje.setIdSede(TipoIdSede.Factory.fromValue(sede.getSede()));
		//tipoInfoMensaje.setIdSistema(TipoIdSistema.Factory.fromValue(sede.getAplicativo()));
		return tipoInfoMensaje;
	}

	private TipoInfoContacto cargarContactoVacio() throws Exception {
		TipoInfoContacto tipoInfoContacto = new TipoInfoContacto();

		TipoIdCiudad tipoIdCiudad=new TipoIdCiudad();
		tipoIdCiudad.setTipoIdCiudad("00000000");
		tipoInfoContacto.setCiudadContacto(tipoIdCiudad);
		TipoCorreoE tipoCorreoE=new TipoCorreoE();
		tipoCorreoE.setTipoCorreoE("");
		tipoInfoContacto.setCorreoElectronicoContacto(tipoCorreoE);
		
		TipoDireccionFisica tipoDireccionFisica=new TipoDireccionFisica();
		tipoDireccionFisica.setTipoDireccionFisica("");
		tipoInfoContacto.setDireccionContacto(tipoDireccionFisica);
		
		TipoNumeroTelefono tipoNumeroTelefono=new TipoNumeroTelefono();
		tipoNumeroTelefono.setTipoNumeroTelefono("0");
		tipoInfoContacto.setTelefonoContacto(tipoNumeroTelefono);
		return tipoInfoContacto;
	}
	
	private TipoInfoContacto cargarContacto(EmpleadoDTO empleadoDTO) throws Exception {
		TipoInfoContacto tipoInfoContacto = new TipoInfoContacto();

		if (empleadoDTO.getCiudadResidencia() == null) {
			TipoIdCiudad tipoIdCiudad=new TipoIdCiudad();
			tipoIdCiudad.setTipoIdCiudad("00000000");
			tipoInfoContacto.setCiudadContacto(tipoIdCiudad);
		}else{
			CiudadDTO ciudadDTO = new CiudadDTO();
			ciudadDTO.setCiudadSara(empleadoDTO.getCiudadResidencia());
			ciudadDTO = (CiudadDTO) entity.queryForObject(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerCiudadUNAL", ciudadDTO);
			if (ciudadDTO != null) {
				TipoIdCiudad tipoIdCiudad=new TipoIdCiudad();
				tipoIdCiudad.setTipoIdCiudad(ciudadDTO.getCiudadSoa());
				tipoInfoContacto.setCiudadContacto(tipoIdCiudad);
			}
		}
		TipoCorreoE tipoCorreoE=new TipoCorreoE();
		if(empleadoDTO.getEmail() !=null){
			tipoCorreoE.setTipoCorreoE(empleadoDTO.getEmail());
		}else{
			tipoCorreoE.setTipoCorreoE("");
		}
		tipoInfoContacto.setCorreoElectronicoContacto(tipoCorreoE);
		
		TipoDireccionFisica tipoDireccionFisica=new TipoDireccionFisica();
		if(empleadoDTO.getDireccion() !=null){
			tipoDireccionFisica.setTipoDireccionFisica(empleadoDTO.getDireccion());
		}else{
			tipoDireccionFisica.setTipoDireccionFisica("");
		}
		tipoInfoContacto.setDireccionContacto(tipoDireccionFisica);
		
		TipoNumeroTelefono tipoNumeroTelefono=new TipoNumeroTelefono();
		if(empleadoDTO.getTelefono() != null){
			tipoNumeroTelefono.setTipoNumeroTelefono(empleadoDTO.getTelefono());
		}else{
			tipoNumeroTelefono.setTipoNumeroTelefono("0");
		}
		tipoInfoContacto.setTelefonoContacto(tipoNumeroTelefono);
		return tipoInfoContacto;
	}

	//Este metodo debe ajustarse para la concatenación de los nombres correctamente
	private NomTercero_type0 cargarNombre(EmpleadoDTO empleadoDTO) {
		NomTercero_type0 nombre = new NomTercero_type0();
		TipoNombrePersonaNatural tipoNombrePersonaNatural = new TipoNombrePersonaNatural();
		if (empleadoDTO.getPrimerNombre() != null) {
			String[] datos = empleadoDTO.getPrimerNombre().split(" ");
			TipoPrimerNombre tipoPrimerNombre= new TipoPrimerNombre();
			tipoPrimerNombre.setTipoPrimerNombre(datos[0]);
			tipoNombrePersonaNatural.setPrimerNombre(tipoPrimerNombre);
			System.out.println(datos.length);
			if (datos.length > 1) {
				
				String segundoNombre = "";
				for( int i = 1; i < datos.length; i++)
				{
					segundoNombre = segundoNombre + " " + datos[i]; 
				}
				TipoSegundoNombre tipoSegundoNombre= new TipoSegundoNombre();
				tipoSegundoNombre.setTipoSegundoNombre(segundoNombre);
				tipoNombrePersonaNatural.setSegundoNombre(tipoSegundoNombre);
			}else{
				TipoSegundoNombre tipoSegundoNombre= new TipoSegundoNombre();
				tipoSegundoNombre.setTipoSegundoNombre("");
				tipoNombrePersonaNatural.setSegundoNombre(tipoSegundoNombre);
			}
		}
		TipoPrimerNombre tipoPrimerNombre= new TipoPrimerNombre();
		if(empleadoDTO.getPrimerApellido()!=null){
		    tipoPrimerNombre.setTipoPrimerNombre(empleadoDTO.getPrimerApellido());
		}else{
			tipoPrimerNombre.setTipoPrimerNombre("");
		}
		tipoNombrePersonaNatural.setPrimerApellido(tipoPrimerNombre);
		
		TipoSegundoApellido tipoSegundoApellido=new TipoSegundoApellido();
		if(empleadoDTO.getSegundoApellido()!=null){
			tipoSegundoApellido.setTipoSegundoApellido(empleadoDTO.getSegundoApellido());
		}else{
			tipoSegundoApellido.setTipoSegundoApellido("");
		}
		tipoNombrePersonaNatural.setSegundoApellido(tipoSegundoApellido);
		
		nombre.setNombrePersonaNatural(tipoNombrePersonaNatural);
		return nombre;
	}

	private NomTercero_type0 cargarNombreVacio() {
		NomTercero_type0 nombre = new NomTercero_type0();
		TipoNombrePersonaNatural tipoNombrePersonaNatural = new TipoNombrePersonaNatural();
		TipoPrimerNombre tipoPrimerNombre= new TipoPrimerNombre();
		tipoPrimerNombre.setTipoPrimerNombre(" ");
		tipoNombrePersonaNatural.setPrimerNombre(tipoPrimerNombre);
		TipoSegundoNombre tipoSegundoNombre= new TipoSegundoNombre();
		tipoSegundoNombre.setTipoSegundoNombre("");
		tipoNombrePersonaNatural.setSegundoNombre(tipoSegundoNombre);
		
		tipoPrimerNombre= new TipoPrimerNombre();
		tipoPrimerNombre.setTipoPrimerNombre(" ");
		tipoNombrePersonaNatural.setPrimerApellido(tipoPrimerNombre);
		
		TipoSegundoApellido tipoSegundoApellido=new TipoSegundoApellido();
		tipoSegundoApellido.setTipoSegundoApellido("");
		tipoNombrePersonaNatural.setSegundoApellido(tipoSegundoApellido);
		
		nombre.setNombrePersonaNatural(tipoNombrePersonaNatural);
		return nombre;
	}
	
	private TipoInfoTributariaTercero cargarInfoTributario() {
		TipoInfoTributariaTercero tipoInfoTributariaTercero = new TipoInfoTributariaTercero();
		tipoInfoTributariaTercero.setTipoTercero(TipoTipoTercero.EM);
		tipoInfoTributariaTercero.setTipoContribuyente(TipoTipoContribuyente.RS);
		return tipoInfoTributariaTercero;
	}

	private TipoUbicacion cargarTipoUbicacionVacia() throws Exception {
		TipoUbicacion tipoUbicacion = new TipoUbicacion();
		TipoIdCiudad tipoIdCiudad=new TipoIdCiudad();
		tipoIdCiudad.setTipoIdCiudad("00000000");
		tipoUbicacion.setIdCiudad(tipoIdCiudad);
		tipoUbicacion.setIdPais(TipoIdPais.Factory.fromValue("000"));
		return tipoUbicacion;
	}
	
	private TipoUbicacion cargarTipoUbicacion(String ubicacion) throws Exception {
		TipoUbicacion tipoUbicacion = new TipoUbicacion();

		if(ubicacion == null){
			TipoIdCiudad tipoIdCiudad=new TipoIdCiudad();
			tipoIdCiudad.setTipoIdCiudad("00000000");
			tipoUbicacion.setIdCiudad(tipoIdCiudad);
			tipoUbicacion.setIdPais(TipoIdPais.Factory.fromValue("000"));
			return tipoUbicacion;
		}
		
		PaisDTO paisDTO = new PaisDTO();
		paisDTO.setUbicacion(StringUtils.isBlank(ubicacion) ? ubicacion : StringUtils.rightPad(ubicacion, 8));
		paisDTO = (PaisDTO) entity.queryForObject(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerPaisUNAL", paisDTO);
		if (paisDTO != null) {
			tipoUbicacion.setIdPais(TipoIdPais.Factory.fromValue(paisDTO.getPaisSoa()));
		}else{
			throw new Exception("no existe pais homologado");
		}

		CiudadDTO ciudadDTO = new CiudadDTO();
		ciudadDTO.setCiudadSara(StringUtils.isBlank(ubicacion) ? ubicacion : StringUtils.rightPad(ubicacion, 8));
		ciudadDTO = (CiudadDTO) entity.queryForObject(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerCiudadUNAL", ciudadDTO);
		if (ciudadDTO != null) {
			TipoIdCiudad tipoIdCiudad=new TipoIdCiudad();
			tipoIdCiudad.setTipoIdCiudad(ciudadDTO.getCiudadSoa());
			tipoUbicacion.setIdCiudad(tipoIdCiudad);
		}else{
			throw new Exception("no existe ciudad homologada");
		}
		return tipoUbicacion;
	}

	private TipoInfoBasicaPersonal cargarTipoInformacionBasicaPersonal(EmpleadoDTO empleadoDTO, TipoIdTercero tipoIdTercero) throws Exception {
		TipoInfoBasicaPersonal tipoInfoBasicaPersonal = new TipoInfoBasicaPersonal();
		TipoIdTercero tipoId = new TipoIdTercero();
		tipoId.setTipoDocumento(tipoIdTercero.getTipoDocumento());
		tipoId.setNumeroDocumento(tipoIdTercero.getNumeroDocumento());

		EstadoCivilDTO estadoCivilDTO = new EstadoCivilDTO();
		estadoCivilDTO.setEstadoCivilSARA(empleadoDTO.getEstadoCivil());
		estadoCivilDTO = (EstadoCivilDTO) entity.queryForObject(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerEstadoCivilUNAL", estadoCivilDTO);

		if(estadoCivilDTO ==null){
			throw new Exception("no existe estado civil homologado");
		}
		tipoInfoBasicaPersonal.setIdTercero(tipoId);
		tipoInfoBasicaPersonal.setGeneroTercero(TipoGenerotercero.Factory.fromValue(empleadoDTO.getGenero()));
		tipoInfoBasicaPersonal.setNomTercero(cargarNombre(empleadoDTO));
		tipoInfoBasicaPersonal.setNaturalezaTercero(TipoNaturalezaTercero.Factory.fromValue("NAT"));
		tipoInfoBasicaPersonal.setEstadoCivil(TipoEstadoCivil.Factory.fromValue(estadoCivilDTO.getEstadoCivilSOA()));
		tipoInfoBasicaPersonal.setLugarNacimiento(cargarTipoUbicacion(empleadoDTO.getLugarNacimiento()));
		tipoInfoBasicaPersonal.setLugarResidencia(cargarTipoUbicacion(empleadoDTO.getCiudadResidencia()));

		if (empleadoDTO.getNacimiento() != null) {
			TipoFecha tipoFecha = new TipoFecha();
			tipoFecha.setTipoFecha(empleadoDTO.getNacimiento());
			tipoInfoBasicaPersonal.setFechaNacimiento(tipoFecha);
		}
		return tipoInfoBasicaPersonal;
	}
	
	private TipoInfoBasicaPersonal cargarTipoInformacionBasicaPersonalVacia() throws Exception {
		TipoInfoBasicaPersonal tipoInfoBasicaPersonal = new TipoInfoBasicaPersonal();
		TipoIdTercero tipoId = new TipoIdTercero();
		tipoId.setTipoDocumento(TipoTipoDocumento.CC);
		TipoNumeroDocumento tipoNumeroDocumento=new TipoNumeroDocumento();
		tipoNumeroDocumento.setTipoNumeroDocumento("000");
		tipoId.setNumeroDocumento(tipoNumeroDocumento);
		tipoInfoBasicaPersonal.setIdTercero(tipoId);
		tipoInfoBasicaPersonal.setGeneroTercero(TipoGenerotercero.Factory.fromValue("O"));
		tipoInfoBasicaPersonal.setNomTercero(cargarNombreVacio());
		tipoInfoBasicaPersonal.setNaturalezaTercero(TipoNaturalezaTercero.Factory.fromValue("NAT"));
		tipoInfoBasicaPersonal.setEstadoCivil(TipoEstadoCivil.Factory.fromValue("C"));
		tipoInfoBasicaPersonal.setLugarNacimiento(cargarTipoUbicacionVacia());
		tipoInfoBasicaPersonal.setLugarResidencia(cargarTipoUbicacionVacia());

		TipoFecha tipoFecha = new TipoFecha();
		tipoFecha.setTipoFecha(new Date());
		tipoInfoBasicaPersonal.setFechaNacimiento(tipoFecha);
		
		return tipoInfoBasicaPersonal;
	}

	private TipoDetalleContrato cargarDetalleContrato(ContratoDTO contrato) throws Exception {
		TipoDetalleContrato tipoDetalleContrato = new TipoDetalleContrato();
		TipoMontoMonetario tipoMontoMonetario = new TipoMontoMonetario();
		tipoMontoMonetario.setIdMoneda(TipoIdMoneda.Factory.fromValue("COP"));
		
		TipoValorMonetario tipoValorMonetario= new TipoValorMonetario();
		tipoValorMonetario.setTipoValorMonetario(contrato.getSueldo());
		tipoMontoMonetario.setValor(tipoValorMonetario);
		tipoDetalleContrato.setAsignacionBasica(tipoMontoMonetario);
		System.out.print("Asignación Basica: " + tipoDetalleContrato.getAsignacionBasica().getValor());
		tipoDetalleContrato.setCargoEmpleado(TipoCargoEmpleado.Factory.fromValue(contrato.getCargo().trim()));
		tipoDetalleContrato.setDedicacion(TipoDedicacion.Factory.fromValue(new Integer(contrato.getTurno())));

		
		if (contrato.getIngreso() != null) {
			TipoFecha tipoFecha = new TipoFecha();
			tipoFecha.setTipoFecha(contrato.getIngreso());
			tipoDetalleContrato.setFechaInicio(tipoFecha);
		}
		
		TipoFechaVacio tipoFechaVacio = new TipoFechaVacio();
		if (contrato.getRetiro() != null) {
			Calendar fecha = Calendar.getInstance();
			fecha.setTime(contrato.getRetiro());
			tipoFechaVacio.setObject(fecha);
			tipoDetalleContrato.setFechaFin(tipoFechaVacio);
		}else{
			tipoFechaVacio.setObject(TipoCadenaVacia.Factory.fromValue(""));
		}
		tipoDetalleContrato.setFechaFin(tipoFechaVacio);
		return tipoDetalleContrato;
	}
	
	private TipoDetalleContrato cargarDetalleContratoVacio() throws Exception {
		TipoDetalleContrato tipoDetalleContrato = new TipoDetalleContrato();
		TipoMontoMonetario tipoMontoMonetario = new TipoMontoMonetario();
		tipoMontoMonetario.setIdMoneda(TipoIdMoneda.Factory.fromValue("COP"));
		
		TipoValorMonetario tipoValorMonetario= new TipoValorMonetario();
		tipoValorMonetario.setTipoValorMonetario(new BigDecimal(0));
		tipoMontoMonetario.setValor(tipoValorMonetario);
		tipoDetalleContrato.setAsignacionBasica(tipoMontoMonetario);
		
		
		tipoDetalleContrato.setCargoEmpleado(TipoCargoEmpleado.Factory.fromValue("001000"));
		tipoDetalleContrato.setDedicacion(TipoDedicacion.Factory.fromValue(new Integer(1)));
		
		TipoFecha tipoFecha = new TipoFecha();
		tipoFecha.setTipoFecha(new Date());
		tipoDetalleContrato.setFechaInicio(tipoFecha);
		
		TipoFechaVacio tipoFechaVacio = new TipoFechaVacio();
		tipoFechaVacio.setObject(TipoCadenaVacia.Factory.fromValue(""));
		tipoDetalleContrato.setFechaFin(tipoFechaVacio);
		return tipoDetalleContrato;
	}

	private TipoCabeceraContrato cargarCabeceraContrato(ContratoDTO contrato) throws Exception {
		TipoCabeceraContrato tipoCabeceraContrato = new TipoCabeceraContrato();
		TipoCodContrato tipoCodContrato=new TipoCodContrato();
		tipoCodContrato.setTipoCodContrato(contrato.getCodigoContrato());
		tipoCabeceraContrato.setCodContrato(tipoCodContrato);
		tipoCabeceraContrato.setTipoVinculacion(TipoTipoVinculacion.Factory.fromValue(contrato.getVinculacion()));
		
		if (contrato.getEstadoAdministrativo() != null) {
			EstadoAdministrativoDTO estadoAdministrativoDTO = new EstadoAdministrativoDTO();
			estadoAdministrativoDTO.setEstadoAdministrativoSARA(contrato.getEstadoAdministrativo());
			estadoAdministrativoDTO = (EstadoAdministrativoDTO) entity.queryForObject(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerEstadoAdministrativoUNAL", estadoAdministrativoDTO);
			
			if(estadoAdministrativoDTO == null){
				throw new Exception("no existe estado administrativo homologado");
			}
			
			tipoCabeceraContrato.setEstadoAdministrativo(TipoEstadoAdministrativo.Factory.fromValue(estadoAdministrativoDTO.getEstadoAdministrativoSOA()));
		} else {
			tipoCabeceraContrato.setEstadoAdministrativo(TipoEstadoAdministrativo.NOR);
		}
		
		TipoArea tipoArea=new TipoArea();
		tipoArea.setTipoArea(contrato.getArea());
		tipoCabeceraContrato.setArea(tipoArea);
		System.out.println("Area " + tipoCabeceraContrato.getArea() );
		
		TipoDependencia tipoDependencia=new TipoDependencia();
		tipoDependencia.setTipoDependencia(contrato.getDependencia().trim());
		System.out.println("Dependencia1 " + contrato.getDependencia().trim() );
		tipoCabeceraContrato.setDependencia(tipoDependencia);
		System.out.println("Dependencia " + tipoCabeceraContrato.getDependencia() );
		return tipoCabeceraContrato;
	}
	
	private TipoCabeceraContrato cargarCabeceraContratoVacia(){
		TipoCabeceraContrato tipoCabeceraContrato = new TipoCabeceraContrato();
		TipoCodContrato tipoCodContrato=new TipoCodContrato();
		tipoCodContrato.setTipoCodContrato("0");
		tipoCabeceraContrato.setCodContrato(tipoCodContrato);
		tipoCabeceraContrato.setTipoVinculacion(TipoTipoVinculacion.Factory.fromValue("0"));
		tipoCabeceraContrato.setEstadoAdministrativo(TipoEstadoAdministrativo.NOR);
		
		TipoArea tipoArea=new TipoArea();
		tipoArea.setTipoArea("0");
		tipoCabeceraContrato.setArea(tipoArea);
		
		TipoDependencia tipoDependencia=new TipoDependencia();
		tipoDependencia.setTipoDependencia("0");
		tipoCabeceraContrato.setDependencia(tipoDependencia);
		return tipoCabeceraContrato;
	}
	
}
