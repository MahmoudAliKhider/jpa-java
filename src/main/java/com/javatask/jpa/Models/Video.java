package com.javatask.jpa.Models;

import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuppressWarnings("deprecation")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Entity
// @DiscriminatorValue("V")
// @PrimaryKeyJoinColumn(name = "video_id")// if i need to change id to video_id
@Polymorphism(type = PolymorphismType.EXPLICIT)

public class Video extends Resource{

    private int length;
}
