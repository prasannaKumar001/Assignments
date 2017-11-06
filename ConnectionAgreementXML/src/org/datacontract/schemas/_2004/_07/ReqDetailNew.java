
package org.datacontract.schemas._2004._07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="Reqtype" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="captype" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="capunit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="seq" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="unitarea" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="unitcount" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="unittype" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
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
    "reqtype",
    "captype",
    "capunit",
    "seq",
    "unitarea",
    "unitcount",
    "unittype"
})
public class ReqDetailNew {

    @XmlElement(name = "Reqtype")
    protected Short reqtype;
    protected Short captype;
    protected Integer capunit;
    protected Short seq;
    protected Integer unitarea;
    protected Short unitcount;
    protected Short unittype;

    /**
     * Gets the value of the reqtype property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getReqtype() {
        return reqtype;
    }

    /**
     * Sets the value of the reqtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setReqtype(Short value) {
        this.reqtype = value;
    }

    /**
     * Gets the value of the captype property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCaptype() {
        return captype;
    }

    /**
     * Sets the value of the captype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCaptype(Short value) {
        this.captype = value;
    }

    /**
     * Gets the value of the capunit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapunit() {
        return capunit;
    }

    /**
     * Sets the value of the capunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapunit(Integer value) {
        this.capunit = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSeq(Short value) {
        this.seq = value;
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

    /**
     * Gets the value of the unitcount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUnitcount() {
        return unitcount;
    }

    /**
     * Sets the value of the unitcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUnitcount(Short value) {
        this.unitcount = value;
    }

    /**
     * Gets the value of the unittype property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUnittype() {
        return unittype;
    }

    /**
     * Sets the value of the unittype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUnittype(Short value) {
        this.unittype = value;
    }

}
