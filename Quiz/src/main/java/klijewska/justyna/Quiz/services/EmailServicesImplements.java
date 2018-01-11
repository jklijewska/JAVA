package klijewska.justyna.Quiz.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailServicesImplements implements EmailServices{
    @Autowired
    JavaMailSender sender;
    @Override
    public void sendSimplyMsg(String to, String subject, String text){
        SimpleMailMessage simpleMsg = new SimpleMailMessage();
        simpleMsg.setTo(to);
        simpleMsg.setSubject(subject);
        simpleMsg.setText(text);
        sender.send(simpleMsg);
    }

    @Override
   public void sendMsgWithAttachment(String to, String subject, String text, String pathToAttachment){
        MimeMessage withAttachment = sender.createMimeMessage();
        try{

            MimeMessageHelper helper = new MimeMessageHelper(withAttachment,true);

            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(text);

            FileSystemResource file = new FileSystemResource(pathToAttachment);
            helper.addAttachment("Attachment", file);
            sender.send(withAttachment);
            System.out.println("Success");
        }
        catch (MessagingException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void correctAnswersMsg(String to){
        SimpleMailMessage simpleMsg = new SimpleMailMessage();
        simpleMsg.setTo(to);
        simpleMsg.setSubject("Poprawnie odpowiedzi do pytania 8: ");
       // simpleMsg.setText(text);
        sender.send(simpleMsg);
    }
}
