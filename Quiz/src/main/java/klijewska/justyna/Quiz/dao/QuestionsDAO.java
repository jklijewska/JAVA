package klijewska.justyna.Quiz.dao;

import klijewska.justyna.Quiz.model.Questions;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuestionsDAO {
    List<Questions> getAllQuestions();
}
