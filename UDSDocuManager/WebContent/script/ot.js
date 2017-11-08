function downlaodFile(id,feature)  //Download Document
		{
			alert(id);
			window.location.href ='http://localhost:8080/UDSDocuManager/DocumentList?dataID='+id+'&action='+feature;
			//window.open('http://localhost:8080/UDSDocuManager/DocumentList?dataID='+id+'feature='+feature);
		}
		
function dispalayFile(id,feature){   //View Document in Browser 
	//if(document.getElementById("Display").selected)
    {
    	//alert("Dispaly")
    	//alert(id);
		//window.location.href ='http://localhost:8080/UDSDocuManager/DocumentList?dataID='+id;
		window.open('http://localhost:8080/UDSDocuManager/DocumentList?dataID='+id+'&action='+feature);
    }
}
		
function copyFile(checkedValue,Copy)  //Copy Document from one folder to another 
{
	var	w = window.open('http://localhost:8080/UDSDocuManager/copy.html?dataID='+checkedValue+'&action='+Copy,'copyFile','directories=no,titlebar=no,toolbar=no,location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=500,height=300');

	if ( w.focus )
	{
		w.focus();
	}

}
		
function moveFile(checkedValue,move)  //Move File From One Folder to another
{
	var	w = window.open('http://localhost:8080/UDSDocuManager/move.html?dataID='+checkedValue+'&action='+move,'moveFile','directories=no,titlebar=no,toolbar=no,location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=500,height=300');

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
		
function deleteFile(checkedValue,Delete)  //Delete Document Request
{
	var	w=window.open ('http://localhost:8080/UDSDocuManager/DocumentList?dataID='+checkedValue+'&action='+Delete,+'deleteFile','directories=no,titlebar=no,toolbar=no,location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=500,height=300');
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
		

function Exclude(checkedValue,Exclude) //Exclude documents
{
	var w=window.open('http://localhost:8080/UDSDocuManager/DocumentList?dataID='+checkedValue+'&action='+Exclude,+'ExcludedNodes','directories=no,titlebar=no,toolbar=no,location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=500,height=300');	
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
			
//Jquery Datatables Customization		
/*$(document).ready(function() {
	$("#tabs").tabs( {
		"show": function(event, ui) {
			var oTable = $('div.dataTables_scrollBody>table.browseTable', ui.panel).dataTable();
			if ( oTable.length > 0 ) {
				oTable.fnAdjustColumnSizing();
			}
		}
	} );
} );
	*/
	/*$('table.browseTable').dataTable( {
		"columnDefs": [
    	    { 
    	    	"orderable": false, "targets": [0,1,2,3,5] ,
    	    	
    	    } ],
    	    "scrollY": "290px",
	    	"scrollCollapse": true
		
	} );
	

*/

/*$(document).ready(function() {
    $('#CScontent').DataTable( {
        
    	"columnDefs": [
    	    { "orderable": false, "targets": [0,1,2,3,5] ,
    	    	
    	    } ],
    	    "scrollY": "290px",
	    	  "scrollCollapse": true 	   
    } );
} );*/

/*$(document).ready(function() {
    $('#Excludecontent').DataTable( {
        
    	"columnDefs": [
    	    { "orderable": false, "targets": [0,1,2,3,5] ,
    	    	
    	    } ],
    	    "scrollY": "290px",
	    	  "scrollCollapse": true 	   
    } );
} );
*/



//All Dropdown Functionality
function downloadAllFiles()
{
	if((document.getElementById("Scan").selected))
	{
		AcquireImage();
		
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


		
//Check Box Functionality to select all		
function toggle(source) 
{
	checkboxes = document.getElementsByName('foo');
	for(var i=0, n=checkboxes.length;i<n;i++) 
	{
		checkboxes[i].checked = source.checked;
	}
}


$(document).ready(function() {
    $("#tabs").tabs( {
        "activate": function(event, ui) {
            var table = $.fn.dataTable.fnTables(true);
            if ( table.length > 0 ) {
                $(table).dataTable().fnAdjustColumnSizing();
            }
        }
    } );
     
    $('table.browseTable').dataTable( {
        "sScrollY": "290px",
        "bScrollCollapse": true,
        "bPaginate": true,
        "bJQueryUI": true,
        "aoColumnDefs": [
            { "orderable": false, "targets": [0,1,2,3,5]  }
        ]
    } );
} );
	
//Dyno soft scanning code



$( function dialog()  {
    $( "#dialog" ).dialog("open");
  } );
		