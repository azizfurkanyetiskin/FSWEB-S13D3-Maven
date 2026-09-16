package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String gender;
    private boolean isWorking;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String email, String gender, boolean isWorking) {
        this(firstName, lastName, age);
        this.email = email;
        this.gender = gender;
        this.isWorking = isWorking;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public boolean isTeen() { return age >= 13 && age <= 19; }
}