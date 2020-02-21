
package org.targetas.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.targetas.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerTodas_QNAME = new QName("http://service.targetas.org/", "obtenerTodas");
    private final static QName _Creartargeta_QNAME = new QName("http://service.targetas.org/", "creartargeta");
    private final static QName _ObtenerTodasResponse_QNAME = new QName("http://service.targetas.org/", "obtenerTodasResponse");
    private final static QName _CreartargetaResponse_QNAME = new QName("http://service.targetas.org/", "creartargetaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.targetas.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerTodasResponse }
     * 
     */
    public ObtenerTodasResponse createObtenerTodasResponse() {
        return new ObtenerTodasResponse();
    }

    /**
     * Create an instance of {@link CreartargetaResponse }
     * 
     */
    public CreartargetaResponse createCreartargetaResponse() {
        return new CreartargetaResponse();
    }

    /**
     * Create an instance of {@link ObtenerTodas }
     * 
     */
    public ObtenerTodas createObtenerTodas() {
        return new ObtenerTodas();
    }

    /**
     * Create an instance of {@link Creartargeta }
     * 
     */
    public Creartargeta createCreartargeta() {
        return new Creartargeta();
    }

    /**
     * Create an instance of {@link Targeta }
     * 
     */
    public Targeta createTargeta() {
        return new Targeta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.targetas.org/", name = "obtenerTodas")
    public JAXBElement<ObtenerTodas> createObtenerTodas(ObtenerTodas value) {
        return new JAXBElement<ObtenerTodas>(_ObtenerTodas_QNAME, ObtenerTodas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Creartargeta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.targetas.org/", name = "creartargeta")
    public JAXBElement<Creartargeta> createCreartargeta(Creartargeta value) {
        return new JAXBElement<Creartargeta>(_Creartargeta_QNAME, Creartargeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.targetas.org/", name = "obtenerTodasResponse")
    public JAXBElement<ObtenerTodasResponse> createObtenerTodasResponse(ObtenerTodasResponse value) {
        return new JAXBElement<ObtenerTodasResponse>(_ObtenerTodasResponse_QNAME, ObtenerTodasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreartargetaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.targetas.org/", name = "creartargetaResponse")
    public JAXBElement<CreartargetaResponse> createCreartargetaResponse(CreartargetaResponse value) {
        return new JAXBElement<CreartargetaResponse>(_CreartargetaResponse_QNAME, CreartargetaResponse.class, null, value);
    }

}
