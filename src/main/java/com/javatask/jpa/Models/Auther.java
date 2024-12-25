package com.javatask.jpa.Models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

// i use lombok when add project Data Containe=> Getter , Setter

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@AllArgsConstructor
@SuperBuilder
@Entity

public class Auther extends BaseEntity{

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
