
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
 *         &lt;element name="Blockno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HAxis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Locid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Planno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Plotno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VAxis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bldpermno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="cityname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="distname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="placecode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="usecode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
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
    "blockno",
    "hAxis",
    "locid",
    "planno",
    "plotno",
    "vAxis",
    "bldpermno",
    "cityid",
    "cityname",
    "distid",
    "distname",
    "placecode",
    "usecode"
})
public class LocationData {

    @XmlElementRef(name = "Blockno", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> blockno;
    @XmlElementRef(name = "HAxis", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hAxis;
    @XmlElement(name = "Locid")
    protected Integer locid;
    @XmlElementRef(name = "Planno", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> planno;
    @XmlElementRef(name = "Plotno", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> plotno;
    @XmlElementRef(name = "VAxis", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vAxis;
    @XmlElementRef(name = "bldpermno", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bldpermno;
    protected Short cityid;
    @XmlElementRef(name = "cityname", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cityname;
    protected Short distid;
    @XmlElementRef(name = "distname", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distname;
    protected Short placecode;
    protected Short usecode;

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
     * Gets the value of the hAxis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHAxis() {
        return hAxis;
    }

    /**
     * Sets the value of the hAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHAxis(JAXBElement<String> value) {
        this.hAxis = value;
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
     * Gets the value of the vAxis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVAxis() {
        return vAxis;
    }

    /**
     * Sets the value of the vAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVAxis(JAXBElement<String> value) {
        this.vAxis = value;
    }

    /**
     * Gets the value of the bldpermno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBldpermno() {
        return bldpermno;
    }

    /**
     * Sets the value of the bldpermno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBldpermno(JAXBElement<String> value) {
        this.bldpermno = value;
    }

    /**
     * Gets the value of the cityid property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCityid() {
        return cityid;
    }

    /**
     * Sets the value of the cityid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCityid(Short value) {
        this.cityid = value;
    }

    /**
     * Gets the value of the cityname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCityname() {
        return cityname;
    }

    /**
     * Sets the value of the cityname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCityname(JAXBElement<String> value) {
        this.cityname = value;
    }

    /**
     * Gets the value of the distid property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDistid() {
        return distid;
    }

    /**
     * Sets the value of the distid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDistid(Short value) {
        this.distid = value;
    }

    /**
     * Gets the value of the distname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistname() {
        return distname;
    }

    /**
     * Sets the value of the distname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistname(JAXBElement<String> value) {
        this.distname = value;
    }

    /**
     * Gets the value of the placecode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPlacecode() {
        return placecode;
    }

    /**
     * Sets the value of the placecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPlacecode(Short value) {
        this.placecode = value;
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

}
