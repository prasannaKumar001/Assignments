
package org.datacontract.schemas._2004._07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Branch" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="Custid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Custtype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Locid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReqDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Reqid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="invname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestData", propOrder = {
    "branch",
    "custid",
    "custtype",
    "locid",
    "mobile",
    "reqDate",
    "reqid",
    "invname"
})
public class RequestData {

    @XmlElement(name = "Branch")
    protected Short branch;
    @XmlElement(name = "Custid")
    protected Long custid;
    @XmlElement(name = "Custtype")
    protected Integer custtype;
    @XmlElement(name = "Locid")
    protected Integer locid;
    @XmlElement(name = "Mobile")
    protected Long mobile;
    @XmlElement(name = "ReqDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqDate;
    @XmlElement(name = "Reqid")
    protected Integer reqid;
    @XmlElementRef(name = "invname", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invname;

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBranch(Short value) {
        this.branch = value;
    }

    /**
     * Gets the value of the custid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustid() {
        return custid;
    }

    /**
     * Sets the value of the custid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustid(Long value) {
        this.custid = value;
    }

    /**
     * Gets the value of the custtype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCusttype() {
        return custtype;
    }

    /**
     * Sets the value of the custtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCusttype(Integer value) {
        this.custtype = value;
    }

    /**
     * Gets the value of the locid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocid() {
        return locid;
    }

    /**
     * Sets the value of the locid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocid(Integer value) {
        this.locid = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMobile(Long value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the reqDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqDate() {
        return reqDate;
    }

    /**
     * Sets the value of the reqDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqDate(XMLGregorianCalendar value) {
        this.reqDate = value;
    }

    /**
     * Gets the value of the reqid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReqid() {
        return reqid;
    }

    /**
     * Sets the value of the reqid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReqid(Integer value) {
        this.reqid = value;
    }

    /**
     * Gets the value of the invname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvname() {
        return invname;
    }

    /**
     * Sets the value of the invname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvname(JAXBElement<String> value) {
        this.invname = value;
    }

}
