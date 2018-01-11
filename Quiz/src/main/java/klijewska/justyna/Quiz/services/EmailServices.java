package klijewska.justyna.Quiz.services;

import org.springframework.stereotype.Service;

@Service
public interface EmailServices {

 void sendSimplyMsg(String to, String subject, String text);
 void correctAnswersMsg(String to);
 void sendMsgWithAttachment(String to, String subject, String text, String pathToAttachment);
}
