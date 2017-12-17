package klijewska.justyna.Quiz.repository;

import klijewska.justyna.Quiz.dao.QuestionsDAO;
import klijewska.justyna.Quiz.db.ConnectDb;
import klijewska.justyna.Quiz.model.Questions;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public class QuestionsRepo implements QuestionsDAO {
    private ConnectDb connect = new ConnectDb();

    public List<Questions> getAllQuestions() {
        List<Questions> listOfQuestions = new ArrayList<>();
        String sql = "SELECT * FROM questions";
        ResultSet resultSet;
        resultSet = connect.dbSelect(sql);
        try {
            while (resultSet.next()) {
                Questions questions = new Questions();
                questions.setId(resultSet.getInt(1));
                questions.setQuestion(resultSet.getString(2));
                questions.setAnswer1(resultSet.getString(3));
                questions.setAnswer2(resultSet.getString(4));
                questions.setAnswer3(resultSet.getString(5));
                questions.setCorrectAnswer(resultSet.getInt(6));
                listOfQuestions.add(questions);
            }
        }
        //wypisanie tu zrób
        catch (SQLException e) {
            e.printStackTrace();
        }
       // System.out.println(listOfQuestions.size());
        for(Questions q: listOfQuestions){
            System.out.println(q.toString());
        }
        return listOfQuestions;
    }
}


