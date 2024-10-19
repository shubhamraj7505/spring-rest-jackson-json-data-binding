// Java POJO class

package com.luv2code.springdemo.entity;

public class Student {

    private String firstName;
    private String lastName;

    // no-arg constructor
    public Student() {

    }

    // arg constructor
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // getter/setter mtd
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
