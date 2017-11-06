package uds.opentext.dm;

import java.io.ByteArrayOutputStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.sun.xml.internal.ws.developer.StreamingDataHandler;

/**
 * Servlet implementation class DocumentList
 */
public class DocumentList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final Logger LOGGER = Logger.getLogger(DocumentList.class); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DocumentList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest reqest, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		String USERNAME=prop.getProperty("UDS.USERNAME");
		String PASSWORD=prop.getProperty("UDS.PASSWORD");
		
		String authToken=OTUtility.getAuthToken(USERNAME, PASSWORD);
		
		String param=request.getParameter("dataID");
		String action=request.getParameter("action");
		if(action.equals("download") || action.equals("Display"))
		{
			int dataID=Integer.valueOf(param);
			
			String contextID=OTUtility.getContext(dataID, authToken);
			StreamingDataHandler downloadStream=OTUtility.downloadDoc(authToken,contextID);
			
			byte[] bytes = null;
		    ByteArrayOutputStream bos = new ByteArrayOutputStream();
		    downloadStream.writeTo(bos);
		    bos.flush();
		    bos.close();
		    bytes = bos.toByteArray();
		    response.setContentType("application/pdf");  
		  
		    if(action.equals("Display"))
		    {
		    	response.setHeader("Content-Disposition","inline; filename=\"" + dataID+".pdf" + "\"");   
		    }
		    else
		    {
		    	response.setHeader("Content-Disposition","attachment; filename=\"" + dataID+".pdf" + "\""); 
		    }
		  
		    OutputStream outputstream=response.getOutputStream();
		    outputstream.write(bytes);
		    outputstream.close();
		   
		}
		
		if(action.equals("Copy"))
		{
			//System.out.println("in post");
			String par=request.getParameter("parentID");
			String name=request.getParameter("name");
			String parent=request.getParameter("dataID");
			if((par!=null&&name!=null&&parent!=null))
			{
				System.out.println(par);
				System.out.println(name);
				int parentID=Integer.valueOf(par);
				int dataID=Integer.valueOf(parent);			 
				OTUtility.copyDocument(authToken,parentID, dataID, name);
				PrintWriter os=response.getWriter();
				os.write("<script type=text/javascript"+"> alert('completed')</script>");
			}
		}
			
		if(action.equals("Move"))
		{
			//System.out.println("in post");
			String par=request.getParameter("parentID");
			//String name=request.getParameter("name");
			String data=request.getParameter("dataID");
			if((par!=null&&data!=null))
			{
				//System.out.println(par);
				
				int parentID=Integer.valueOf(par);
				int dataID=Integer.valueOf(data);			 
				String res=OTUtility.moveDocument(authToken,dataID,parentID);
				if(res!=null&&res.equals("Moved")){
					PrintWriter os=response.getWriter();
					os.write("<script type=text/javascript"+"> alert('completed')</script>");
				}
			}
		}
		
		if(action.equals("Delete"))
		{
			//System.out.println("in post");
			//String par=request.getParameter("parentID");
			//String name=request.getParameter("name");
			String data=request.getParameter("dataID");
			if((data!=null))
			{
				//System.out.println(par);
				
				//int parentID=Integer.valueOf(par);
				int dataID=Integer.valueOf(data);			 
				String res=OTUtility.deleteDocument(authToken,dataID);
				if(res!=null&&res.equals("deleted")){
					PrintWriter os=response.getWriter();
					os.write("<script type=text/javascript"+">window.close()</script>");
				}
			}
		}
		
		if(action.equals("Exclude"))
		{
			String categoryID=prop.getProperty("UDS.CategoryTemplateID");
			
			System.out.println("Category ID: "+categoryID);
			int categoryTemplateID = 0;
			if(categoryID!=null && !categoryID.equals(""))
			{
				categoryTemplateID=Integer.valueOf(categoryID);
			}
			else
			{
				LOGGER.error("Category Template ID is missing or not valid");
			}
			//System.out.println("in post");
			//String par=request.getParameter("parentID");
			String dataArray=request.getParameter("dataID");
			String [] dataIDs=dataArray.split(",");
			//String data=request.getParameter("dataID");
			if((dataIDs.length!=0))
			{
				for(String s: dataIDs)
				{
					if(s!=null&&!s.equals(""))
					{
						int dataid=Integer.valueOf(s);
						OTUtility.updateCategory(authToken,dataid,categoryTemplateID);
						PrintWriter os=response.getWriter();
						os.write("<script type=text/javascript"+">window.close()</script>");
					}
				}
			}
		}
		
		
		
		 
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 
	}

}
