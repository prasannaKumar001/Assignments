package uds.opentext.dm;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmailSendingServlet
 */
public class EmailSendingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailSendingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		String mailFrom=prop.getProperty("UDS.Mail");
		String mailPass=prop.getProperty("UDS.Pass");
		
		Properties props = new Properties();    
		props.put("mail.smtp.host", "smtp.gmail.com");    
		props.put("mail.smtp.socketFactory.port", "465");    
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   	
		props.put("mail.smtp.auth", "true");  
		props.put("mail.smtp.debug", "true");
		props.put("mail.smtp.port", "465");	
		props.put("mail.smtp.socketFactory.fallback", "false");
		
		//get Session   
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() 
		{    
			protected PasswordAuthentication getPasswordAuthentication() 
			{    
				return new PasswordAuthentication(mailFrom,mailPass);  
			}    
		}); 
		
		//compose message    
		MimeMessage message = new MimeMessage(session);    
		try {
			message.setFrom(new InternetAddress("hpExtream@opentext.com"));
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(request.getParameter("recipient")));
			message.setSubject(request.getParameter("subject"));
			message.setText(request.getParameter("content"));   
			
			Multipart multipart = new MimeMultipart("mixed");
			
			MimeBodyPart messageBodyParttext = new MimeBodyPart();
			messageBodyParttext.setText(request.getParameter("content"));
			multipart.addBodyPart(messageBodyParttext);
				
				File f=new File("C:\\temp\\mail\\");
				if(f.isDirectory())
				{
					File [] fileList=f.listFiles();
					for(File fi:fileList)
					{
						MimeBodyPart messageBodyPart = new MimeBodyPart();
						DataSource source = new FileDataSource(fi.getAbsolutePath());
						messageBodyPart.setDataHandler(new DataHandler(source));
						messageBodyPart.setFileName(source.getName());
						multipart.addBodyPart(messageBodyPart);
						
						message.setContent(multipart);
					}
				}
			    
		
		    		   //send message  
			Transport.send(message); 
			System.out.println("message sent successfully ");    
		} catch (MessagingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(request.getParameter("recipient"));
		System.out.println(request.getParameter("subject"));
		System.out.println(request.getParameter("content"));
	}

}
