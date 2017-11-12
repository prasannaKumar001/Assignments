
package org.datacontract.schemas._2004._07;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReqDetailNew complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReqDetailNew"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CapAmpere" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CapKVA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CapType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="Capacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UnitCount" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="UnitType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="UnitTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Unitarea" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReqDetailNew", propOrder = {
    "capAmpere",
    "capKVA",
    "capType",
    "capacity",
    "unitCount",
    "unitType",
    "unitTypeName",
    "unitarea"
})
public class ReqDetailNew {

    @XmlElement(name = "CapAmpere")
    protected Integer capAmpere;
    @XmlElement(name = "CapKVA")
    protected BigDecimal capKVA;
    @XmlElement(name = "CapType")
    protected Short capType;
    @XmlElement(name = "Capacity")
    protected Integer capacity;
    @XmlElement(name = "UnitCount")
    protected Short unitCount;
    @XmlElement(name = "UnitType")
    protected Short unitType;
    @XmlElementRef(name = "UnitTypeName", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitTypeName;
    @XmlElement(name = "Unitarea")
    protected Integer unitarea;

    /**
     * Gets the value of the capAmpere property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapAmpere() {
        return capAmpere;
    }

    /**
     * Sets the value of the capAmpere property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapAmpere(Integer value) {
        this.capAmpere = value;
    }

    /**
     * Gets the value of the capKVA property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapKVA() {
        return capKVA;
    }

    /**
     * Sets the value of the capKVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapKVA(BigDecimal value) {
        this.capKVA = value;
    }

    /**
     * Gets the value of the capType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCapType() {
        return capType;
    }

    /**
     * Sets the value of the capType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCapType(Short value) {
        this.capType = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapacity(Integer value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the unitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUnitCount() {
        return unitCount;
    }

    /**
     * Sets the value of the unitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUnitCount(Short value) {
        this.unitCount = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUnitType(Short value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the unitTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitTypeName() {
        return unitTypeName;
    }

    /**
     * Sets the value of the unitTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitTypeName(JAXBElement<String> value) {
        this.unitTypeName = value;
    }

    /**
     * Gets the value of the unitarea property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitarea() {
        return unitarea;
    }

    /**
     * Sets the value of the unitarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitarea(Integer value) {
        this.unitarea = value;
    }

}
