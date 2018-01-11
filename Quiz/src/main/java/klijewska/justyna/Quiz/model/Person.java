package klijewska.justyna.Quiz.model;

public class Person {
   private String name;
   private String surname;
   private String mail;
   private int points;

    public int getPoints() {
        return points;
    }

    public Person(String name, String surname, String mail, int points) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.points = points;
    }

    public void setPoints(int points) {
        this.points = points;
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

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", points=" + points +
                '}';
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    public Person() {
    }
}
