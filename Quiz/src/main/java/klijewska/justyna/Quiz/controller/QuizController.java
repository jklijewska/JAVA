package klijewska.justyna.Quiz.controller;

import klijewska.justyna.Quiz.dao.PersonDAO;
import klijewska.justyna.Quiz.dao.QuestionsDAO;
import klijewska.justyna.Quiz.model.Person;
import klijewska.justyna.Quiz.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class QuizController {
    int counter=0;
    int points=0;
    @Autowired
    PersonDAO personDAO;

    @Autowired
    QuestionsDAO questionsDAO;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String hello(ModelMap model){
        model.addAttribute("person", new Person());
        return "initialView";

    }

    @PostMapping(value = "/")
    public String createPerson(ModelMap model, @ModelAttribute Person person){
        model.addAttribute("person", person);
        personDAO.createPerson(person);
        System.out.println(person.toString());
        return "redirect:/questions";
    }

    @RequestMapping(value="/question", method=RequestMethod.GET)
    public String showQuestion(ModelMap model) {
        model.addAttribute("question", new Questions());
        model.addAttribute("question1", questionsDAO.getAllQuestions().get(counter).getQuestion());
        model.addAttribute("answer1", questionsDAO.getAllQuestions().get(counter).getAnswer1());
        model.addAttribute("answer2", questionsDAO.getAllQuestions().get(counter).getAnswer2());
        model.addAttribute("answer3", questionsDAO.getAllQuestions().get(counter).getAnswer3());

        return "questionsView";
    }
        @PostMapping(value="/question")

        public String checkAnswer(ModelMap model, @ModelAttribute Questions question){

        String url="";
        model.addAttribute("question", question);

        if(questionsDAO.getAllQuestions().get(counter).getCorrectAnswer()==question.getCorrectAnswer()){
            points++;
        }

        if(counter<questionsDAO.getAllQuestions().size()){
            url="summary";
        }
        else{
            url="question";
        }
            System.out.println(points);
        counter++;
            return "redirect:"+url;

    }
}
