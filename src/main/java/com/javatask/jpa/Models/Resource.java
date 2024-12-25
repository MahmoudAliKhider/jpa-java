package com.javatask.jpa.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Resource {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int Size;
    private String url;

    @OneToOne
    private Lecture lecture;
}
