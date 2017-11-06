
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.udsdocument.ConnectionAgreement;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getConnectionAgreementResult" type="{http://schemas.datacontract.org/2004/07/UDSDocument}ConnectionAgreement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getConnectionAgreementResult"
})
@XmlRootElement(name = "getConnectionAgreementResponse")
public class GetConnectionAgreementResponse {

    @XmlElementRef(name = "getConnectionAgreementResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ConnectionAgreement> getConnectionAgreementResult;

    /**
     * Gets the value of the getConnectionAgreementResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConnectionAgreement }{@code >}
     *     
     */
    public JAXBElement<ConnectionAgreement> getGetConnectionAgreementResult() {
        return getConnectionAgreementResult;
    }

    /**
     * Sets the value of the getConnectionAgreementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConnectionAgreement }{@code >}
     *     
     */
    public void setGetConnectionAgreementResult(JAXBElement<ConnectionAgreement> value) {
        this.getConnectionAgreementResult = value;
    }

}
