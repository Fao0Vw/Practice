package ru.ssau.tk.fao0vv.practice;

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public Person() {                                   //Конструктор без параметров
        firstName = "First name";
        lastName = "Lastname";
        passportId = "0000";

    }

    public Person(String firstName, String lastName) { //Конструктор с двумя параметрами
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String passportId) {                  //Конструктор с одним параметром
        this.passportId = passportId;
    }


    public Person(String firstName, String lastName, String passportId) {  //Конструктор с тремя параметрами
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }


    public static void main(String[] args) {
        Person human1 = new Person();
        human1.setFirstName("Alexandr");
        human1.setLastName("Motin");
        human1.setPassportId("3616232455");
        System.out.println(human1.getFirstName());
        System.out.println(human1.getLastName());
        System.out.println(human1.getPassportId());
        System.out.println("\n");


        Person human2 = new Person();
        human2.setFirstName("Denis");
        human2.setLastName("Sladkov");
        human2.setPassportId("3616233751");
        System.out.println(human2.getFirstName());
        System.out.println(human2.getLastName());
        System.out.println(human2.getPassportId());
        System.out.println("\n");

        Person human3 = new Person();


        Person human4 = new Person("Ekaterina", "Belova");

        Person human5 = new Person("Pavel", "Yashin", "361628222");

        Person human6 = new Person("3616287545");


    }

}



