
/**
 * ServicioGestionEmpleadoMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package co.edu.unal.interoperabilidad.ws.gestionempleado;

        /**
        *  ServicioGestionEmpleadoMessageReceiverInOut message receiver
        */

        public class ServicioGestionEmpleadoMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ServicioGestionEmpleadoSkeleton skel = (ServicioGestionEmpleadoSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("opConsultaPorTipoVinculacion".equals(methodName)){
                
                co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos elemRespuestaCabeceraContratos3 = null;
	                        co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion wrappedParam =
                                                             (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               elemRespuestaCabeceraContratos3 =
                                                   
                                                   
                                                         skel.opConsultaPorTipoVinculacion(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), elemRespuestaCabeceraContratos3, false, new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado",
                                                    "opConsultaPorTipoVinculacion"));
                                    } else 

            if("opConsultaInformacionEmpleado".equals(methodName)){
                
                co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado elemRespuestaEmpleado5 = null;
	                        co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero wrappedParam =
                                                             (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               elemRespuestaEmpleado5 =
                                                   
                                                   
                                                         skel.opConsultaInformacionEmpleado(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), elemRespuestaEmpleado5, false, new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado",
                                                    "opConsultaInformacionEmpleado"));
                                    } else 

            if("opConsultaEmpleadoTerceroPorId".equals(methodName)){
                
                co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero elemRespuestaConsultaTercero7 = null;
	                        co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero wrappedParam =
                                                             (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               elemRespuestaConsultaTercero7 =
                                                   
                                                   
                                                         skel.opConsultaEmpleadoTerceroPorId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), elemRespuestaConsultaTercero7, false, new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado",
                                                    "opConsultaEmpleadoTerceroPorId"));
                                    } else 

            if("opConsultaContratoEmpleado".equals(methodName)){
                
                co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado elemRespuestaConsultaDetalleEmpleado9 = null;
	                        co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero wrappedParam =
                                                             (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               elemRespuestaConsultaDetalleEmpleado9 =
                                                   
                                                   
                                                         skel.opConsultaContratoEmpleado(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), elemRespuestaConsultaDetalleEmpleado9, false, new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado",
                                                    "opConsultaContratoEmpleado"));
                                    } else 

            if("opConsultaCabeceraContratos".equals(methodName)){
                
                co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos elemRespuestaCabeceraContratos11 = null;
	                        co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato wrappedParam =
                                                             (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               elemRespuestaCabeceraContratos11 =
                                                   
                                                   
                                                         skel.opConsultaCabeceraContratos(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), elemRespuestaCabeceraContratos11, false, new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/GestionEmpleado",
                                                    "opConsultaCabeceraContratos"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos wrapopConsultaPorTipoVinculacion(){
                                co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos wrappedElement = new co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado wrapopConsultaInformacionEmpleado(){
                                co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado wrappedElement = new co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero wrapopConsultaEmpleadoTerceroPorId(){
                                co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero wrappedElement = new co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado wrapopConsultaContratoEmpleado(){
                                co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado wrappedElement = new co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado();
                                return wrappedElement;
                         }
                    
                         private co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos wrapopConsultaCabeceraContratos(){
                                co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos wrappedElement = new co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion.class.equals(type)){
                
                           return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaPorTipoVinculacion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos.class.equals(type)){
                
                           return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero.class.equals(type)){
                
                           return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaTercero.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado.class.equals(type)){
                
                           return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero.class.equals(type)){
                
                           return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero.class.equals(type)){
                
                           return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero.class.equals(type)){
                
                           return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaEmpleadoPorIdTercero.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado.class.equals(type)){
                
                           return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato.class.equals(type)){
                
                           return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemConsultaCabeceraContrato.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos.class.equals(type)){
                
                           return co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    