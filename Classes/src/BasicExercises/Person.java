package BasicExercises;

import com.sun.org.apache.xpath.internal.SourceTree;

/*Stwórz klasę Osoba posiadającą następujące dane takie jak:
- name,
- surname,
- age,
- gender.
Stwórz odpowiedni konstruktor, który przyjmuje wszystkie argumenty. Dodaj metody
dostępowe do zmiennych obiektu. Stwórz przykładowe obiekty. */
public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender; //true-women, false-man

    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String name) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void personData() {
        System.out.println(this.getName() + " " + this.getSurname() + " " + getAge() + " " + getGender());
    }

    public static void main(String[] args) {
        Person one = new Person("Justyna", "Klijewska", 24, true);
        Person two = new Person("Anna", "Nowak", 19, true);
        Person three = new Person("Damian", "Kowalski", 10, false);
        one.personData();
    }
}
