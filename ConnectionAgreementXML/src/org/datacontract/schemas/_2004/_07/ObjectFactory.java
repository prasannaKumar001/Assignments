
package org.datacontract.schemas._2004._07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07 package. 
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

    private final static QName _CustomerData_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CustomerData");
    private final static QName _ArrayOfReqDetailExist_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfReqDetailExist");
    private final static QName _ReqDetailExist_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ReqDetailExist");
    private final static QName _LocationData_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "LocationData");
    private final static QName _ArrayOfReqDetailNew_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfReqDetailNew");
    private final static QName _ReqDetailNew_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ReqDetailNew");
    private final static QName _ArrayOfRequestType_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ArrayOfRequestType");
    private final static QName _RequestType_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "RequestType");
    private final static QName _RequestData_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "RequestData");
    private final static QName _RequestDataInvname_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "invname");
    private final static QName _RequestTypeReqName_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "ReqName");
    private final static QName _LocationDataBlockno_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Blockno");
    private final static QName _LocationDataHAxis_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "HAxis");
    private final static QName _LocationDataPlanno_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Planno");
    private final static QName _LocationDataPlotno_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "Plotno");
    private final static QName _LocationDataVAxis_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "VAxis");
    private final static QName _LocationDataBldpermno_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "bldpermno");
    private final static QName _LocationDataCityname_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "cityname");
    private final static QName _LocationDataDistname_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "distname");
    private final static QName _CustomerDataCustName_QNAME = new QName("http://schemas.datacontract.org/2004/07/", "CustName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerData }
     * 
     */
    public CustomerData createCustomerData() {
        return new CustomerData();
    }

    /**
     * Create an instance of {@link ArrayOfReqDetailExist }
     * 
     */
    public ArrayOfReqDetailExist createArrayOfReqDetailExist() {
        return new ArrayOfReqDetailExist();
    }

    /**
     * Create an instance of {@link ReqDetailExist }
     * 
     */
    public ReqDetailExist createReqDetailExist() {
        return new ReqDetailExist();
    }

    /**
     * Create an instance of {@link LocationData }
     * 
     */
    public LocationData createLocationData() {
        return new LocationData();
    }

    /**
     * Create an instance of {@link ArrayOfReqDetailNew }
     * 
     */
    public ArrayOfReqDetailNew createArrayOfReqDetailNew() {
        return new ArrayOfReqDetailNew();
    }

    /**
     * Create an instance of {@link ReqDetailNew }
     * 
     */
    public ReqDetailNew createReqDetailNew() {
        return new ReqDetailNew();
    }

    /**
     * Create an instance of {@link ArrayOfRequestType }
     * 
     */
    public ArrayOfRequestType createArrayOfRequestType() {
        return new ArrayOfRequestType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link RequestData }
     * 
     */
    public RequestData createRequestData() {
        return new RequestData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CustomerData")
    public JAXBElement<CustomerData> createCustomerData(CustomerData value) {
        return new JAXBElement<CustomerData>(_CustomerData_QNAME, CustomerData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReqDetailExist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfReqDetailExist")
    public JAXBElement<ArrayOfReqDetailExist> createArrayOfReqDetailExist(ArrayOfReqDetailExist value) {
        return new JAXBElement<ArrayOfReqDetailExist>(_ArrayOfReqDetailExist_QNAME, ArrayOfReqDetailExist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqDetailExist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ReqDetailExist")
    public JAXBElement<ReqDetailExist> createReqDetailExist(ReqDetailExist value) {
        return new JAXBElement<ReqDetailExist>(_ReqDetailExist_QNAME, ReqDetailExist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "LocationData")
    public JAXBElement<LocationData> createLocationData(LocationData value) {
        return new JAXBElement<LocationData>(_LocationData_QNAME, LocationData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReqDetailNew }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfReqDetailNew")
    public JAXBElement<ArrayOfReqDetailNew> createArrayOfReqDetailNew(ArrayOfReqDetailNew value) {
        return new JAXBElement<ArrayOfReqDetailNew>(_ArrayOfReqDetailNew_QNAME, ArrayOfReqDetailNew.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqDetailNew }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ReqDetailNew")
    public JAXBElement<ReqDetailNew> createReqDetailNew(ReqDetailNew value) {
        return new JAXBElement<ReqDetailNew>(_ReqDetailNew_QNAME, ReqDetailNew.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ArrayOfRequestType")
    public JAXBElement<ArrayOfRequestType> createArrayOfRequestType(ArrayOfRequestType value) {
        return new JAXBElement<ArrayOfRequestType>(_ArrayOfRequestType_QNAME, ArrayOfRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "RequestType")
    public JAXBElement<RequestType> createRequestType(RequestType value) {
        return new JAXBElement<RequestType>(_RequestType_QNAME, RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "RequestData")
    public JAXBElement<RequestData> createRequestData(RequestData value) {
        return new JAXBElement<RequestData>(_RequestData_QNAME, RequestData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "invname", scope = RequestData.class)
    public JAXBElement<String> createRequestDataInvname(String value) {
        return new JAXBElement<String>(_RequestDataInvname_QNAME, String.class, RequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "ReqName", scope = RequestType.class)
    public JAXBElement<String> createRequestTypeReqName(String value) {
        return new JAXBElement<String>(_RequestTypeReqName_QNAME, String.class, RequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Blockno", scope = LocationData.class)
    public JAXBElement<String> createLocationDataBlockno(String value) {
        return new JAXBElement<String>(_LocationDataBlockno_QNAME, String.class, LocationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "HAxis", scope = LocationData.class)
    public JAXBElement<String> createLocationDataHAxis(String value) {
        return new JAXBElement<String>(_LocationDataHAxis_QNAME, String.class, LocationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Planno", scope = LocationData.class)
    public JAXBElement<String> createLocationDataPlanno(String value) {
        return new JAXBElement<String>(_LocationDataPlanno_QNAME, String.class, LocationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "Plotno", scope = LocationData.class)
    public JAXBElement<String> createLocationDataPlotno(String value) {
        return new JAXBElement<String>(_LocationDataPlotno_QNAME, String.class, LocationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "VAxis", scope = LocationData.class)
    public JAXBElement<String> createLocationDataVAxis(String value) {
        return new JAXBElement<String>(_LocationDataVAxis_QNAME, String.class, LocationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "bldpermno", scope = LocationData.class)
    public JAXBElement<String> createLocationDataBldpermno(String value) {
        return new JAXBElement<String>(_LocationDataBldpermno_QNAME, String.class, LocationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "cityname", scope = LocationData.class)
    public JAXBElement<String> createLocationDataCityname(String value) {
        return new JAXBElement<String>(_LocationDataCityname_QNAME, String.class, LocationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "distname", scope = LocationData.class)
    public JAXBElement<String> createLocationDataDistname(String value) {
        return new JAXBElement<String>(_LocationDataDistname_QNAME, String.class, LocationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/", name = "CustName", scope = CustomerData.class)
    public JAXBElement<String> createCustomerDataCustName(String value) {
        return new JAXBElement<String>(_CustomerDataCustName_QNAME, String.class, CustomerData.class, value);
    }

}
