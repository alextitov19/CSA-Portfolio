package Gmail;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.*;

public class Gmail {

    String to, from, pw, subject, body;
    private Queue<String> purchasedQueue = new LinkedList<>();

    public Gmail() {
        to = "";
        from = "testytester1914@gmail.com";
        pw = "Test1914";
        subject = "Eyaad's Cool Store receipt";
        body = "Here is the list of all the functions you bought:";
    }


    public void Enqueue(String s) {
        purchasedQueue.add(s);
    }

    public String Dequeue() {
        return purchasedQueue.remove();
    }

    public void SendEmail() {
        // TODO Auto-generated method stub
        System.out.println("The Gmail program is starting up...");

        String recipient = to;
        String sender = from;
        String host = "smtp.gmail.com";
        
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sender, pw);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(sender));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));

            message.setSubject(subject);

            for (int i = 0; i < purchasedQueue.size(); i++) {
                body = body + "\n " + Dequeue();
            }

            message.setText(body);

            Transport.send(message);
            System.out.println("Message sent successfully!");
        } catch (MessagingException mex){
            System.out.println("Message failed to send!");
            mex.printStackTrace();
        }
    }

}
