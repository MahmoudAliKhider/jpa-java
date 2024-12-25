package com.javatask.jpa.Models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// i use lombok when add project Data Containe=> Getter , Setter

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
@Entity
// @Table(name = "AUTHER_TBL")

public class Auther {

    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    @Column(
        unique = true,
        nullable = false
    )
    private String email;
    private int age;

    @ManyToMany(
        mappedBy = "authers"
    )
    private List<Course> courses;
}
