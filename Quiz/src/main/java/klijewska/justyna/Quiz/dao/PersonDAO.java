package klijewska.justyna.Quiz.dao;
import klijewska.justyna.Quiz.model.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDAO {
    void createPerson(Person person);
    Person getPerson();
    int showPoints(Person person);
    Person getActPerson();
    void showAllPersons();
    void updatePoints(Person person);
}
