
package org.datacontract.schemas._2004._07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReqDetailExist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReqDetailExist"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Reqtype" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="part1" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="part2" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="part3" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="part4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="prvcapid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="reqcapid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="reqmeter" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReqDetailExist", propOrder = {
    "reqtype",
    "branch",
    "part1",
    "part2",
    "part3",
    "part4",
    "prvcapid",
    "reqcapid",
    "reqmeter"
})
public class ReqDetailExist {

    @XmlElement(name = "Reqtype")
    protected Short reqtype;
    protected Short branch;
    protected Short part1;
    protected Short part2;
    protected Short part3;
    protected Integer part4;
    protected Integer prvcapid;
    protected Integer reqcapid;
    protected Short reqmeter;

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
     * Gets the value of the part1 property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPart1() {
        return part1;
    }

    /**
     * Sets the value of the part1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPart1(Short value) {
        this.part1 = value;
    }

    /**
     * Gets the value of the part2 property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPart2() {
        return part2;
    }

    /**
     * Sets the value of the part2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPart2(Short value) {
        this.part2 = value;
    }

    /**
     * Gets the value of the part3 property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPart3() {
        return part3;
    }

    /**
     * Sets the value of the part3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPart3(Short value) {
        this.part3 = value;
    }

    /**
     * Gets the value of the part4 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPart4() {
        return part4;
    }

    /**
     * Sets the value of the part4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPart4(Integer value) {
        this.part4 = value;
    }

    /**
     * Gets the value of the prvcapid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrvcapid() {
        return prvcapid;
    }

    /**
     * Sets the value of the prvcapid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrvcapid(Integer value) {
        this.prvcapid = value;
    }

    /**
     * Gets the value of the reqcapid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReqcapid() {
        return reqcapid;
    }

    /**
     * Sets the value of the reqcapid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReqcapid(Integer value) {
        this.reqcapid = value;
    }

    /**
     * Gets the value of the reqmeter property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getReqmeter() {
        return reqmeter;
    }

    /**
     * Sets the value of the reqmeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setReqmeter(Short value) {
        this.reqmeter = value;
    }

}
