	 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="x-ua-compatible" content="IE=edge">
<link type="text/css" rel="stylesheet" href="style/waitMe.css">
<script type="text/javascript" src="script/jquery-3.2.1.js"></script>
 	 <script type="text/javascript" src="script/jquery-3.2.1.min.js"></script>
 	  <script type="text/javascript" src="script/jquery-ui.js"></script>
 	 <script src="script/waitMe.js"></script> 
	     
<script type="text/javascript">
	
			var current_effect = 'bounce'; // 
			
			function validateForm()
			{
				if (!document.getElementById("fileChooser").value) {
		            alert("Please choose a file!");
		            return false;    
		        }
				if((document.getElementById('docType').value).trim()=="")
				{
				 	alert("Please Enter Document Type..!");
		            return false;
				}
				if((document.getElementById('subNum').value).trim()=="")
				{
				 	alert("Please Enter Subscription Number..!");
		            return false;
				}
				
			}
			
			function spin()
			{
				run_waitMe(current_effect);
				}
					
				
				
	
			

		function run_waitMe(effect){
			$('#container').waitMe({
			effect: 'roundBounce',
			text: '',
			g: 'rgba(255,255,255,0.7)',
			color: '#000',
			maxSize: '',
			waitTime: -1,
			source: '',
			textPos: 'vertical',
			ontSize: '',
			onClose: function() {}});
		}
  


</script>	

<title>File Upload</title>
</head>
<body  id="container">
<div>
	<form  onsubmit="return validateForm()" action="UploadServlet" enctype="multipart/form-data" method="post">
	<label>Select file to upload:</label>
	<input type="file" name="dataFile" id="fileChooser"/><br/><br/>
	<label >Document Type:</label>
	<input type="text" name="docType" id="docType"/><br/><br/>
	<label>Subscription Number:</label>
	<input type="text" name="subNum" id="subNum"/><br/><br/>
	<input type="submit" value="Upload" id="upload" onclick="spin()"/>
	</form>	 
</div>
	 
</body>
</html>