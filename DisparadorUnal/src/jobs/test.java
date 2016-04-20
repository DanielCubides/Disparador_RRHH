package jobs;

import java.io.FileInputStream;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Properties;

import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoFechaHora;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoIdSede;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoIdSistema;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoIdTercero;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoInfoMensaje;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoMsjSolicitudPorIdTercero;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoNumeroDocumento;
import co.edu.unal.interoperabilidad.ws.gestiongeneraltercero.ServicioGestionGeneralTerceroStub.TipoTipoDocumento;

public class test {
	public static void main(String[] args) {

		/*
		 * Utilizamos el stub generado a partir del wsdl que logran establecer
		 * la conexion con el web service proveedor.
		 */
		ServicioGestionGeneralTerceroStub customer = null;
		ServicioGestionGeneralTerceroStub.ElemConsultaEmpleadoPorIdTercero request = null;
		ServicioGestionGeneralTerceroStub.ElemRespuestaReplicaTercero response = null;

		try {
			Properties propiedades = new Properties();
			propiedades.load(new FileInputStream("WebContent/META-INF/datos.properties"));
			
			// creamos el soporte y la peticion
			customer = new ServicioGestionGeneralTerceroStub(propiedades.getProperty("url"));
			request = new ServicioGestionGeneralTerceroStub.ElemConsultaEmpleadoPorIdTercero();

			// establecemos el parametro de la invocacion
			TipoMsjSolicitudPorIdTercero tipoMsjSolicitudPorIdTercero= new TipoMsjSolicitudPorIdTercero();
			TipoIdTercero tipoIdTercero = new TipoIdTercero();
			TipoNumeroDocumento tipoNumeroDocumento= new TipoNumeroDocumento();
			tipoNumeroDocumento.setTipoNumeroDocumento("123456");
			
			tipoIdTercero.setNumeroDocumento(tipoNumeroDocumento);
			tipoIdTercero.setTipoDocumento(TipoTipoDocumento.Factory.fromValue("CC"));
			tipoMsjSolicitudPorIdTercero.setIdTercero(tipoIdTercero);
			
			
			TipoInfoMensaje tipoInfoMensaje= new TipoInfoMensaje();
			tipoInfoMensaje.setIdSistema(TipoIdSistema.Factory.fromValue("100003"));
			tipoInfoMensaje.setIdSede(TipoIdSede.Factory.fromValue("02"));
		
			TipoFechaHora tipoFechaHora=new TipoFechaHora();
			tipoFechaHora.setTipoFechaHora(Calendar.getInstance());
			tipoInfoMensaje.setFechaHora(tipoFechaHora);
			tipoMsjSolicitudPorIdTercero.setInfoMensaje(tipoInfoMensaje);
			request.setElemConsultaEmpleadoPorIdTercero(tipoMsjSolicitudPorIdTercero);

			// invocamos al web service
			response = customer.opReplicarEmpleado(request);

			// mostramos la respuesta
			System.out.println(response.getElemRespuestaReplicaTercero());

		} catch (RemoteException excepcionDeInvocacion) {
			System.err.println(excepcionDeInvocacion.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
