
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Properties"%>
<%@page import="org.apache.log4j.Logger"%>
<%@page import="com.opentext.livelink.service.docman.Node"%>
<%@page import="uds.opentext.dm.OTUtility"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="x-ua-compatible" content="IE=edge">
		
	<script type="text/javascript" src="script/jquery-3.2.1.min.js"></script>
  	<script type="text/javascript" src="script/jquery-3.2.1.js"></script>
  	<script type="text/javascript" src="script/jquery-ui.js"></script>
	 <LINK REL="stylesheet" TYPE="text/css" HREF="style/screen.css?v=1344.1360">
	 <link rel="stylesheet" TYPE="text/css"  href="style/jquery-ui.css">
	 <link rel="stylesheet" type="text/css" href="style/datatables.min.css"/>
	 <script type="text/javascript" src="script/datatables.min.js"></script>
	 <script type="text/javascript" src="script/ot.js"></script>
	 
    <link type="text/css" rel="stylesheet" href="style/waitMe.css">
     <script src="script/waitMe.js"></script>
	<style type="text/css">
		#myFrame
		{
	   		background-image: url('style/images/loadingcir.gif');   
	   		background-repeat: no-repeat;
	   		background-attachment: fixed;
    		background-position: center;
		}
	</style>
<title>OpenText</title>
</head>
<body>
	<div id="header-inner">
		<h1 id="logo">
			<img alt="" src="headerbar_content_server.png">
		</h1>
	</div>
		<%
				Properties prop = new Properties();
				prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
				String USERNAME=prop.getProperty("UDS.USERNAME");
				String PASSWORD=prop.getProperty("UDS.PASSWORD");

				System.out.print("USERNAME: "+USERNAME);
				
				//	String parentID=request.getParameter("parentID");
			
				//need to write logic to get parent id from DB
				Map<String,String> retVal=new HashMap<String,String>();
					List<Node> nodes=new ArrayList<Node>();
					List<Node> nodes2=new ArrayList<Node>();
					String RequestNumber="";
					String RequestDate="";
					String SubscriberName="";
					String BranchName="";
					String  RequestStatus="";
					String RequestType="";
					String authToken=null;
				try
				{
					authToken=OTUtility.getAuthToken(USERNAME, PASSWORD);
				
					
					if(authToken!=null || authToken.trim().equals(""))
					{
						retVal=OTUtility.getNode(authToken, 46418);
						
						RequestNumber=retVal.get("Request Number");
						RequestDate=retVal.get("Create Date");
						SubscriberName=retVal.get("Subscriber Name");
						RequestType=retVal.get("Request Type");
						BranchName=retVal.get("Office");
						RequestStatus=retVal.get("Request Status");
						
						
						//nodes2=OTUtility.excludedNodes(authToken,85457);
					}
				}
				catch(Exception e)
				{
					out.print("<script>alert('Error occurred while loading this page')</script>");
					
				}	
			%>	
	<div style="min-height: 117px; ">
		<table  width="100%" border="0" class="level1table"  align="Right">
			<tbody >
				<tr>
					<td align="right" class="lavel1td browseRow2" style="background-color:#FFFFFF; "><%=RequestType%></td>
					<td align="right" class="lavel1td browseRow2" style="background-color:#FFFFFF; ">Request Type</td>
					<td align="right" class="lavel1td browseRow2" style="background-color:#FFFFFF; "><%= RequestNumber%></td>
					<td align="right" class="lavel1td browseRow2" style="background-color:#FFFFFF; ">Request ID</td>
					
				</tr>
				<tr>
					<td align="right" class="lavel1td browseRow2" style="background-color:#FFFFFF; "><%= BranchName%></td>
					<td align="right" class="lavel1td browseRow2" style="background-color:#FFFFFF; ">Office</td>
					<td align="right" class="lavel1td browseRow2" style="background-color:#FFFFFF; "><%= RequestDate %></td>
					<td align="right" class="lavel1td browseRow2" style="background-color:#FFFFFF; ">Creation Date</td>
					
				</tr>
				<tr>
					<td align="right" class="lavel1td browseRow2" style="background-color:#FFFFFF; "><%= RequestStatus %></td>
					<td align="right" class="lavel1td browseRow2" style="background-color:#FFFFFF; ">Req Status</td>
					<td align="right" class="lavel1td browseRow2" style="background-color:#FFFFFF; "><%=SubscriberName %></td>
					<td align="right" class="lavel1td browseRow2" style="background-color:#FFFFFF; ">Customer Name</td>	
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td align="right" class="lavel1td browseRow2" style="background-color:#FFFFFF; "></td>	
					<td align="right" class="lavel1td browseRow2" style="background-color:#FFFFFF; ">Customer ID</td>
				</tr>
			</tbody>
		</table>
	</div>
	
		<iframe id='myFrame' width="100%" height="450" scrolling="no" src="http://localhost:8080/UDSDocuManager/ListFiles.jsp">
	
	</iframe>
	
	<div id="dialog" class="model" style="display: none">
			<div id="dwtcontrolContainer"></div>
			<br/>
			Document Typ	   : <input type="text" value="docType" onclick="" />
			<br/>
			<br>
			Subscription Number: <input type="text" value="subNumber" onclick="" />
			<br/>
			<br>
			<input type="button" value="Upload" onclick="upload()" />
   			<input type="button" value="Exit" onclick="exit();" />
  				<!--  <input type="button" value="Save" onclick="SaveWithFileDialog();" />-->
  				<br />
   			<!-- <label><input type="radio" value="jpg" name="ImageType" id="imgTypejpeg" />JPEG</label>
  				<label><input type="radio" value="tif" name="ImageType" id="imgTypetiff" />TIFF</label>
  				<label><input type="radio" value="pdf" name="ImageType" id="imgTypepdf" checked="checked" />PDF</label> -->
		</div>	
	
	
	
	<p class="copyright">
				OpenText Content Server version 16. Copyright © 1995 - 2017 Open Text. All Rights Reserved.
			</p>
			
			
</body>
</html>