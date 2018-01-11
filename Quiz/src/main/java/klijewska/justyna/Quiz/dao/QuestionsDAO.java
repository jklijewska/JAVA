package klijewska.justyna.Quiz.dao;

import klijewska.justyna.Quiz.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuestionsDAO extends JpaRepository<Questions, Long >{
   // List<Questions> getAllQuestions();
}
