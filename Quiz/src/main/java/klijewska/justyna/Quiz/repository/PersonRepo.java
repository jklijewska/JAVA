package klijewska.justyna.Quiz.repository;

import klijewska.justyna.Quiz.dao.PersonDAO;
import klijewska.justyna.Quiz.model.Person;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Scope("session")
public class PersonRepo implements PersonDAO {

    private static List<Person> persons=new ArrayList<>();

    @Override
    public void createPerson(Person person) {
        persons.add(person);
    }

    @Override
    public Person getPerson() {
        return persons.get(0);

    }
    public int showPoints(Person person){
        return person.getPoints();
    }
    public Person getActPerson(){
        return persons.get(persons.size()-1);
    }
    public void showAllPersons(){
        for(int i = 0; i < persons.size(); i++) {
            System.out.print(persons.get(i));
        }
    }
    public void updatePoints(Person person){
        persons.remove(persons.size()-1);
        persons.add(person);
    }
}
