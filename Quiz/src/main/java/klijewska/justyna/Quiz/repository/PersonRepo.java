package klijewska.justyna.Quiz.repository;

import klijewska.justyna.Quiz.dao.PersonDAO;
import klijewska.justyna.Quiz.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepo implements PersonDAO {

    private static List<Person> persons=new ArrayList<>();

    @Override
    public void createPerson(Person person) {
        persons.add(person);
    }

    @Override
    public Person getPerson(Person person) {
        return persons.get(0);

    }
}
