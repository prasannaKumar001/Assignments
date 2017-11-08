
<%@page import="java.util.Map"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Properties"%>
<%@page import="org.apache.log4j.Logger"%>
<%@page import="com.opentext.livelink.service.docman.Node"%>
<%@page import="uds.opentext.dm.OTUtility"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% int x=1;  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script type="text/javascript">
	var DWObject;
	var console = window['console']?window['console']:{'log':function(){}};
	Dynamsoft.WebTwainEnv.RegisterEvent('OnWebTwainReady', Dynamsoft_OnReady); // Register OnWebTwainReady event. This event fires as soon as Dynamic Web TWAIN is initialized and ready to be used
		
	function Dynamsoft_OnReady() {
	    DWObject = Dynamsoft.WebTwainEnv.GetWebTwain('dwtcontrolContainer'); // Get the Dynamic Web TWAIN object that is embeded in the div with id 'dwtcontrolContainer'
	    if (DWObject) {
	        DWObject.RegisterEvent('OnPostAllTransfers'); //SaveWithFileDialog
	    }
	}
	
	function AcquireImage() {
		
	    if (DWObject) {
	        var bSelected = DWObject.SelectSource();
			
			if(bSelected){
				var OnAcquireImageSuccess, OnAcquireImageFailure;
				OnAcquireImageSuccess = OnAcquireImageFailure= function (){
					DWObject.CloseSource();
				};
				
				DWObject.OpenSource();
				DWObject.IfDisableSourceAfterAcquire = true;	// Scanner source will be disabled/closed automatically after the scan. 
				DWObject.AcquireImage(OnAcquireImageSuccess, OnAcquireImageFailure);
			}
	    }
	}

	//Callback functions for async APIs
	function OnSuccess() {
	    console.log('successful');
	}

	function OnFailure(errorCode, errorString) {
	    alert(errorString);
	}

	function LoadImage() {
	    if (DWObject) {
	        DWObject.IfShowFileDialog = true; // Open the system's file dialog to load image
	        DWObject.LoadImageEx("", EnumDWT_ImageType.IT_ALL, OnSuccess, OnFailure); // Load images in all supported formats (.bmp, .jpg, .tif, .png, .pdf). OnSuccess or OnFailure will be called after the operation
	    }
	}

	function SaveWithFileDialog() {
	    if (DWObject) {
	        if (DWObject.HowManyImagesInBuffer > 0) {
	            DWObject.IfShowFileDialog = true;
	            if (document.getElementById("imgTypejpeg").checked == true) {
	                //If the current image is B&W
	                //1 is B&W, 8 is Gray, 24 is RGB
	                if (DWObject.GetImageBitDepth(DWObject.CurrentImageIndexInBuffer) == 1)
	                    //If so, convert the image to Gray
	                    DWObject.ConvertToGrayScale(DWObject.CurrentImageIndexInBuffer);
	                //Save image in JPEG
	                DWObject.SaveAsJPEG("DynamicWebTWAIN.jpg", DWObject.CurrentImageIndexInBuffer);
	            }
	            else if (document.getElementById("imgTypetiff").checked == true)
	                DWObject.SaveAllAsMultiPageTIFF("DynamicWebTWAIN.tiff", OnSuccess, OnFailure);
	            else if (document.getElementById("imgTypepdf").checked == true)
	                DWObject.SaveAllAsPDF("DynamicWebTWAIN.pdf", OnSuccess, OnFailure);
	        }
	    }
	}
	
	function upload()
	{
		//DWObject.IfShowFileDialog = false;
		//DWObject.SaveAsPDF("C:\DynamicWebTWAIN.pdf", 0);
		var strHTTPServer = location.hostname;
		DWObject.HTTPPort = location.port == "" ? 80 : location.port;
		var CurrentPathName = unescape(location.pathname);
		var CurrentPath = CurrentPathName.substring(0, CurrentPathName.lastIndexOf("/") + 1);
		var strActionPage = CurrentPath + "ScanUpload";
		var uploadfilename = "TestI.pdf";
		DWObject.HTTPUploadAllThroughPostAsPDF(
				strHTTPServer,
				strActionPage,
				uploadfilename,
				OnSuccess, OnFailure
				);
	}
	
	
	function downloadAllFiles()
	{
		alert("in downloadfiles()")
		if((document.getElementById("Scan").selected))
		{
			AcquireImage();
			alert("in scan")
			var opt = {
			        autoOpen: false,
			        modal: true,
			        width: 550,
			        height:650,
			        title: 'Details'
			};

			$("#dialog").dialog(opt).dialog("open");
			//dialog();
		}
		
		if((document.getElementById("Display").selected))
		{
			var chk=0;
			var checkedValue = null; 
			inputElements = document.getElementsByName('foo');
			for(var i=0; inputElements[i]; ++i)
			{
				if(inputElements[i].checked)
			    {
					chk=chk+1;
			    }
			  }
			if(chk>1)
			{
				alert("Multiple Documents can not be displayed");
			}
			if(chk==0)
			{
				alert("Please select atleast one")
			}
			if(chk==1)
			{
				for(var i=0; inputElements[i]; ++i)
				{
					if(inputElements[i].checked)
				    {
			           checkedValue = inputElements[i].value;
			           dispalayFile(checkedValue,'Display')
			           //alert(checkedValue)
				    }
				}
				inputElements=null;
			}
		}
	/*	if((document.getElementById("Export").selected))
		{
			var checkedValue = null; 
			var inputElements = document.getElementsByName('foo');
			for(var i=0; inputElements[i]; ++i)
			{
			      if(inputElements[i].checked)
			      {
			           checkedValue = inputElements[i].value;
			           dispalayFile(checkedValue,'dispaly')
			           //alert(checkedValue)
			           
			      }
			}
			
		}*/
		if((document.getElementById("Copy").selected))
		{
			var chk=0;
			var checkedValue = null; 
			inputElements = document.getElementsByName('foo');
			for(var i=0; inputElements[i]; ++i)
			{
				if(inputElements[i].checked)
			    {
					chk=chk+1;
			    }
			  }
			if(chk>1)
			{
				alert("Multiple Documents can not be Copied");
			}
			if(chk==0)
			{
				alert("Please select atleast one")
			}
			if(chk==1)
			{
				for(var i=0; inputElements[i]; ++i)
				{
					if(inputElements[i].checked)
				    {
			           checkedValue = inputElements[i].value;
			           copyFile(checkedValue,'Copy')
			           //alert(checkedValue)
				    }
				}
			inputElements=null;
			}
		}
		
		if((document.getElementById("Move").selected))
		{
			var chk=0;
			var checkedValue = null; 
			inputElements = document.getElementsByName('foo');
			for(var i=0; inputElements[i]; ++i)
			{
				if(inputElements[i].checked)
			    {
					chk=chk+1;
			    }
			  }
			if(chk>1)
			{
				alert("Multiple Documents can not be Moved");
			}
			if(chk==0)
			{
				alert("Please select atleast one")
			}
			if(chk==1)
			{
				for(var i=0; inputElements[i]; ++i)
				{
					if(inputElements[i].checked)
				    {
			           checkedValue = inputElements[i].value;
			           moveFile(checkedValue,'Move')
			           //alert(checkedValue)
				    }
				}
			inputElements=null;
			}
		}
		/*if((document.getElementById("Delete").selected))
		{
			var chk=0;
			var checkedValue = null; 
			inputElements = document.getElementsByName('foo');
			for(var i=0; inputElements[i]; ++i)
			{
				if(inputElements[i].checked)
			    {
					chk=chk+1;
			    }
			  }
			if(chk>1)
			{
				alert("Multiple Documents can not be deleted");
			}
			if(chk==0)
			{
				alert("Please select atleast one")
			}
			if(chk==1)
			{
				for(var i=0; inputElements[i]; ++i)
				{
					if(inputElements[i].checked)
				    {
			           checkedValue = inputElements[i].value;
			           deleteFile(checkedValue,'Delete')
			           //alert(checkedValue)
				    }
				}
			inputElements=null;
			}
		}
		*/
		if((document.getElementById("Upload").selected))
		{
			var	w = window.open('http://localhost:8080/UDSDocuManager/upload.jsp','upload','directories=no,titlebar=no,toolbar=no,location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=500,height=300');

			if ( w.focus )
			{
				w.focus();
			}
			var timer = setInterval(function() {   
			    if(w.closed) {  
			    	window.location.reload(true);
			        clearInterval(timer);  
			        //alert('closed');  
			    }  
			}, 1000);
		}
		
		if((document.getElementById("Exclude").selected))
		{
			var chk=0;
			var checkedValue = []; 
			inputElements = document.getElementsByName('foo');
			for(var i=0; inputElements[i]; ++i)
			{
				if(inputElements[i].checked)
			    {
					chk=chk+1;
			    }
			}
			
			if(chk==0)
			{
				alert("Please select atleast one")
			}
			if(chk>=1)
			{
				for(var i=0; inputElements[i]; ++i)
				{
					if(inputElements[i].checked)
				    {
			           checkedValue[i] = inputElements[i].value;
			          
			           //alert(checkedValue)
				    }
				}
				
			Exclude(checkedValue,'Exclude')
			inputElements=null;
			}
		}

	}	
	function exit()
	{
		$("#dialog").dialog("close");
	}
	</script>
	<style type="text/css">
		
 			.browseRow1 { background-color: #FFFFFF;  } 
 			.browseRow2 { background-color: #FFFFFF;  }
	</style>
	<script src="script/jquery-3.2.1.min.js"></script>
  	<script src="script/jquery-3.2.1.js"></script>
  	<script src="script/jquery-ui.js"></script>
	 <LINK REL="stylesheet" TYPE="text/css" HREF="style/screen.css?v=1344.1360">
	 <link rel="stylesheet" TYPE="text/css"  href="style/jquery-ui.css">
	 <link rel="stylesheet" type="text/css" href="style/datatables.min.css"/>
	 <script type="text/javascript" src="script/datatables.min.js"></script>
	 <script type="text/javascript" src="script/ot.js"></script>
	 <script type="text/javascript" src="Resources/dynamsoft.webtwain.initiate.js"></script>
    <script type="text/javascript" src="Resources/dynamsoft.webtwain.config.js"></script>
	<style type="text/css">
		.model{
			display: none; /* Hidden by default */
    position: fixed; /* Stay in place */
    z-index: 1; /* Sit on top */
    padding-top: 100px; /* Location of the box */
    left: 0;
    top: 0;
    width: 100%; /* Full width */
    height: 100%; /* Full height */
    overflow: auto; /* Enable scroll if needed */
    background-color: rgb(0,0,0); /* Fallback color */
    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
		}
	
	
		.tabs {
			float:right!important;
			}
		.updatedBrowse .browseListHeader TD {
   			height: 40px;
			}
			
		table.dataTable thead > tr > th {
    		 padding-left: 30px !important;
   			 padding-right: initial !important;
		}

	    table.dataTable thead .sorting,
	   	table.dataTable thead .sorting_asc, 
	    table.dataTable thead .sorting_desc, 
	    table.dataTable thead .sorting_asc_disabled, 
	    table.dataTable thead .sorting_desc_disabled{
	    	 background-position: center;    
	     }
	     
		table.dataTable tbody th, table.dataTable tbody td{
	     	padding-right: 0px;
	     }
		table.dataTable thead .sorting_asc{
			background-image: none;
		}
			
		.options {
				background: transparent;
				padding: 5px 35px 5px 5px;
				font-size: 12px;
				-webkit-appearance: none;
				-moz-appearance: none;
				appearance: none;
			}
				
		.dataTables_filter{
			margin-right: 1.6em;	
			display:inline-table;
					
			}
				
		 .dataTables_length{
			display:inline-block;
			}		
	</style>
<title>OpenText Document List</title>
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
				
				String parentID=request.getParameter("parentID");
			
				//need to write logic to get parent id from DB
				String authToken=OTUtility.getAuthToken(USERNAME, PASSWORD);
				Map<String,String> retVal=OTUtility.getNode(authToken, 85457);
				String RequestNumber=retVal.get("RequestNumber");
				String RequestDate=retVal.get("RequestDate");
				String SubscriberName=retVal.get("SubscriberName");
				String RequestType=retVal.get("RequestType");
				String BranchName=retVal.get("BranchName");
				String  RequestStatus=retVal.get("RequestStatus");
				List<Node> nodes=OTUtility.getChildren(authToken,85457);//parent ID
				List<Node> nodes2=OTUtility.excludedNodes(authToken,85457);
				System.out.println("Path    "+System.getProperty("java.io.tmpdir"));
				
			%>	
			
			

	<div style="min-height: 117px; ">
		<table  width="100%" border="0" class="level1table"  align="Right">
			<tbody >
				<tr>
					<td align="right" class="lavel1td browseRow2"><%= RequestType%></td>
					<td align="right" class="lavel1td browseRow2">Request Type</td>
					<td align="right" class="lavel1td browseRow2"><%= RequestNumber%></td>
					<td align="right" class="lavel1td browseRow2">Request ID</td>
					
				</tr>
				<tr>
					<td align="right" class="lavel1td browseRow2"><%= BranchName%></td>
					<td align="right" class="lavel1td browseRow2">Office</td>
					<td align="right" class="lavel1td browseRow2"><%= RequestDate %></td>
					<td align="right" class="lavel1td browseRow2">Creation Date</td>
					
				</tr>
				<tr>
					<td align="right" class="lavel1td browseRow2"><%= RequestStatus %></td>
					<td align="right" class="lavel1td browseRow2">Req Status</td>
					<td align="right" class="lavel1td browseRow2"><%=SubscriberName %></td>
					<td align="right" class="lavel1td browseRow2">Customer Name</td>	
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td align="right" class="lavel1td browseRow2"></td>	
					<td align="right" class="lavel1td browseRow2">Customer ID</td>
				</tr>
			</tbody>
		</table>
	</div>
		<div style="margin-top:-10 px;">
	
			
			<c:set var="n" value="<%=nodes%>"/>
			<c:set var="k" value="<%=nodes2%>"/>
			<div id="tabs"  >
  				
				<ul>
					<li class="tabs"><a href="#tabs-1">Documents</a></li>
					<li class="tabs"><a href="#tabs-2">Excluded</a></li>
					<li class="tabs"><a href="#tabs-3">Comments</a></li>
					<div class="options">
  						<select class="" onchange="downloadAllFiles();" onfocus="this.selectedIndex = -1;">
  							<option id="#">--Select--</option>
						  	<option id="Scan">Scan</option>
						  	<option id="Display">Display</option>
						  	<option id="Upload">Upload</option>
						  	<option id="Copy">Copy</option>
						  	<option id="Move">Move</option>
						  	<option id="Exclude">Exclude</option>
						  	<option value="Retrieve">Retrieve</option>
						 	<!--<option id="Delete">Delete</option>-->
						  	<option value="Send">Send</option>
						</select>
  					</div>
				</ul>
				<div id="tabs-1">
				 <form name=form1 method=post>
	   				<table id="CScontent" width="100%" border="0" cellspacing="1" cellpadding="0" class="browseTable updatedBrowse">
						<thead>
							<tr class="browseListHeader">
							 	<td class="browseListHeaderCheck"></td>
							 	<td class="browseListHeaderName">Data ID</td>
							 	<td class="browseListHeaderName">Comments</td>
							 	<td class="browseListHeaderName">Created Date</td>
						       	<td class="browseListHeaderName" >Documents</td>
						       	<td class="browseListHeaderCheck" style="background-image: none";>
							 		<input type="checkbox" name="top_checkbox" value="checkbox" onClick="toggle(this);">
							 	</td>
						    </tr>
						</thead>
						<c:forEach items="${n}" var="element">
							<tr class="browseRow2">
								<td align="right" class="browseRow2">
					    			<a href="#" id="${element.getID()}" onclick="downlaodFile(this.id,'download');" title="Download">Download</a>
					    			<div id="z85229" class="functionMenuDiv"></div>
						    	</td>
								<td align="right"  class="browseRow2"><c:out value="${element.getID()}"/></td>
							 	<td align="right"  class="browseRow2"><c:out value="${element.getComment()}"/></td>
							 	<td align="right"  class="browseRow2"><c:out value="${element.getCreateDate()}"/></td>
								<td align="right"  class="browseRow2">
					    			<a class="browseItemNameContainer"><c:out value="${element.getName()}"/></a>
					    			<div id="z85229" class="functionMenuDiv"></div>
						    	</td>
						    		
						    	<td  class="browseListHeaderCheck ">
									<input   type="checkbox" name="foo" id="ckb" value="${element.getID()}">
								</td>		
						    </tr>
						</c:forEach>
	 				</table>
	 			</form>
	  		</div>
  			<div id="tabs-2">
    			<form name=form1 method=post>
	   				<table id="Exclude" width="100%" border="0" cellspacing="1" cellpadding="0" class="browseTable updatedBrowse">
						<thead>
							<tr class="browseListHeader">
							 	<td class="browseListHeaderCheck"></td>
							 	<td class="browseListHeaderName">Data ID</td>
							 	<td class="browseListHeaderName">Comments</td>
							 	<td class="browseListHeaderName">Created Date</td>
						       	<td class="browseListHeaderName" >Documents</td>
						       	<td class="browseListHeaderCheck" style="background-image: none";>
							 		<input type="checkbox" name="top_checkbox" value="checkbox" onClick="toggle(this);">
							 	</td>
						    </tr>
						</thead>
						<c:forEach items="${k}" var="element">
							<tr class="browseRow2" style="color: red">
								<td align="right" class="browseRow2">
					    			<a href="#" id="${element.getID()}" onclick="downlaodFile(this.id,'download');" title="Download">Download</a>
					    			<div id="z85229" class="functionMenuDiv"></div>
						    	</td>
								<td align="right"  class="browseRow2"><c:out value="${element.getID()}"/></td>
							 	<td align="right"  class="browseRow2"><c:out value="${element.getComment()}"/></td>
							 	<td align="right"  class="browseRow2"><c:out value="${element.getCreateDate()}"/></td>
								<td align="right"  class="browseRow2">
					    			<a class="browseItemNameContainer"><c:out value="${element.getName()}"/></a>
					    			<div id="z85229" class="functionMenuDiv"></div>
						    	</td>
						    		
						    	<td  class="browseListHeaderCheck ">
									<input   type="checkbox" name="foo" id="ckb" value="${element.getID()}">
								</td>		
						    </tr>
						</c:forEach>
	 				</table>
	 			</form>
  			</div>
  			<div id="tabs-3">
    			<p></p>
    		</div>
		</div>	
		</div>
 			<p class="copyright">
				OpenText Content Server version 16. Copyright © 1995 - 2017 Open Text. All Rights Reserved.
			</p>
			<div id="dialog" class="model">
				<div id="dwtcontrolContainer"></div>
				<input type="button" value="Upload" onclick="upload()" />
    			<input type="button" value="Exit" onclick="exit();" />
   				<!--  <input type="button" value="Save" onclick="SaveWithFileDialog();" />-->
   				<br />
    			<!-- <label><input type="radio" value="jpg" name="ImageType" id="imgTypejpeg" />JPEG</label>
   				<label><input type="radio" value="tif" name="ImageType" id="imgTypetiff" />TIFF</label>
   				<label><input type="radio" value="pdf" name="ImageType" id="imgTypepdf" checked="checked" />PDF</label> -->
			</div>	
			
</body>
</html>
