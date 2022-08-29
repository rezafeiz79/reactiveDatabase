package com.reza.reactiveDatabase.model;

import org.springframework.data.annotation.Id;

public class Person {
    @Id
    private int id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public Person setId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}
