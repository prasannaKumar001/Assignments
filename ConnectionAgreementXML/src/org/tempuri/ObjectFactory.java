
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.udsdocument.ConnectionAgreement;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _GetConnectionAgreementResponseGetConnectionAgreementResult_QNAME = new QName("http://tempuri.org/", "getConnectionAgreementResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetConnectionAgreement }
     * 
     */
    public GetConnectionAgreement createGetConnectionAgreement() {
        return new GetConnectionAgreement();
    }

    /**
     * Create an instance of {@link GetConnectionAgreementResponse }
     * 
     */
    public GetConnectionAgreementResponse createGetConnectionAgreementResponse() {
        return new GetConnectionAgreementResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionAgreement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getConnectionAgreementResult", scope = GetConnectionAgreementResponse.class)
    public JAXBElement<ConnectionAgreement> createGetConnectionAgreementResponseGetConnectionAgreementResult(ConnectionAgreement value) {
        return new JAXBElement<ConnectionAgreement>(_GetConnectionAgreementResponseGetConnectionAgreementResult_QNAME, ConnectionAgreement.class, GetConnectionAgreementResponse.class, value);
    }

}
