
/**
 * ServicioGestionEmpleadoCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package co.edu.unal.interoperabilidad.ws.gestionempleado;

    /**
     *  ServicioGestionEmpleadoCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ServicioGestionEmpleadoCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ServicioGestionEmpleadoCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ServicioGestionEmpleadoCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for opConsultaPorTipoVinculacion method
            * override this method for handling normal response from opConsultaPorTipoVinculacion operation
            */
           public void receiveResultopConsultaPorTipoVinculacion(
                    co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from opConsultaPorTipoVinculacion operation
           */
            public void receiveErroropConsultaPorTipoVinculacion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for opConsultaInformacionEmpleado method
            * override this method for handling normal response from opConsultaInformacionEmpleado operation
            */
           public void receiveResultopConsultaInformacionEmpleado(
                    co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaEmpleado result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from opConsultaInformacionEmpleado operation
           */
            public void receiveErroropConsultaInformacionEmpleado(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for opConsultaEmpleadoTerceroPorId method
            * override this method for handling normal response from opConsultaEmpleadoTerceroPorId operation
            */
           public void receiveResultopConsultaEmpleadoTerceroPorId(
                    co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaTercero result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from opConsultaEmpleadoTerceroPorId operation
           */
            public void receiveErroropConsultaEmpleadoTerceroPorId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for opConsultaContratoEmpleado method
            * override this method for handling normal response from opConsultaContratoEmpleado operation
            */
           public void receiveResultopConsultaContratoEmpleado(
                    co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaConsultaDetalleEmpleado result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from opConsultaContratoEmpleado operation
           */
            public void receiveErroropConsultaContratoEmpleado(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for opConsultaCabeceraContratos method
            * override this method for handling normal response from opConsultaCabeceraContratos operation
            */
           public void receiveResultopConsultaCabeceraContratos(
                    co.edu.unal.interoperabilidad.ws.schemas.terceros.ElemRespuestaCabeceraContratos result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from opConsultaCabeceraContratos operation
           */
            public void receiveErroropConsultaCabeceraContratos(java.lang.Exception e) {
            }
                


    }
    