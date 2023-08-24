
package formularioregistro; 


import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class RecuperarPass {
   
    private static String email = "tyncho.wary@gmail.com";
    private static String passwor = "fjawbjefuvcxycwp";
    private String asunto= "Recuperar Contraseña";
    private String contenido;

    private Properties mProperties = new Properties();
    private Session mSession;
    private MimeMessage mCorreo;
    
    public void enviarEmail (String desti, String conten){
        
        //protocolos de Gmail 
        
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user",email);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");
        
        mSession = Session.getDefaultInstance(mProperties);
        
        
        // cargo el Email con la información necesaria
          try {
            mCorreo = new MimeMessage(mSession);
            mCorreo.setFrom(new InternetAddress(email));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(desti));
            mCorreo.setSubject(asunto);
            mCorreo.setText("Su nuevo Password es: "+conten, "ISO-8859-1", "html");
                     
            
        } catch (AddressException ex) {
            Logger.getLogger(RecuperarPass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.mail.MessagingException ex) {
            Logger.getLogger(RecuperarPass.class.getName()).log(Level.SEVERE, null, ex);
        }
            
          
          //envio el Email
           try {
            javax.mail.Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(email, passwor);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
            
           
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(RecuperarPass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.mail.MessagingException ex) {
            Logger.getLogger(RecuperarPass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
