package com.javatask.jpa.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
@Entity
public class Course {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;

    @ManyToMany
    @JoinTable(name = "authers_courses", joinColumns = {
            @JoinColumn(name = "course_id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "auther_id")
    })
    private List<Auther> authers;

    @OneToMany(
        mappedBy = "course"
    )
    private List<Section> sections;
}
