
package org.targetas.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TargetaService", targetNamespace = "http://service.targetas.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TargetaService {


    /**
     * 
     * @return
     *     returns java.util.List<org.targetas.service.Targeta>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTodas", targetNamespace = "http://service.targetas.org/", className = "org.targetas.service.ObtenerTodas")
    @ResponseWrapper(localName = "obtenerTodasResponse", targetNamespace = "http://service.targetas.org/", className = "org.targetas.service.ObtenerTodasResponse")
    public List<Targeta> obtenerTodas();

    /**
     * 
     * @param arg0
     * @return
     *     returns org.targetas.service.Targeta
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "creartargeta", targetNamespace = "http://service.targetas.org/", className = "org.targetas.service.Creartargeta")
    @ResponseWrapper(localName = "creartargetaResponse", targetNamespace = "http://service.targetas.org/", className = "org.targetas.service.CreartargetaResponse")
    public Targeta creartargeta(
        @WebParam(name = "arg0", targetNamespace = "")
        Targeta arg0);

}
