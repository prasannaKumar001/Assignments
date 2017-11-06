
package org.datacontract.schemas._2004._07.udsdocument;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ArrayOfReqDetailExist;
import org.datacontract.schemas._2004._07.ArrayOfReqDetailNew;
import org.datacontract.schemas._2004._07.ArrayOfRequestType;
import org.datacontract.schemas._2004._07.CustomerData;
import org.datacontract.schemas._2004._07.LocationData;
import org.datacontract.schemas._2004._07.RequestData;


/**
 * <p>Java class for ConnectionAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionAgreement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustData" type="{http://schemas.datacontract.org/2004/07/}CustomerData" minOccurs="0"/&gt;
 *         &lt;element name="ExistReqTypeList" type="{http://schemas.datacontract.org/2004/07/}ArrayOfReqDetailExist" minOccurs="0"/&gt;
 *         &lt;element name="LocData" type="{http://schemas.datacontract.org/2004/07/}LocationData" minOccurs="0"/&gt;
 *         &lt;element name="NewReqTypeList" type="{http://schemas.datacontract.org/2004/07/}ArrayOfReqDetailNew" minOccurs="0"/&gt;
 *         &lt;element name="ReqTypeList" type="{http://schemas.datacontract.org/2004/07/}ArrayOfRequestType" minOccurs="0"/&gt;
 *         &lt;element name="ReqtData" type="{http://schemas.datacontract.org/2004/07/}RequestData" minOccurs="0"/&gt;
 *         &lt;element name="Response" type="{http://schemas.datacontract.org/2004/07/UDSDocument}ServiceResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionAgreement", propOrder = {
    "custData",
    "existReqTypeList",
    "locData",
    "newReqTypeList",
    "reqTypeList",
    "reqtData",
    "response"
})
public class ConnectionAgreement {

    @XmlElementRef(name = "CustData", namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomerData> custData;
    @XmlElementRef(name = "ExistReqTypeList", namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReqDetailExist> existReqTypeList;
    @XmlElementRef(name = "LocData", namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", type = JAXBElement.class, required = false)
    protected JAXBElement<LocationData> locData;
    @XmlElementRef(name = "NewReqTypeList", namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReqDetailNew> newReqTypeList;
    @XmlElementRef(name = "ReqTypeList", namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRequestType> reqTypeList;
    @XmlElementRef(name = "ReqtData", namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestData> reqtData;
    @XmlElementRef(name = "Response", namespace = "http://schemas.datacontract.org/2004/07/UDSDocument", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceResponse> response;

    /**
     * Gets the value of the custData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomerData }{@code >}
     *     
     */
    public JAXBElement<CustomerData> getCustData() {
        return custData;
    }

    /**
     * Sets the value of the custData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomerData }{@code >}
     *     
     */
    public void setCustData(JAXBElement<CustomerData> value) {
        this.custData = value;
    }

    /**
     * Gets the value of the existReqTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReqDetailExist }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReqDetailExist> getExistReqTypeList() {
        return existReqTypeList;
    }

    /**
     * Sets the value of the existReqTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReqDetailExist }{@code >}
     *     
     */
    public void setExistReqTypeList(JAXBElement<ArrayOfReqDetailExist> value) {
        this.existReqTypeList = value;
    }

    /**
     * Gets the value of the locData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocationData }{@code >}
     *     
     */
    public JAXBElement<LocationData> getLocData() {
        return locData;
    }

    /**
     * Sets the value of the locData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocationData }{@code >}
     *     
     */
    public void setLocData(JAXBElement<LocationData> value) {
        this.locData = value;
    }

    /**
     * Gets the value of the newReqTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReqDetailNew }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReqDetailNew> getNewReqTypeList() {
        return newReqTypeList;
    }

    /**
     * Sets the value of the newReqTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReqDetailNew }{@code >}
     *     
     */
    public void setNewReqTypeList(JAXBElement<ArrayOfReqDetailNew> value) {
        this.newReqTypeList = value;
    }

    /**
     * Gets the value of the reqTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRequestType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRequestType> getReqTypeList() {
        return reqTypeList;
    }

    /**
     * Sets the value of the reqTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRequestType }{@code >}
     *     
     */
    public void setReqTypeList(JAXBElement<ArrayOfRequestType> value) {
        this.reqTypeList = value;
    }

    /**
     * Gets the value of the reqtData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestData }{@code >}
     *     
     */
    public JAXBElement<RequestData> getReqtData() {
        return reqtData;
    }

    /**
     * Sets the value of the reqtData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestData }{@code >}
     *     
     */
    public void setReqtData(JAXBElement<RequestData> value) {
        this.reqtData = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}
     *     
     */
    public JAXBElement<ServiceResponse> getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}
     *     
     */
    public void setResponse(JAXBElement<ServiceResponse> value) {
        this.response = value;
    }

}
