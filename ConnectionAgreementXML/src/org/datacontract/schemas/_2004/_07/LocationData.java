
package org.datacontract.schemas._2004._07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BldPermDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BldPermno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Blockno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeedNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocCityId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="LocCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocDistId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="LocDistName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Locid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Planno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Plotno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Usecode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="UsecodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VoltId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationData", propOrder = {
    "bldPermDt",
    "bldPermno",
    "blockno",
    "deedDate",
    "deedNo",
    "locAddress",
    "locCityId",
    "locCityName",
    "locDistId",
    "locDistName",
    "locid",
    "planno",
    "plotno",
    "usecode",
    "usecodeName",
    "voltId"
})
public class LocationData {

    @XmlElementRef(name = "BldPermDt", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bldPermDt;
    @XmlElementRef(name = "BldPermno", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bldPermno;
    @XmlElementRef(name = "Blockno", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> blockno;
    @XmlElementRef(name = "DeedDate", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deedDate;
    @XmlElementRef(name = "DeedNo", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deedNo;
    @XmlElementRef(name = "LocAddress", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locAddress;
    @XmlElement(name = "LocCityId")
    protected Short locCityId;
    @XmlElementRef(name = "LocCityName", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locCityName;
    @XmlElement(name = "LocDistId")
    protected Short locDistId;
    @XmlElementRef(name = "LocDistName", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locDistName;
    @XmlElement(name = "Locid")
    protected Integer locid;
    @XmlElementRef(name = "Planno", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> planno;
    @XmlElementRef(name = "Plotno", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> plotno;
    @XmlElement(name = "Usecode")
    protected Short usecode;
    @XmlElementRef(name = "UsecodeName", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usecodeName;
    @XmlElement(name = "VoltId")
    protected Short voltId;

    /**
     * Gets the value of the bldPermDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBldPermDt() {
        return bldPermDt;
    }

    /**
     * Sets the value of the bldPermDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBldPermDt(JAXBElement<String> value) {
        this.bldPermDt = value;
    }

    /**
     * Gets the value of the bldPermno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBldPermno() {
        return bldPermno;
    }

    /**
     * Sets the value of the bldPermno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBldPermno(JAXBElement<String> value) {
        this.bldPermno = value;
    }

    /**
     * Gets the value of the blockno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlockno() {
        return blockno;
    }

    /**
     * Sets the value of the blockno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlockno(JAXBElement<String> value) {
        this.blockno = value;
    }

    /**
     * Gets the value of the deedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeedDate() {
        return deedDate;
    }

    /**
     * Sets the value of the deedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeedDate(JAXBElement<String> value) {
        this.deedDate = value;
    }

    /**
     * Gets the value of the deedNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeedNo() {
        return deedNo;
    }

    /**
     * Sets the value of the deedNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeedNo(JAXBElement<String> value) {
        this.deedNo = value;
    }

    /**
     * Gets the value of the locAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocAddress() {
        return locAddress;
    }

    /**
     * Sets the value of the locAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocAddress(JAXBElement<String> value) {
        this.locAddress = value;
    }

    /**
     * Gets the value of the locCityId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLocCityId() {
        return locCityId;
    }

    /**
     * Sets the value of the locCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLocCityId(Short value) {
        this.locCityId = value;
    }

    /**
     * Gets the value of the locCityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocCityName() {
        return locCityName;
    }

    /**
     * Sets the value of the locCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocCityName(JAXBElement<String> value) {
        this.locCityName = value;
    }

    /**
     * Gets the value of the locDistId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLocDistId() {
        return locDistId;
    }

    /**
     * Sets the value of the locDistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLocDistId(Short value) {
        this.locDistId = value;
    }

    /**
     * Gets the value of the locDistName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocDistName() {
        return locDistName;
    }

    /**
     * Sets the value of the locDistName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocDistName(JAXBElement<String> value) {
        this.locDistName = value;
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
     * Gets the value of the planno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlanno() {
        return planno;
    }

    /**
     * Sets the value of the planno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlanno(JAXBElement<String> value) {
        this.planno = value;
    }

    /**
     * Gets the value of the plotno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlotno() {
        return plotno;
    }

    /**
     * Sets the value of the plotno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlotno(JAXBElement<String> value) {
        this.plotno = value;
    }

    /**
     * Gets the value of the usecode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUsecode() {
        return usecode;
    }

    /**
     * Sets the value of the usecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUsecode(Short value) {
        this.usecode = value;
    }

    /**
     * Gets the value of the usecodeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsecodeName() {
        return usecodeName;
    }

    /**
     * Sets the value of the usecodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsecodeName(JAXBElement<String> value) {
        this.usecodeName = value;
    }

    /**
     * Gets the value of the voltId property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVoltId() {
        return voltId;
    }

    /**
     * Sets the value of the voltId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVoltId(Short value) {
        this.voltId = value;
    }

}
