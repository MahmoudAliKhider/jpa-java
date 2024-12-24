package com.javatask.jpa.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

// i use lombok when add project Data Containe=> Getter , Setter
@NoArgsConstructor
@Data
@Entity
public class Auther {

    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

}
