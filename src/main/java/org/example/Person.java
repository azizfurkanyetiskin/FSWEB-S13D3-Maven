package org.example;

public class Person {

    private String firstname;
    private String lastName;
    private int age;

    private String city;
    private String email;
    private String phoneNumber;

    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstname, String lastName, int age, String city, String email, String phoneNumber) {
        this(firstname, lastName, age);
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}