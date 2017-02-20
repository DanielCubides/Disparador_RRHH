package jobs;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import co.com.unionsoluciones.servicios.dto.EmpleadoDTO;
import co.com.unionsoluciones.servicios.dto.SedeDTO;
import co.com.unionsoluciones.servicios.seguridad.DataSourceIbatis;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoFechaHora;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoIdSede;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoIdSistema;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoIdTercero;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoInfoMensaje;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoMsjSolicitudPorIdTercero;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoNumeroDocumento;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoTipoDocumento;
import util.QueueManager;
public class SimpleJob implements Job {
        
		public void execute(JobExecutionContext ctx) throws JobExecutionException {
				
			try{
				EntityManager entity = new EntityManager();
				Calendar calendar=Calendar.getInstance();				
				calendar.setTime(calendar.getTime());
				calendar.add(Calendar.DATE, -3);
				calendar.set(Calendar.HOUR_OF_DAY, 0);
				calendar.set(Calendar.MINUTE, 0);
				calendar.set(Calendar.SECOND, 0);
				calendar.set(Calendar.MILLISECOND, 0);
			    
				EmpleadoDTO unEmpleadoDTO= new EmpleadoDTO();
				unEmpleadoDTO.setFechaInicial(calendar.getTime());
				
				System.out.println("--------------INICIO REPLICACION----------------------");
				System.out.println("Fecha Inicial:" + unEmpleadoDTO.getFechaInicial());
				

				calendar=Calendar.getInstance();
				unEmpleadoDTO.setFechaFinal(calendar.getTime());
				
				System.out.println("Fecha Final:" + unEmpleadoDTO.getFechaFinal());
        	
				
				
				ServicioGestionGeneralTerceroStub customer = null;
				ServicioGestionGeneralTerceroStub.ElemConsultaEmpleadoPorIdTercero request = null;
				ServicioGestionGeneralTerceroStub.ElemRespuestaReplicaTercero response = null;
			
				//Consultar los datos para pasarle a la sede DTO
				// anotaciones para oscar: no esta trayendo los datos de la base de datos...
				List<EmpleadoDTO> listaEmpleadosVinculados= (List<EmpleadoDTO>) entity.queryForList(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerEmpleadoVinculado", unEmpleadoDTO);
				QueueManager qm = new QueueManager();
				List<EmpleadoDTO> listaEMpleadosVinculadosNoRepetidos = qm.noDuplicates(listaEmpleadosVinculados);
				System.out.println("size of list: " + listaEmpleadosVinculados.size());
				System.out.println("size of list: " + listaEMpleadosVinculadosNoRepetidos.size());
				Collections.sort(listaEmpleadosVinculados);
				
				
				Properties propiedades = new Properties();
				propiedades.load(Thread.currentThread().getContextClassLoader().getResource("datos.properties").openStream());
				
				// creamos el soporte y la peticion
				customer = new ServicioGestionGeneralTerceroStub(propiedades.getProperty("url"));
				
				System.out.println("URL: " + propiedades.getProperty("url"));
								
				if(listaEmpleadosVinculados.size() != 0){
					
				for(EmpleadoDTO unEmpleadoVincula:listaEmpleadosVinculados){
                	
                	try {
                		
                		System.out.println("___________________ Replicando ++++++++++++++++++");
                		
                		SedeDTO sedeDTO = new SedeDTO();
                		sedeDTO.setTipoPeriodo(unEmpleadoVincula.getTipoPeriodo());
                		SedeDTO sede = (SedeDTO) entity.queryForObject(DataSourceIbatis.getDataSourceSOA(), "Empleado.obtenerSedeUNAL",sedeDTO );
        				
                		
        				
                		request = new ServicioGestionGeneralTerceroStub.ElemConsultaEmpleadoPorIdTercero();
            			// establecemos el parametro de la invocacion
            			TipoMsjSolicitudPorIdTercero tipoMsjSolicitudPorIdTercero= new TipoMsjSolicitudPorIdTercero();
            			TipoIdTercero tipoIdTercero = new TipoIdTercero();
            			TipoNumeroDocumento tipoNumeroDocumento= new TipoNumeroDocumento();
            			tipoNumeroDocumento.setTipoNumeroDocumento(unEmpleadoVincula.getCedula().toString());
            			
            			tipoIdTercero.setNumeroDocumento(tipoNumeroDocumento);
            			tipoIdTercero.setTipoDocumento(TipoTipoDocumento.Factory.fromValue(unEmpleadoVincula.getTipoDocumentoSoa()));
            			
            			System.out.println("Contrato Adicionado: " + unEmpleadoVincula.getAdicionado());
            			System.out.println("Contrato Modificado: " + unEmpleadoVincula.getModificado());
            			System.out.println("Hoja Vida Modificada: " + unEmpleadoVincula.getModificadohv());
            			System.out.println(sede.getSede().toString());
            			System.out.println(tipoIdTercero.getTipoDocumento().toString());
            			System.out.println(tipoIdTercero.getNumeroDocumento().toString());
            			System.out.println(unEmpleadoVincula.getContrato().toString()); 
            			tipoMsjSolicitudPorIdTercero.setIdTercero(tipoIdTercero);
            			
            			
            			TipoInfoMensaje tipoInfoMensaje= new TipoInfoMensaje();
            			tipoInfoMensaje.setIdSistema(TipoIdSistema.Factory.fromValue(sede.getAplicativo()));
            			tipoInfoMensaje.setIdSede(TipoIdSede.Factory.fromValue(sede.getSede()));
            		
            			TipoFechaHora tipoFechaHora=new TipoFechaHora();
            			tipoFechaHora.setTipoFechaHora(Calendar.getInstance());
            			tipoInfoMensaje.setFechaHora(tipoFechaHora);
            			tipoMsjSolicitudPorIdTercero.setInfoMensaje(tipoInfoMensaje);
            			request.setElemConsultaEmpleadoPorIdTercero(tipoMsjSolicitudPorIdTercero);
            			
            			//System.out.println(request.getElemConsultaEmpleadoPorIdTercero().getIdTercero().getNumeroDocumento());

            			// invocamos al web service
            			//response = customer.opReplicarEmpleado(request);

            			// mostramos la respuesta
            			//System.out.println(response.getElemRespuestaReplicaTercero());

            		} catch (RemoteException excepcionDeInvocacion) {
            			System.err.println(excepcionDeInvocacion.toString());
            		}

                }
				
                }
            else{
            	System.out.println("No hay empleados por vincular");
        	}
			}catch(Exception e){
				e.printStackTrace();
			}
        }
}