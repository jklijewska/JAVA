package klijewska.justyna.Quiz.controller;

import klijewska.justyna.Quiz.dao.PersonDAO;
import klijewska.justyna.Quiz.dao.QuestionsDAO;
import klijewska.justyna.Quiz.model.Person;
import klijewska.justyna.Quiz.model.Questions;
import klijewska.justyna.Quiz.services.EmailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Scope("session")
public class QuizController {
    int counter=0;
    int points=0;
    @Autowired
    PersonDAO personDAO;

    @Autowired
    QuestionsDAO questionsDAO;

    @Autowired
    EmailServices eServices;

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
        return "redirect:/question";
    }

    @RequestMapping(value="/question", method=RequestMethod.GET)
    public String showQuestion(ModelMap model) {
        model.addAttribute("question", new Questions());
        model.addAttribute("question1", questionsDAO.findAll().get(counter).getQuestion());
        model.addAttribute("answer1", questionsDAO.findAll().get(counter).getAnswer1());
        model.addAttribute("answer2", questionsDAO.findAll().get(counter).getAnswer2());
        model.addAttribute("answer3", questionsDAO.findAll().get(counter).getAnswer3());

        return "questionsView";
    }
        @PostMapping(value="/question")
        public String checkAnswer(ModelMap model, @ModelAttribute Questions question){
        String url="";
        Person personTmp;
        model.addAttribute("question", question);
        if(questionsDAO.findAll().get(counter).getCorrectAnswer()==question.getCorrectAnswer()){
            points++;
        }
        if(counter>=questionsDAO.findAll().size()-1){
            url="summary";
        }

        else{
            url="question";
        }
           // System.out.println(questionsDAO.getAllQuestions().size());
        //    System.out.println("size: "+questionsDAO.getAllQuestions().size());
       //     System.out.println("points"+points);
       //     System.out.println("counter"+counter);
       //   personDAO.showAllPersons();
       // personTmp=personDAO.getActPerson();
       // personTmp.setPoints(points);
       // personDAO.updatePoints(personTmp);
     // personDAO.showAllPersons();
        counter++;
            return "redirect:"+url;

    }
    @RequestMapping(value = "/summary",method = RequestMethod.GET)
    public String summary(ModelMap model){
         model.addAttribute("summary", points);
         model.addAttribute("allpoints", counter);
     //    eServices.sendSimplyMsg(personDAO.getPerson().getMail(),"Wynik testu", "Zdobyłeś: "+points+" punktów");
         eServices.sendMsgWithAttachment(personDAO.getPerson().getMail(), "Wynik testu 1", "Zdobyłeś: "+points+" pkt",
                 "C:\\\\Users\\\\Klijek\\\\Desktop\\\\test.txt");
        return "summaryView";

    }

}
