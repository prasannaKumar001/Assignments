package com.se.ot.xml;

import java.io.File;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.datacontract.schemas._2004._07.ArrayOfReqDetailExist;
import org.datacontract.schemas._2004._07.ArrayOfReqDetailNew;
import org.datacontract.schemas._2004._07.ArrayOfRequestType;
import org.datacontract.schemas._2004._07.CustomerData;
import org.datacontract.schemas._2004._07.LocationData;
import org.datacontract.schemas._2004._07.ReqDetailNew;
import org.datacontract.schemas._2004._07.RequestData;
import org.datacontract.schemas._2004._07.RequestType;
import org.datacontract.schemas._2004._07.udsdocument.ConnectionAgreement;
import org.datacontract.schemas._2004._07.udsdocument.ServiceResponse;
import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class XML {
	
	public static String createXML(ConnectionAgreement connectionAgreement)
	{
		try
		{
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			Map<String,String>connectionAgrmntFlds=getCA(connectionAgreement);
			
			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("Agreement");
			doc.appendChild(rootElement);
			
			Element requestNumber = doc.createElement("Reqid");
			if(connectionAgrmntFlds.get("RequestID")!=null)
			{
				requestNumber.appendChild(doc.createTextNode(connectionAgrmntFlds.get("RequestID")));
			}
			rootElement.appendChild(requestNumber);	
			
			Element reqdate = doc.createElement("ReqDate");
			if(connectionAgrmntFlds.get("RequestDate")!=null)
			{
				reqdate.appendChild(doc.createTextNode(connectionAgrmntFlds.get("RequestDate")));
			}
			rootElement.appendChild(reqdate);
			
			Element ReqType = doc.createElement("ReqType");
			if(connectionAgrmntFlds.get("ReqType")!=null)
			{
				ReqType.appendChild(doc.createTextNode(connectionAgrmntFlds.get("RequestType")));
			}
			rootElement.appendChild(ReqType);
			
			Element FirstName = doc.createElement("FirstName");
			if(connectionAgrmntFlds.get("FirstName")!=null)
			{
				FirstName.appendChild(doc.createTextNode(connectionAgrmntFlds.get("FirstName")));
			}
			rootElement.appendChild(FirstName);
			
			Element FatherName = doc.createElement("FatherName");
			if(connectionAgrmntFlds.get("FatherName")!=null)
			{
				FatherName.appendChild(doc.createTextNode(connectionAgrmntFlds.get("FatherName")));
			}
			rootElement.appendChild(FatherName);
			
			Element GrandFatherName = doc.createElement("FatherName");
			if(connectionAgrmntFlds.get("GrandFatherName")!=null)
			{
				GrandFatherName.appendChild(doc.createTextNode(connectionAgrmntFlds.get("GrandFatherName")));
			}
			rootElement.appendChild(GrandFatherName);
			
			Element FamilyName = doc.createElement("FamilyName");
			if(connectionAgrmntFlds.get("FamilyName")!=null)
			{
				FamilyName.appendChild(doc.createTextNode(connectionAgrmntFlds.get("FamilyName")));
			}
			rootElement.appendChild(FamilyName);
			
			Element CustID = doc.createElement("CustID");
			if(connectionAgrmntFlds.get("CustID")!=null)
			{
				CustID.appendChild(doc.createTextNode(connectionAgrmntFlds.get("CustID")));
			}
			rootElement.appendChild(CustID);
			
			Element Nationality = doc.createElement("Nationality");
			if(connectionAgrmntFlds.get("Nationality")!=null)
			{
				Nationality.appendChild(doc.createTextNode(connectionAgrmntFlds.get("Nationality")));
			}
			rootElement.appendChild(Nationality);
			
			Element FullName = doc.createElement("FullName");
			if(connectionAgrmntFlds.get("FullName")!=null)
			{
				FullName.appendChild(doc.createTextNode(connectionAgrmntFlds.get("FullName")));
			}
			rootElement.appendChild(FullName);
			
			Element BookDate = doc.createElement("BookDate");
			if(connectionAgrmntFlds.get("BookDate")!=null)
			{
				BookDate.appendChild(doc.createTextNode(connectionAgrmntFlds.get("BookDate")));
			}
			rootElement.appendChild(BookDate);
			
			Element BookCityName = doc.createElement("BookCityName");
			if(connectionAgrmntFlds.get("BookCityName")!=null)
			{
				BookCityName.appendChild(doc.createTextNode(connectionAgrmntFlds.get("BookCityName")));
			}
			rootElement.appendChild(BookCityName);
			
			Element LocCityName = doc.createElement("LocCityName");
			if(connectionAgrmntFlds.get("LocCityName")!=null)
			{
				LocCityName.appendChild(doc.createTextNode(connectionAgrmntFlds.get("LocCityName")));
			}
			rootElement.appendChild(LocCityName);
			
			Element Planno = doc.createElement("Planno");
			if(connectionAgrmntFlds.get("Planno")!=null)
			{
				Planno.appendChild(doc.createTextNode(connectionAgrmntFlds.get("Planno")));
			}
			rootElement.appendChild(Planno);
			
			Element Plotno = doc.createElement("Plotno");
			if(connectionAgrmntFlds.get("PlotNo")!=null)
			{
				Plotno.appendChild(doc.createTextNode(connectionAgrmntFlds.get("PlotNo")));
			}
			rootElement.appendChild(Plotno);
			
			Element LocAddress = doc.createElement("LocAddress");
			if(connectionAgrmntFlds.get("LocAddress")!=null)
			{
				LocAddress.appendChild(doc.createTextNode(connectionAgrmntFlds.get("LocAddress")));
			}
			rootElement.appendChild(LocAddress);
			
			Element BldPermno = doc.createElement("BldPermno");
			if(connectionAgrmntFlds.get("BldPermno")!=null)
			{
				BldPermno.appendChild(doc.createTextNode(connectionAgrmntFlds.get("BldPermno")));
			}
			rootElement.appendChild(BldPermno);
			
			Element BldPermDt = doc.createElement("BldPermDt");
			if(connectionAgrmntFlds.get("BldPermDate")!=null)
			{
				BldPermDt.appendChild(doc.createTextNode(connectionAgrmntFlds.get("BldPermDate")));
			}
			rootElement.appendChild(BldPermDt);
			
			Element DeedNo = doc.createElement("DeedNo");
			if(connectionAgrmntFlds.get("DeedNo")!=null)
			{
				DeedNo.appendChild(doc.createTextNode(connectionAgrmntFlds.get("DeedNo")));
			}
			rootElement.appendChild(DeedNo);
			
			Element DeedDate = doc.createElement("DeedDate");
			if(connectionAgrmntFlds.get("DeedDate")!=null)
			{
				DeedDate.appendChild(doc.createTextNode(connectionAgrmntFlds.get("DeedDate")));
			}
			rootElement.appendChild(DeedDate);
			
			Element Mobile = doc.createElement("Mobile");
			if(connectionAgrmntFlds.get("MobileNumber")!=null)
			{
				Mobile.appendChild(doc.createTextNode(connectionAgrmntFlds.get("MobileNumber")));
			}
			rootElement.appendChild(Mobile);
			
			Element HomePhone = doc.createElement("HomePhone");
			if(connectionAgrmntFlds.get("HomePhone")!=null)
			{
				HomePhone.appendChild(doc.createTextNode(connectionAgrmntFlds.get("HomePhone")));
			}
			rootElement.appendChild(HomePhone);
			
			Element WorkPhone = doc.createElement("WorkPhone");
			if(connectionAgrmntFlds.get("WorkPhone")!=null)
			{
				WorkPhone.appendChild(doc.createTextNode(connectionAgrmntFlds.get("WorkPhone")));
			}
			rootElement.appendChild(WorkPhone);
			
			Element WorkPhoneEx = doc.createElement("WorkPhoneEx");
			if(connectionAgrmntFlds.get("WorkPhoneExt")!=null)
			{
				WorkPhoneEx.appendChild(doc.createTextNode(connectionAgrmntFlds.get("WorkPhoneExt")));
			}
			rootElement.appendChild(WorkPhoneEx);
			
			Element Email = doc.createElement("Email");
			if(connectionAgrmntFlds.get("Email")!=null)
			{
				Email.appendChild(doc.createTextNode(connectionAgrmntFlds.get("Email")));
			}
			rootElement.appendChild(Email);
			
			Element POBox = doc.createElement("POBox");
			if(connectionAgrmntFlds.get("POBox")!=null)
			{
				POBox.appendChild(doc.createTextNode(connectionAgrmntFlds.get("POBox")));
			}
			rootElement.appendChild(POBox);
			
			Element PostCode = doc.createElement("PostCode");
			if(connectionAgrmntFlds.get("PostCode")!=null)
			{
				PostCode.appendChild(doc.createTextNode(connectionAgrmntFlds.get("PostCode")));
			}
			rootElement.appendChild(PostCode);
			
			Element CityName = doc.createElement("CityName");
			if(connectionAgrmntFlds.get("CityName")!=null)
			{
				CityName.appendChild(doc.createTextNode(connectionAgrmntFlds.get("CityName")));
			}
			rootElement.appendChild(CityName);
			
			Element TotalArea = doc.createElement("TotalArea");
			if(connectionAgrmntFlds.get("TotalArea")!=null)
			{
				TotalArea.appendChild(doc.createTextNode(connectionAgrmntFlds.get("TotalArea")));
			}
			rootElement.appendChild(TotalArea);
			
			Element TotalAmpere = doc.createElement("TotalAmpere");
			if(connectionAgrmntFlds.get("TotalAmpere")!=null)
			{
				TotalAmpere.appendChild(doc.createTextNode(connectionAgrmntFlds.get("TotalAmpere")));
			}
			rootElement.appendChild(TotalAmpere);
			
			Element TotalKVA = doc.createElement("TotalKVA");
			if(connectionAgrmntFlds.get("TotalKVA")!=null)
			{
				TotalKVA.appendChild(doc.createTextNode(connectionAgrmntFlds.get("TotalKVA")));
			}
			rootElement.appendChild(TotalKVA);
			
			Element VoltId = doc.createElement("VoltId");
			if(connectionAgrmntFlds.get("VoltID")!=null)
			{
				VoltId.appendChild(doc.createTextNode(connectionAgrmntFlds.get("VoltID")));
			}
			rootElement.appendChild(VoltId);
			
			Element UnitType = doc.createElement("UnitType");
			if(connectionAgrmntFlds.get("UnitType")!=null)
			{
				UnitType.appendChild(doc.createTextNode(connectionAgrmntFlds.get("UnitType")));
			}
			else
			{
				if(connectionAgrmntFlds.get("UseCode")!=null)
				{
					UnitType.appendChild(doc.createTextNode(connectionAgrmntFlds.get("UseCode")));
				}
			}
			rootElement.appendChild(UnitType);
			
			Element requestedServiceInfo = doc.createElement("RequestedServiceInfo");
			rootElement.appendChild(requestedServiceInfo);
			
			Element UnitTypeName = doc.createElement("UnitTypeName");
			if(connectionAgrmntFlds.get("UnitTypeName")!=null)
			{
				UnitTypeName.appendChild(doc.createTextNode(connectionAgrmntFlds.get("UnitTypeName")));
			}
			requestedServiceInfo.appendChild(UnitTypeName);
			
			Element UnitCount = doc.createElement("UnitCount");
			if(connectionAgrmntFlds.get("UnitCount")!=null)
			{
				UnitCount.appendChild(doc.createTextNode(connectionAgrmntFlds.get("UnitCount")));
			}
			requestedServiceInfo.appendChild(UnitCount);
			
			Element UnitArea = doc.createElement("UnitArea");
			if(connectionAgrmntFlds.get("UnitArea")!=null)
			{
				UnitArea.appendChild(doc.createTextNode(connectionAgrmntFlds.get("UnitArea")));
			}
			requestedServiceInfo.appendChild(UnitArea);
			
			Element CapKVA = doc.createElement("CapKVA");
			if(connectionAgrmntFlds.get("CapKVA")!=null)
			{
				CapKVA.appendChild(doc.createTextNode(connectionAgrmntFlds.get("CapKVA")));
			}
			requestedServiceInfo.appendChild(CapKVA);
				
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			
			Transformer transformer = transformerFactory.newTransformer();

			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			
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
	
	 public static  Map<String,String> getCA(ConnectionAgreement ca)
     {
           Map <String,String> connectionAgreement=new HashMap<String ,String>();
           if (ca!=null)
           {
              JAXBElement<CustomerData> customerData=ca.getCustData();
              JAXBElement<ArrayOfReqDetailExist> arrayOfReqDetailExist=ca.getExistReqTypeList();
              JAXBElement<LocationData> locaData=ca.getLocData();
              JAXBElement<ArrayOfReqDetailNew> arrayOfReqDetailNew= ca.getNewReqTypeList();
              JAXBElement<RequestData> requestData=ca.getReqtData();
              JAXBElement<ArrayOfRequestType> arrayOfRequestType=ca.getReqTypeList();
              JAXBElement<ServiceResponse> serviceResponse=ca.getResponse();
             
              
              CustomerData custData=customerData.getValue();
              ArrayOfReqDetailExist arrOfReqDetailExit=arrayOfReqDetailExist.getValue();
              LocationData locData=locaData.getValue();
              ArrayOfReqDetailNew arrOfReqDetailNew=arrayOfReqDetailNew.getValue();
              RequestData reqData=requestData.getValue();
              ArrayOfRequestType arrOfReqType=arrayOfRequestType.getValue();
              ServiceResponse serResponse=serviceResponse.getValue();
             
              if(custData!=null)
              {
            	//MobileNumber
            	  JAXBElement<String> mobileVal=custData.getMobile();
            	  String mobile=null;
            	  if(mobileVal!=null)
            	  {
            		  mobile=mobileVal.getValue();
            		  connectionAgreement.put("MobileNumber", mobile);  
            	  }
            	  
            	//HomePhone
            	  Integer homePhoneVal=custData.getHomePhone();
            	  String homePhone=null;
            	  if(homePhoneVal!=null)
            	  {
            		  homePhone=String.valueOf(homePhoneVal);
            	  }
            	  if(homePhone!=null)
            	  {
            		  connectionAgreement.put("HomePhone", homePhone);  
            	  }
            	  
            	//WorkPhone
            	  Integer workPhoneVal=custData.getWorkPhone();
            	  String workPhone=null;
            	  if(workPhoneVal!=null)
            	  {
            		  workPhone=String.valueOf(workPhoneVal);
            	  }
            	  if(workPhone!=null)
            	  {
            		  connectionAgreement.put("WorkPhone", workPhone);  
            	  }
                  
            	//WorkPhoneExt
            	  Short workPhoneExtVal=custData.getWorkPhoneEx();
            	  String workPhoneExt=null;
            	  if(workPhoneExtVal!=null)
            	  {
            		  workPhoneExt=String.valueOf(workPhoneExtVal);
            	  }
            	  if(workPhoneExt!=null)
            	  {
            		  connectionAgreement.put("WorkPhoneExt", workPhoneExt); 
            	  }
            	  
            	//HomePhoneExt
            	  Short homePhoneExtval=custData.getHomePhoneEx();
            	  String homePhoneExt=null;
            	  if(homePhoneExtval!=null)
            	  {
            		  homePhoneExt=String.valueOf(homePhoneExtval);
            	  }
            	  if(homePhoneExt!=null)
            	  {
            		  connectionAgreement.put("HomePhoneExt", homePhoneExt);
            	  }
            	  
            	//Email
            	  JAXBElement<String> emailVal=custData.getEmail();
            	  String email=null;
            	  if(emailVal!=null)
            	  {
            		  email=emailVal.getValue();
            		  connectionAgreement.put("Email", email);
            	  }
            	  
            	//POBox
            	  JAXBElement<String> poBoxVal=custData.getPOBox();
            	  String POBox=null;
            	  if(poBoxVal!=null)
            	  {
            		  POBox=poBoxVal.getValue();
            		  connectionAgreement.put("POBox", POBox);
            	  }
            	  
            	//PostCode
            	  Integer postCodeVal=custData.getPostCode();
            	  String postCode=null;
            	  if(postCodeVal!=null)
            	  {
            		  postCode=String.valueOf(postCodeVal);
            		  connectionAgreement.put("PostCode", postCode);
            	  }
            	 
            	//CityName
            	  JAXBElement<String> cityNameVal=custData.getCityName();
            	  String cityName=null;
            	  if(cityNameVal!=null)
            	  {
            		 cityName=cityNameVal.getValue();
            		 connectionAgreement.put("CityName", cityName);
            	  }
                  
            	//FirstName
            	  JAXBElement<String> firstNameVal=custData.getFirstName();
            	  String firstName=null;
            	  if(firstNameVal!=null)
            	  {
            		  firstName=firstNameVal.getValue(); 
            		  connectionAgreement.put("FirstName", firstName);
            	  }
            	  
            	//FatherName
            	  JAXBElement<String> fatherNameVal=custData.getFatherName();
            	  String fatherName=null;
            	  if(fatherNameVal!=null)
            	  {
            		  fatherName=fatherNameVal.getValue();
            		  connectionAgreement.put("FatherName", fatherName);
            	  }
            	  
            	//GrandFatherName
            	  JAXBElement<String> grandFatherNameVal=custData.getGrandFatherName();
            	  String grandFatherName=null;
            	  if(grandFatherNameVal!=null)
            	  {
            		  grandFatherName=grandFatherNameVal.getValue();
            		  connectionAgreement.put("GrandFatherName", grandFatherName);	  
            	  }
            	  
            	//FamilyName
            	  JAXBElement<String> familyNameVal=custData.getFamilyName();
            	  String familyName=null;
            	  if(familyNameVal!=null)
            	  {
            		  familyName=familyNameVal.getValue();
            		  connectionAgreement.put("FamilyName", familyName);
            	  }
            	  
            	//CustID
            	  BigDecimal custIDVal=custData.getCustID();
            	  String custID=null;
            	  if(custIDVal!=null)
            	  {
            		  custID=String.valueOf(custIDVal);
            		  connectionAgreement.put("CustID", custID);
            	  }
            	  
            	//Nationality
            	  JAXBElement<String> nationalityVal=custData.getNationality();
            	  String nationality=null;
            	  if(nationalityVal!=null)
            	  {
            		  nationality=nationalityVal.getValue();
            		  connectionAgreement.put("Nationality", nationality);
            	  }
            	  
            	//FullName
            	  JAXBElement<String> fullNameval=custData.getFullName();
            	  String fullName=null;
            	  if(fullNameval!=null)
            	  {
            		  fullName=fullNameval.getValue();
            		  connectionAgreement.put("FullName", fullName);
            	  }
            	 
            	//BookDate
            	  JAXBElement<String>bookDateVal=custData.getBookDate();
            	  String bookDate=null;
            	  if(bookDateVal!=null)
            	  {
            		  bookDate=bookDateVal.getValue();
            		  connectionAgreement.put("BookDate", bookDate);
            	  }
            	  
            	//BookCityName
            	  JAXBElement<String> bookCityNameVal=custData.getBookCityName();
            	  String bookCityName=null;
            	  if(bookCityNameVal!=null)
            	  {
            		  bookCityName=bookCityNameVal.getValue();
            		  connectionAgreement.put("BookCityName", bookCityName);
            	  }
              }
              
              if(locData!=null)
              {
            	 //LocCityName
            	  JAXBElement<String> locCityNameVal=locData.getLocCityName();
            	  String locCityName=null;
            	  if(locCityNameVal!=null)
            	  {
            		  locCityName=locCityNameVal.getValue();
            		  connectionAgreement.put("LocCityName", locCityName);
            	  }
            	  
            	//PlanNo
            	  JAXBElement<String> planNoVal=locData.getPlanno();
            	  String planNo=null;
            	  if(planNoVal!=null)
            	  {
            		  planNo=planNoVal.getValue();
            		  connectionAgreement.put("PlanNo", planNo);
            	  }
            	  
            	//PlotNo
            	  JAXBElement<String> plotNoVal=locData.getPlotno();
            	  String plotNo=null;
            	  if(plotNoVal!=null)
            	  {
            		  plotNo=plotNoVal.getValue();
            		  connectionAgreement.put("PlotNo", plotNo);
            	  }
            	  
            	//LocAddress
            	  JAXBElement<String> locAddressVal=locData.getLocAddress();
            	  String locAddress=null;
            	  if(locAddressVal!=null)
            	  {
            		  locAddress=locAddressVal.getValue();
            		  connectionAgreement.put("LocAddress", locAddress);
            	  }
            	  
            	//BldPermNo
            	  JAXBElement<String> bldPermNoVal=locData.getBldPermno();
            	  String bldPermNo=null;
            	  if(bldPermNoVal!=null)
            	  {
            		  bldPermNo=bldPermNoVal.getValue();
            		  connectionAgreement.put("BldPermNo", bldPermNo);
            	  }
            	  
            	//BldPermDate
            	  JAXBElement<String>bldPermDateVal=locData.getBldPermDt();
            	  String bldPermDate=null;
            	  if(bldPermDateVal!=null)
            	  {
            		  bldPermDate=bldPermDateVal.getValue();
            		  connectionAgreement.put("BldPermDate",bldPermDate);
            	  }
            	  
            	//DeedNo
            	  JAXBElement<String> deedNoVal=locData.getDeedNo();
            	  String deedNo=null;
            	  if(deedNoVal!=null)
            	  {
            		  deedNo=deedNoVal.getValue();
            		  connectionAgreement.put("DeedNo", deedNo);
            	  }
            	  
            	//DeedDate
            	  JAXBElement<String> deedDateVal=locData.getDeedDate();
            	  String deedDate=null;
            	  if(deedDateVal!=null)
            	  {
            		  deedDate=deedDateVal.getValue();
            		  connectionAgreement.put("DeedDate", deedDate);
            	  }	
            	  
            	//UseCode
            	  Short useCodeVal=locData.getUsecode();
            	  String useCode=null;
            	  if(useCodeVal!=null)
            	  {
            		  useCode=String.valueOf(useCodeVal);
            		  connectionAgreement.put("UseCode", useCode);
            	  }
              }
              
              if(reqData!=null)
              {
            	  //RequestID
            	  Integer reqIDVal=reqData.getReqid();
            	  String reqID=null;
            	  if(reqIDVal!=null)
            	  {
            		  reqID=String.valueOf(reqIDVal);
            		  connectionAgreement.put("RequestID", reqID);
            	  }
            	  
            	  //RequestDate
            	  XMLGregorianCalendar reqDateVal=reqData.getReqDate();
            	  String reqDate=null;
            	  if(reqDateVal!=null)
            	  {
            		  //System.out.println(reqDateVal);
            		  Date date = reqDateVal.toGregorianCalendar().getTime();
            		  DateFormat  formatter = new SimpleDateFormat("MM/dd/yyyy");
            		  String formattedDate  = formatter.format(date);
            		  //System.out.println("Formated Date: "+formattedDate);
            		  reqDate=formattedDate;	
            		  connectionAgreement.put("RequestDate", reqDate);
            	  }
            	  
            	  //TotalArea
            	  Integer totalAreaVal=reqData.getTotalArea();
            	  String totalArea=null;
            	  if(totalAreaVal!=null)
            	  {
            		  totalArea=String.valueOf(totalAreaVal);
            		  connectionAgreement.put("TotalArea", totalArea);
            	  }
            	  
            	  //TotalAmpere
            	  Integer totalAmpereVal=reqData.getTotalAmpere();
            	  String totalAmpere=null;
            	  if(totalAmpereVal!=null)
            	  {
            		  totalAmpere=String.valueOf(totalAmpereVal);
            		  connectionAgreement.put("TotalAmpere", totalAmpere);
            	  }
            	  
            	  //TotalKVA
            	  BigDecimal totalKVAVal=reqData.getTotalKVA();
            	  String totalKVA=null;
            	  if(totalKVAVal!=null)
            	  {
            		  totalKVA=String.valueOf(totalKVAVal);
            		  connectionAgreement.put("TotalKVA", totalKVA);
            	  }
            	  
            	  //VoltID
            	  Short voltIDVal=reqData.getVoltId();
            	  String voltID=null;
            	  if(voltIDVal!=null)
            	  {
            		  voltID=String.valueOf(voltIDVal);
            		  connectionAgreement.put("VoltID", voltID);
            	  }
            			  
              }
              
              if(arrOfReqDetailNew!=null)
              {
            	  List<ReqDetailNew> reqDetailNewList=arrOfReqDetailNew.getReqDetailNew();
            	  ReqDetailNew reqDetailNew=null;
            	  if(reqDetailNewList!=null && reqDetailNewList.size()>0)
            	  {
            		  reqDetailNew=reqDetailNewList.get(0);
            	  }
            	  
            	  
            	  if(reqDetailNew!=null)
            	  {
            		//UnitTypeName
            		  JAXBElement<String> unitTypeNameVal=reqDetailNew.getUnitTypeName();
            		  String unitTypeName=null;
            		  if(unitTypeNameVal!=null)
            		  {
            			  unitTypeName=unitTypeNameVal.getValue();
            			  connectionAgreement.put("UnitTypeName", unitTypeName);
            		  }
            		  
            		//UnitCount
            		  Short unitCountVal=reqDetailNew.getUnitCount();
            		  String unitCount=null;
            		  if(unitCountVal!=null)
            		  {
            			  unitCount=String.valueOf(unitCount);
            			  connectionAgreement.put("UnitCount", unitCount);
            		  }
            		  
            		//UnitArea
            		 Integer unitAreaVal=reqDetailNew.getUnitarea();
            		 String unitArea=null;
            		 if(unitAreaVal!=null)
            		 {
            			 unitArea=String.valueOf(unitAreaVal);
            			 connectionAgreement.put("UnitArea", unitArea);
            		 }
            		 
            		 //CapKVA
            		 BigDecimal capKVAVal=reqDetailNew.getCapKVA();
            		 String capKVA=null;
            		 if(capKVAVal!=null)
            		 {
            			 capKVA=String.valueOf(capKVA);
            			 connectionAgreement.put("CapKVA", capKVA);
            		 }
            		 
            		 //UnitType
            		 Short unitTypeVal=reqDetailNew.getUnitType();
            		 String unitType=null;
            		 if(unitTypeVal!=null)
            		 {
            			 unitType=String.valueOf(unitTypeVal);
            			 connectionAgreement.put("UnitType", unitType);
            		 }
            		  
            	  }
          
              }
              
              if(arrOfReqType!=null)
              {
            	  List<RequestType> reqTypeList=arrOfReqType.getRequestType();
            	  RequestType requestType=null;
            	  if(reqTypeList!=null && reqTypeList.size()>0)
            	  {
            		  requestType=reqTypeList.get(0);	  
            	  }
            	  
            	  //RequestType
            	  if(requestType!=null)
            	  {
            		  Short reqTypeVal=requestType.getReqType();
            		  String reqType=null;
            		  if(reqTypeVal!=null)
            		  {
            			  reqType=String.valueOf(reqTypeVal);
            			  connectionAgreement.put("RequestType", reqType);
            		  }
            	  }
              }
             
           }
           return connectionAgreement;
     }

}
 