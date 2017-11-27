
package org.tempuri;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.datacontract.schemas._2004._07.udsdocument.ServiceResponse;

import com.se.ot.xml.XML;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-12T09:49:52.003+03:00
 * Generated source version: 3.2.0
 * 
 */
public final class IUDSDocumentSrvcLib_BasicHttpBindingIUDSDocumentSrvcLib_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "UDSDocumentSrvcLib");

    private IUDSDocumentSrvcLib_BasicHttpBindingIUDSDocumentSrvcLib_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = UDSDocumentSrvcLib.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        UDSDocumentSrvcLib ss = new UDSDocumentSrvcLib(wsdlURL, SERVICE_NAME);
        IUDSDocumentSrvcLib port = ss.getBasicHttpBindingIUDSDocumentSrvcLib();  
        
        {
        System.out.println("Invoking getConnectionAgreement...");
        java.lang.Integer _getConnectionAgreement_reqID = Integer.valueOf(172500075);
        try {
            org.datacontract.schemas._2004._07.udsdocument.ConnectionAgreement _getConnectionAgreement__return = port.getConnectionAgreement(_getConnectionAgreement_reqID);
            //System.out.println("getConnectionAgreement.result=" + _getConnectionAgreement__return);
            JAXBElement<ServiceResponse> serviceResponse=_getConnectionAgreement__return.getResponse();
            ServiceResponse serResponse=serviceResponse.getValue();
            
            if(serResponse.getCode()==0)
            {
            	XML.createXML(_getConnectionAgreement__return,"ZINSTLNCON","en");
            }
            else
            {
            	JAXBElement<String> errMsg=serResponse.getMessage();
            	String error=errMsg.getValue();
            	System.out.println("response code: "+serResponse.getCode() +"     response meaage: "+ error);
            }
        } catch (IUDSDocumentSrvcLibGetConnectionAgreementServiceResponseFaultFaultMessage e) { 
            System.out.println("Expected exception: IUDSDocumentSrvcLib_getConnectionAgreement_ServiceResponseFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
