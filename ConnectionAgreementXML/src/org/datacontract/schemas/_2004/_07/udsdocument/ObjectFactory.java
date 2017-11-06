
package org.datacontract.schemas._2004._07.udsdocument;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.ArrayOfReqDetailExist;
import org.datacontract.schemas._2004._07.ArrayOfReqDetailNew;
import org.datacontract.schemas._2004._07.ArrayOfRequestType;
import org.datacontract.schemas._2004._07.CustomerData;
import org.datacontract.schemas._2004._07.LocationData;
import org.datacontract.schemas._2004._07.RequestData;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.udsdocument package. 
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

    private final static QName _ConnectionAgreement_QNAME = new QName("http://schemas.datacontract.org/2004/07/UDSDocument", "ConnectionAgreement");
    private final static QName _ServiceResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/UDSDocument", "ServiceResponse");
    private final static QName _ServiceResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/UDSDocument", "Message");
    private final static QName _ServiceResponseDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/UDSDocument", "Detail");
    private final static QName _ConnectionAgreementCustData_QNAME = new QName("http://schemas.datacontract.org/2004/07/UDSDocument", "CustData");
    private final static QName _ConnectionAgreementExistReqTypeList_QNAME = new QName("http://schemas.datacontract.org/2004/07/UDSDocument", "ExistReqTypeList");
    private final static QName _ConnectionAgreementLocData_QNAME = new QName("http://schemas.datacontract.org/2004/07/UDSDocument", "LocData");
    private final static QName _ConnectionAgreementNewReqTypeList_QNAME = new QName("http://schemas.datacontract.org/2004/07/UDSDocument", "NewReqTypeList");
    private final static QName _ConnectionAgreementReqTypeList_QNAME = new QName("http://schemas.datacontract.org/2004/07/UDSDocument", "ReqTypeList");
    private final static QName _ConnectionAgreementReqtData_QNAME = new QName("http://schemas.datacontract.org/2004/07/UDSDocument", "ReqtData");
    private final static QName _ConnectionAgreementResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/UDSDocument", "Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.udsdocument
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConnectionAgreement }
     * 
     */
    public ConnectionAgreement createConnectionAgreement() {
        return new ConnectionAgreement();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionAgreement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", name = "ConnectionAgreement")
    public JAXBElement<ConnectionAgreement> createConnectionAgreement(ConnectionAgreement value) {
        return new JAXBElement<ConnectionAgreement>(_ConnectionAgreement_QNAME, ConnectionAgreement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", name = "ServiceResponse")
    public JAXBElement<ServiceResponse> createServiceResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ServiceResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", name = "Message", scope = ServiceResponse.class)
    public JAXBElement<String> createServiceResponseMessage(String value) {
        return new JAXBElement<String>(_ServiceResponseMessage_QNAME, String.class, ServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", name = "Detail", scope = ServiceResponse.class)
    public JAXBElement<String> createServiceResponseDetail(String value) {
        return new JAXBElement<String>(_ServiceResponseDetail_QNAME, String.class, ServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", name = "CustData", scope = ConnectionAgreement.class)
    public JAXBElement<CustomerData> createConnectionAgreementCustData(CustomerData value) {
        return new JAXBElement<CustomerData>(_ConnectionAgreementCustData_QNAME, CustomerData.class, ConnectionAgreement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReqDetailExist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", name = "ExistReqTypeList", scope = ConnectionAgreement.class)
    public JAXBElement<ArrayOfReqDetailExist> createConnectionAgreementExistReqTypeList(ArrayOfReqDetailExist value) {
        return new JAXBElement<ArrayOfReqDetailExist>(_ConnectionAgreementExistReqTypeList_QNAME, ArrayOfReqDetailExist.class, ConnectionAgreement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", name = "LocData", scope = ConnectionAgreement.class)
    public JAXBElement<LocationData> createConnectionAgreementLocData(LocationData value) {
        return new JAXBElement<LocationData>(_ConnectionAgreementLocData_QNAME, LocationData.class, ConnectionAgreement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReqDetailNew }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", name = "NewReqTypeList", scope = ConnectionAgreement.class)
    public JAXBElement<ArrayOfReqDetailNew> createConnectionAgreementNewReqTypeList(ArrayOfReqDetailNew value) {
        return new JAXBElement<ArrayOfReqDetailNew>(_ConnectionAgreementNewReqTypeList_QNAME, ArrayOfReqDetailNew.class, ConnectionAgreement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", name = "ReqTypeList", scope = ConnectionAgreement.class)
    public JAXBElement<ArrayOfRequestType> createConnectionAgreementReqTypeList(ArrayOfRequestType value) {
        return new JAXBElement<ArrayOfRequestType>(_ConnectionAgreementReqTypeList_QNAME, ArrayOfRequestType.class, ConnectionAgreement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", name = "ReqtData", scope = ConnectionAgreement.class)
    public JAXBElement<RequestData> createConnectionAgreementReqtData(RequestData value) {
        return new JAXBElement<RequestData>(_ConnectionAgreementReqtData_QNAME, RequestData.class, ConnectionAgreement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", name = "Response", scope = ConnectionAgreement.class)
    public JAXBElement<ServiceResponse> createConnectionAgreementResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ConnectionAgreementResponse_QNAME, ServiceResponse.class, ConnectionAgreement.class, value);
    }

}
