package klijewska.justyna.Quiz;

import klijewska.justyna.Quiz.repository.QuestionsRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
        QuestionsRepo qRepo = new QuestionsRepo();
        qRepo.getAllQuestions();
	}
}
