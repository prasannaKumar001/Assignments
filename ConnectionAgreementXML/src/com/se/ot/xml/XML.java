package com.se.ot.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.datacontract.schemas._2004._07.udsdocument.ConnectionAgreement;
import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class XML {
	
	public String createXML(ConnectionAgreement connectionAgreement)
	{
		try
		{
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("UDS");
			doc.appendChild(rootElement);
			
				Element REQID = doc.createElement("REQID");
				REQID.appendChild(doc.createTextNode(String.valueOf(connectionAgreement.getCustData())));
				rootElement.appendChild(REQID);
			
				Element PRNSEQ = doc.createElement("PRNSEQ");
				PRNSEQ.appendChild(doc.createTextNode(String.valueOf(noc.getPRNSEQ())));
				rootElement.appendChild(PRNSEQ);
				
				Element TEXT_NO = doc.createElement("TEXT_NO");
				TEXT_NO.appendChild(doc.createTextNode(String.valueOf(noc.getTEXTNO())));
				rootElement.appendChild(TEXT_NO);
				
				Element REGION = doc.createElement("REGION");
				REGION.appendChild(doc.createTextNode(String.valueOf(noc.getREGION())));
				rootElement.appendChild(REGION);
				
				Element DEPARTMENT = doc.createElement("DEPARTMENT");
				DEPARTMENT.appendChild(doc.createTextNode(noc.getDEPARTMENT()));
				rootElement.appendChild(DEPARTMENT);
				
				Element OFFICE = doc.createElement("OFFICE");
				OFFICE.appendChild(doc.createTextNode(noc.getOFFICE()));
				rootElement.appendChild(OFFICE);
				
				Element NOC_NO = doc.createElement("NOC_NO");
				NOC_NO.appendChild(doc.createTextNode(String.valueOf(noc.getNOCNO())));
				rootElement.appendChild(NOC_NO);
				
				Element APL_DATE = doc.createElement("APL_DATE");
				APL_DATE.appendChild(doc.createTextNode(String.valueOf(noc.getAPLDATE())));
				rootElement.appendChild(APL_DATE);
				
				Element BALADIA = doc.createElement("BALADIA");
				BALADIA.appendChild(doc.createTextNode(noc.getBALADIA()));
				rootElement.appendChild(BALADIA);
				
				Element CUST_NAME = doc.createElement("CUST_NAME");
				CUST_NAME.appendChild(doc.createTextNode(noc.getCUSTNAME()));
				rootElement.appendChild(CUST_NAME);
				
				Element LETTER_NO = doc.createElement("LETTER_NO");
				LETTER_NO.appendChild(doc.createTextNode(noc.getLETTERNO()));
				rootElement.appendChild(LETTER_NO);
				
				Element LETTER_DATE = doc.createElement("LETTER_DATE");
				LETTER_DATE.appendChild(doc.createTextNode(noc.getLETTERDATE()));
				rootElement.appendChild(LETTER_DATE);
				
				Element PLAN_NO = doc.createElement("PLAN_NO");
				PLAN_NO.appendChild(doc.createTextNode(noc.getPLANNO()));
				rootElement.appendChild(PLAN_NO);
				
				Element BLOCK_NO = doc.createElement("BLOCK_NO");
				BLOCK_NO.appendChild(doc.createTextNode(noc.getBLOCKNO()));
				rootElement.appendChild(BLOCK_NO);
				
				Element PLOT_NO = doc.createElement("PLOT_NO");
				PLOT_NO.appendChild(doc.createTextNode(noc.getPLOTNO()));
				rootElement.appendChild(PLOT_NO);
				
				Element NO_OF_FLOOR = doc.createElement("NO_OF_FLOOR");
				NO_OF_FLOOR.appendChild(doc.createTextNode(String.valueOf(noc.getNOOFFLOOR())));
				rootElement.appendChild(NO_OF_FLOOR);
				
				Element BULDING_AREA = doc.createElement("BULDING_AREA");
				BULDING_AREA.appendChild(doc.createTextNode(String.valueOf(noc.getBULDINGAREA())));
				rootElement.appendChild(BULDING_AREA);
				
				Element RESID_UNIT_NO = doc.createElement("RESID_UNIT_NO");
				RESID_UNIT_NO.appendChild(doc.createTextNode(String.valueOf(noc.getRESIDUNITNO())));
				rootElement.appendChild(RESID_UNIT_NO);
				
				Element RESID_UNIT_LOAD = doc.createElement("RESID_UNIT_LOAD");
				RESID_UNIT_LOAD.appendChild(doc.createTextNode(String.valueOf(noc.getRESIDUNITLOAD())));
				rootElement.appendChild(RESID_UNIT_LOAD);
				
				Element COMM_UNIT_NO = doc.createElement("COMM_UNIT_NO");
				COMM_UNIT_NO.appendChild(doc.createTextNode(String.valueOf(noc.getCOMMUNITNO())));
				rootElement.appendChild(COMM_UNIT_NO);
				
				Element COMM_UNIT_LOAD = doc.createElement("COMM_UNIT_LOAD");
				COMM_UNIT_LOAD.appendChild(doc.createTextNode(String.valueOf(noc.getCOMMUNITLOAD())));
				rootElement.appendChild(COMM_UNIT_LOAD);
				
				Element INDUST_UNIT_NO = doc.createElement("INDUST_UNIT_NO");
				INDUST_UNIT_NO.appendChild(doc.createTextNode(String.valueOf(noc.getINDUSTUNITNO())));
				rootElement.appendChild(INDUST_UNIT_NO);
				
				Element INDUST_UNIT_LOAD = doc.createElement("INDUST_UNIT_LOAD");
				INDUST_UNIT_LOAD.appendChild(doc.createTextNode(String.valueOf(noc.getINDUSTUNITLOAD())));
				rootElement.appendChild(INDUST_UNIT_LOAD);
				
				Element SERVICE_UNIT_NO = doc.createElement("SERVICE_UNIT_NO");
				SERVICE_UNIT_NO.appendChild(doc.createTextNode(String.valueOf(noc.getSERVICEUNITNO())));
				rootElement.appendChild(SERVICE_UNIT_NO);
				
				Element SERVICE_UNIT_NLOAD = doc.createElement("SERVICE_UNIT_NLOAD");
				SERVICE_UNIT_NLOAD.appendChild(doc.createTextNode(String.valueOf(noc.getSERVICEUNITNLOAD())));
				rootElement.appendChild(SERVICE_UNIT_NLOAD);
				
				Element BULDING_LOAD_TOTAL = doc.createElement("BULDING_LOAD_TOTAL");
				BULDING_LOAD_TOTAL.appendChild(doc.createTextNode(String.valueOf(noc.getBULDINGLOADTOTAL())));
				rootElement.appendChild(BULDING_LOAD_TOTAL);
				
				Element NOC_APPROVE = doc.createElement("NOC_APPROVE");
				NOC_APPROVE.appendChild(doc.createTextNode(noc.getNOCAPPROVE()));
				rootElement.appendChild(NOC_APPROVE);
				
				Element APPROVE_NAME = doc.createElement("APPROVE_NAME");
				APPROVE_NAME.appendChild(doc.createTextNode(noc.getAPPROVENAME()));
				rootElement.appendChild(APPROVE_NAME);
				
				Element CUST_NAME_P = doc.createElement("CUST_NAME_P");
				CUST_NAME_P.appendChild(doc.createTextNode(noc.getCUSTNAME()));
				rootElement.appendChild(CUST_NAME_P);
				
				Element PRINT_DATE = doc.createElement("PRINT_DATE");
				PRINT_DATE.appendChild(doc.createTextNode(String.valueOf(noc.getPRINTDATE())));
				rootElement.appendChild(PRINT_DATE);
				
				Element ROOM_LENGTH_TEXT = doc.createElement("ROOM_LENGTH_TEXT");
				ROOM_LENGTH_TEXT.appendChild(doc.createTextNode(String.valueOf(noc.getROOMLENGTHTEXT())));
				rootElement.appendChild(ROOM_LENGTH_TEXT);
				
				Element ROOM_WIDTH_TEXT = doc.createElement("ROOM_WIDTH_TEXT");
				ROOM_WIDTH_TEXT.appendChild(doc.createTextNode(String.valueOf(noc.getROOMWIDTHTEXT())));
				rootElement.appendChild(ROOM_WIDTH_TEXT);
				
				Element LOCATION_SIDE_TEXT = doc.createElement("LOCATION_SIDE_TEXT");
				LOCATION_SIDE_TEXT.appendChild(doc.createTextNode(noc.getLOCATIONSIDETEXT()));
				rootElement.appendChild(LOCATION_SIDE_TEXT);
				
				Element PLAN_NO_TEXT = doc.createElement("PLAN_NO_TEXT");
				PLAN_NO_TEXT.appendChild(doc.createTextNode(String.valueOf(noc.getPLANNOTEXT())));
				rootElement.appendChild(PLAN_NO_TEXT);
				
				Element LOCTION_LENGTH_TXT = doc.createElement("LOCTION_LENGTH_TXT");
				LOCTION_LENGTH_TXT.appendChild(doc.createTextNode(String.valueOf(noc.getLOCTIONLENGTHTXT())));
				rootElement.appendChild(LOCTION_LENGTH_TXT);
			
				Element LOCATION_WIDTH_TXT = doc.createElement("LOCATION_WIDTH_TXT");
				LOCATION_WIDTH_TXT.appendChild(doc.createTextNode(String.valueOf(noc.getLOCATIONWIDTHTXT())));
				rootElement.appendChild(LOCATION_WIDTH_TXT);
				
				Element EMAIL = doc.createElement("EMAIL");
				EMAIL.appendChild(doc.createTextNode(noc.getEMAIL()));
				rootElement.appendChild(EMAIL);
				
				Element RespCode = doc.createElement("RespCode");
				RespCode.appendChild(doc.createTextNode(String.valueOf(noc.getRespCode())));
				rootElement.appendChild(RespCode);
			
				Element RespMsg = doc.createElement("RespMsg");
				RespMsg.appendChild(doc.createTextNode(noc.getRespMsg()));
				rootElement.appendChild(RespMsg);
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("uds.xml"));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

			System.out.println("File saved!");
				
		}
		catch(ParserConfigurationException | TransformerException e)
		{
			e.printStackTrace();
			return "File save failed!! ";
		}

		
		return "File saved!";
		
	}

}
