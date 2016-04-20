/**
 * ServicioGestionEmpleadoStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package co.edu.unal.interoperabilidad.ws.gestionempleado;

/*
 *  ServicioGestionEmpleadoStub java implementation
 */

public class ServicioGestionEmpleadoStub extends org.apache.axis2.client.Stub {
	protected org.apache.axis2.description.AxisOperation[] _operations;

	// hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized java.lang.String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}
		counter = counter + 1;
		return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
	}

	private void populateAxisService() throws org.apache.axis2.AxisFault {

		// creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService("ServicioGestionEmpleado" + getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[5];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaPorTipoVinculacion"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaInformacionEmpleado"));
		_service.addOperation(__operation);

		_operations[1] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaEmpleadoTerceroPorId"));
		_service.addOperation(__operation);

		_operations[2] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaContratoEmpleado"));
		_service.addOperation(__operation);

		_operations[3] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaCabeceraContratos"));
		_service.addOperation(__operation);

		_operations[4] = __operation;

	}

	// populates the faults
	private void populateFaults() {

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public ServicioGestionEmpleadoStub(org.apache.axis2.context.ConfigurationContext configurationContext, java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public ServicioGestionEmpleadoStub(org.apache.axis2.context.ConfigurationContext configurationContext, java.lang.String targetEndpoint, boolean useSeparateListener)
			throws org.apache.axis2.AxisFault {
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

		_serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

	}

	/**
	 * Default Constructor
	 */
	public ServicioGestionEmpleadoStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {

		this(configurationContext, "http://localhost:8080/ode/processes/SARA_EMPLEADO_WS");

	}

	/**
	 * Default Constructor
	 */
	public ServicioGestionEmpleadoStub() throws org.apache.axis2.AxisFault {

		this("http://localhost:8080/ode/processes/SARA_EMPLEADO_WS");

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public ServicioGestionEmpleadoStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}

	/**
	 * Auto generated method signature
	 * 
	 * @see co.edu.unal.interoperabilidad.ws.gestionempleado.ServicioGestionEmpleado#opConsultaPorTipoVinculacion
	 * @param elemConsultaPorTipoVinculacion62
	 */

	public co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos opConsultaPorTipoVinculacion(

	co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion elemConsultaPorTipoVinculacion62)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
			_operationClient.getOptions().setAction("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado/opConsultaPorTipoVinculacion");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), elemConsultaPorTipoVinculacion62, optimizeContent(new javax.xml.namespace.QName(
					"http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaPorTipoVinculacion")), new javax.xml.namespace.QName(
					"http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaPorTipoVinculacion"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos.class,
					getEnvelopeNamespaces(_returnEnv));

			return (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaPorTipoVinculacion"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
								"opConsultaPorTipoVinculacion"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaPorTipoVinculacion"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see co.edu.unal.interoperabilidad.ws.gestionempleado.ServicioGestionEmpleado#startopConsultaPorTipoVinculacion
	 * @param elemConsultaPorTipoVinculacion62
	 */
	public void startopConsultaPorTipoVinculacion(

	co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion elemConsultaPorTipoVinculacion62,

	final co.edu.unal.interoperabilidad.ws.gestionempleado.ServicioGestionEmpleadoCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
		_operationClient.getOptions().setAction("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado/opConsultaPorTipoVinculacion");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), elemConsultaPorTipoVinculacion62, optimizeContent(new javax.xml.namespace.QName(
				"http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaPorTipoVinculacion")), new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado",
				"opConsultaPorTipoVinculacion"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultopConsultaPorTipoVinculacion((co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErroropConsultaPorTipoVinculacion(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaPorTipoVinculacion"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
										"opConsultaPorTipoVinculacion"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaPorTipoVinculacion"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErroropConsultaPorTipoVinculacion(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaPorTipoVinculacion(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaPorTipoVinculacion(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaPorTipoVinculacion(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaPorTipoVinculacion(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaPorTipoVinculacion(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaPorTipoVinculacion(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaPorTipoVinculacion(f);
							}
						} else {
							callback.receiveErroropConsultaPorTipoVinculacion(f);
						}
					} else {
						callback.receiveErroropConsultaPorTipoVinculacion(f);
					}
				} else {
					callback.receiveErroropConsultaPorTipoVinculacion(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErroropConsultaPorTipoVinculacion(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[0].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see co.edu.unal.interoperabilidad.ws.gestionempleado.ServicioGestionEmpleado#opConsultaInformacionEmpleado
	 * @param elemConsultaTercero64
	 */

	public co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado opConsultaInformacionEmpleado(

	co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero elemConsultaTercero64)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado/opConsultaInformacionEmpleado");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), elemConsultaTercero64, optimizeContent(new javax.xml.namespace.QName(
					"http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaInformacionEmpleado")), new javax.xml.namespace.QName(
					"http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaInformacionEmpleado"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado.class, getEnvelopeNamespaces(_returnEnv));

			return (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaInformacionEmpleado"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
								"opConsultaInformacionEmpleado"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaInformacionEmpleado"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see co.edu.unal.interoperabilidad.ws.gestionempleado.ServicioGestionEmpleado#startopConsultaInformacionEmpleado
	 * @param elemConsultaTercero64
	 */
	public void startopConsultaInformacionEmpleado(

	co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero elemConsultaTercero64,

	final co.edu.unal.interoperabilidad.ws.gestionempleado.ServicioGestionEmpleadoCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
		_operationClient.getOptions().setAction("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado/opConsultaInformacionEmpleado");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), elemConsultaTercero64, optimizeContent(new javax.xml.namespace.QName(
				"http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaInformacionEmpleado")), new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado",
				"opConsultaInformacionEmpleado"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultopConsultaInformacionEmpleado((co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErroropConsultaInformacionEmpleado(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaInformacionEmpleado"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
										"opConsultaInformacionEmpleado"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaInformacionEmpleado"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErroropConsultaInformacionEmpleado(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaInformacionEmpleado(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaInformacionEmpleado(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaInformacionEmpleado(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaInformacionEmpleado(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaInformacionEmpleado(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaInformacionEmpleado(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaInformacionEmpleado(f);
							}
						} else {
							callback.receiveErroropConsultaInformacionEmpleado(f);
						}
					} else {
						callback.receiveErroropConsultaInformacionEmpleado(f);
					}
				} else {
					callback.receiveErroropConsultaInformacionEmpleado(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErroropConsultaInformacionEmpleado(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[1].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see co.edu.unal.interoperabilidad.ws.gestionempleado.ServicioGestionEmpleado#opConsultaEmpleadoTerceroPorId
	 * @param elemConsultaEmpleadoPorIdTercero66
	 */

	public co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero opConsultaEmpleadoTerceroPorId(

	co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero elemConsultaEmpleadoPorIdTercero66)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
			_operationClient.getOptions().setAction("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado/opConsultaEmpleadoTerceroPorId");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), elemConsultaEmpleadoPorIdTercero66, optimizeContent(new javax.xml.namespace.QName(
					"http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaEmpleadoTerceroPorId")), new javax.xml.namespace.QName(
					"http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaEmpleadoTerceroPorId"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero.class,
					getEnvelopeNamespaces(_returnEnv));

			return (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaEmpleadoTerceroPorId"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
								"opConsultaEmpleadoTerceroPorId"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaEmpleadoTerceroPorId"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see co.edu.unal.interoperabilidad.ws.gestionempleado.ServicioGestionEmpleado#startopConsultaEmpleadoTerceroPorId
	 * @param elemConsultaEmpleadoPorIdTercero66
	 */
	public void startopConsultaEmpleadoTerceroPorId(

	co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero elemConsultaEmpleadoPorIdTercero66,

	final co.edu.unal.interoperabilidad.ws.gestionempleado.ServicioGestionEmpleadoCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
		_operationClient.getOptions().setAction("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado/opConsultaEmpleadoTerceroPorId");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), elemConsultaEmpleadoPorIdTercero66, optimizeContent(new javax.xml.namespace.QName(
				"http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaEmpleadoTerceroPorId")), new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado",
				"opConsultaEmpleadoTerceroPorId"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultopConsultaEmpleadoTerceroPorId((co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErroropConsultaEmpleadoTerceroPorId(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaEmpleadoTerceroPorId"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
										"opConsultaEmpleadoTerceroPorId"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
										"opConsultaEmpleadoTerceroPorId"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErroropConsultaEmpleadoTerceroPorId(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaEmpleadoTerceroPorId(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaEmpleadoTerceroPorId(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaEmpleadoTerceroPorId(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaEmpleadoTerceroPorId(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaEmpleadoTerceroPorId(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaEmpleadoTerceroPorId(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaEmpleadoTerceroPorId(f);
							}
						} else {
							callback.receiveErroropConsultaEmpleadoTerceroPorId(f);
						}
					} else {
						callback.receiveErroropConsultaEmpleadoTerceroPorId(f);
					}
				} else {
					callback.receiveErroropConsultaEmpleadoTerceroPorId(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErroropConsultaEmpleadoTerceroPorId(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[2].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[2].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see co.edu.unal.interoperabilidad.ws.gestionempleado.ServicioGestionEmpleado#opConsultaContratoEmpleado
	 * @param elemConsultaEmpleadoPorIdTercero68
	 */

	public co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado opConsultaContratoEmpleado(

	co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero elemConsultaEmpleadoPorIdTercero68)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
			_operationClient.getOptions().setAction("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado/opConsultaContratoEmpleado");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), elemConsultaEmpleadoPorIdTercero68, optimizeContent(new javax.xml.namespace.QName(
					"http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaContratoEmpleado")), new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado",
					"opConsultaContratoEmpleado"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado.class,
					getEnvelopeNamespaces(_returnEnv));

			return (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaContratoEmpleado"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
								"opConsultaContratoEmpleado"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaContratoEmpleado"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see co.edu.unal.interoperabilidad.ws.gestionempleado.ServicioGestionEmpleado#startopConsultaContratoEmpleado
	 * @param elemConsultaEmpleadoPorIdTercero68
	 */
	public void startopConsultaContratoEmpleado(

	co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero elemConsultaEmpleadoPorIdTercero68,

	final co.edu.unal.interoperabilidad.ws.gestionempleado.ServicioGestionEmpleadoCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
		_operationClient.getOptions().setAction("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado/opConsultaContratoEmpleado");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), elemConsultaEmpleadoPorIdTercero68, optimizeContent(new javax.xml.namespace.QName(
				"http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaContratoEmpleado")), new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado",
				"opConsultaContratoEmpleado"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultopConsultaContratoEmpleado((co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErroropConsultaContratoEmpleado(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaContratoEmpleado"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
										"opConsultaContratoEmpleado"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaContratoEmpleado"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErroropConsultaContratoEmpleado(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaContratoEmpleado(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaContratoEmpleado(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaContratoEmpleado(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaContratoEmpleado(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaContratoEmpleado(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaContratoEmpleado(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaContratoEmpleado(f);
							}
						} else {
							callback.receiveErroropConsultaContratoEmpleado(f);
						}
					} else {
						callback.receiveErroropConsultaContratoEmpleado(f);
					}
				} else {
					callback.receiveErroropConsultaContratoEmpleado(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErroropConsultaContratoEmpleado(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[3].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[3].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see co.edu.unal.interoperabilidad.ws.gestionempleado.ServicioGestionEmpleado#opConsultaCabeceraContratos
	 * @param elemConsultaCabeceraContrato70
	 */

	public co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos opConsultaCabeceraContratos(

	co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato elemConsultaCabeceraContrato70)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
			_operationClient.getOptions().setAction("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado/opConsultaCabeceraContratos");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), elemConsultaCabeceraContrato70, optimizeContent(new javax.xml.namespace.QName(
					"http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaCabeceraContratos")), new javax.xml.namespace.QName(
					"http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaCabeceraContratos"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos.class,
					getEnvelopeNamespaces(_returnEnv));

			return (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaCabeceraContratos"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
								"opConsultaCabeceraContratos"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaCabeceraContratos"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see co.edu.unal.interoperabilidad.ws.gestionempleado.ServicioGestionEmpleado#startopConsultaCabeceraContratos
	 * @param elemConsultaCabeceraContrato70
	 */
	public void startopConsultaCabeceraContratos(

	co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato elemConsultaCabeceraContrato70,

	final co.edu.unal.interoperabilidad.ws.gestionempleado.ServicioGestionEmpleadoCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
		_operationClient.getOptions().setAction("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado/opConsultaCabeceraContratos");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), elemConsultaCabeceraContrato70, optimizeContent(new javax.xml.namespace.QName(
				"http://interoperabilidad.unal.edu.co/WS/GestionEmpleado", "opConsultaCabeceraContratos")), new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado",
				"opConsultaCabeceraContratos"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultopConsultaCabeceraContratos((co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErroropConsultaCabeceraContratos(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaCabeceraContratos"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
										"opConsultaCabeceraContratos"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "opConsultaCabeceraContratos"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								callback.receiveErroropConsultaCabeceraContratos(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaCabeceraContratos(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaCabeceraContratos(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaCabeceraContratos(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaCabeceraContratos(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaCabeceraContratos(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaCabeceraContratos(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErroropConsultaCabeceraContratos(f);
							}
						} else {
							callback.receiveErroropConsultaCabeceraContratos(f);
						}
					} else {
						callback.receiveErroropConsultaCabeceraContratos(f);
					}
				} else {
					callback.receiveErroropConsultaCabeceraContratos(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErroropConsultaCabeceraContratos(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[4].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[4].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

	private javax.xml.namespace.QName[] opNameArray = null;

	private boolean optimizeContent(javax.xml.namespace.QName opName) {

		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;
			}
		}
		return false;
	}

	// http://localhost:8080/ode/processes/SARA_EMPLEADO_WS
	private org.apache.axiom.om.OMElement toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type, java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

		try {

			if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion.class.equals(type)) {

				return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos.class.equals(type)) {

				return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero.class.equals(type)) {

				return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado.class.equals(type)) {

				return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero.class.equals(type)) {

				return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero.class.equals(type)) {

				return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero.class.equals(type)) {

				return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado.class.equals(type)) {

				return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato.class.equals(type)) {

				return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos.class.equals(type)) {

				return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

}
