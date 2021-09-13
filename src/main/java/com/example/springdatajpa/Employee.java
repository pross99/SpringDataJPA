package com.example.springdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String fristName;
    private String lastName;

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee(String fristName, String lastName) {
        this.fristName = fristName;
        this.lastName = lastName;
    }

    public Employee() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fristName='" + fristName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
