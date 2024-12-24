package com.javatask.jpa.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

// i use lombok when add project
@Entity
@Getter
@Setter
public class Auther {

    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    
    public Auther() {
    }


    public Auther(String firestName, String lastName, String email, int age) {
        this.firstName = firestName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

 

}
