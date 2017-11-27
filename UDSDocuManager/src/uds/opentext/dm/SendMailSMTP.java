package uds.opentext.dm;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;    
import javax.mail.internet.*;    

public class SendMailSMTP{  
	
	private void send(String from,String password,String to,String sub,String msg){  
        //for(int i=0;i<25;i++) {
			//Get properties object    
			Properties props = new Properties();    
			props.put("mail.smtp.host", "smtp.gmail.com");    
			props.put("mail.smtp.socketFactory.port", "465");    
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   	
			props.put("mail.smtp.auth", "true");  
			props.put("mail.smtp.debug", "true");
			props.put("mail.smtp.port", "465");	
			props.put("mail.smtp.socketFactory.fallback", "false");
			//props.put("support.email", "prasanna@supaiinfotech.com");
			
			
			//get Session   
			Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {    
																		protected PasswordAuthentication getPasswordAuthentication() {    
																			return new PasswordAuthentication(from,password);  
																		}    
																	});    
			
			
			//compose message    
			MimeMessage message = new MimeMessage(session);    
			try {
				message.setFrom(new InternetAddress("hpExtream@opentext.com"));
				message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
				message.setSubject(sub);
				message.setText(msg);   
				
				Multipart multipart = new MimeMultipart("mixed");
				
				for(int j=0;j<2;j++) {	
					MimeBodyPart messageBodyPart = new MimeBodyPart();
				    DataSource source = new FileDataSource("D:\\UDS\\MOM(UDS Integration).xlsx");
				    messageBodyPart.setDataHandler(new DataHandler(source));
				    messageBodyPart.setFileName(j+source.getName());
				    multipart.addBodyPart(messageBodyPart);
				}
				
				message.setContent(multipart);
			
			    		   //send message  
				Transport.send(message); 
				System.out.println("message sent successfully ");    
			} catch (MessagingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	
	public static void main(String[] args) {  
		SendMailSMTP sndMail = new SendMailSMTP();
		sndMail.send("prasanna@supaiinfotech.com","GnaneshRaji7!","prasgnanesh@gmail.com","Collection Process","Please find the attached collection process Design Document");  
	}    
}