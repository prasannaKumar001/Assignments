
package org.datacontract.schemas._2004._07;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfReqDetailNew complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReqDetailNew"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqDetailNew" type="{http://schemas.datacontract.org/2004/07/}ReqDetailNew" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReqDetailNew", propOrder = {
    "reqDetailNew"
})
public class ArrayOfReqDetailNew {

    @XmlElement(name = "ReqDetailNew", nillable = true)
    protected List<ReqDetailNew> reqDetailNew;

    /**
     * Gets the value of the reqDetailNew property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqDetailNew property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqDetailNew().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReqDetailNew }
     * 
     * 
     */
    public List<ReqDetailNew> getReqDetailNew() {
        if (reqDetailNew == null) {
            reqDetailNew = new ArrayList<ReqDetailNew>();
        }
        return this.reqDetailNew;
    }

}
