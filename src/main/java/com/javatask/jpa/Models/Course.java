package com.javatask.jpa.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@AllArgsConstructor
@SuperBuilder
@Entity
public class Course extends BaseEntity{

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
