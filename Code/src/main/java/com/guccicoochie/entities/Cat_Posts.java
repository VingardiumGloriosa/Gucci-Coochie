package com.guccicoochie.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Cat_Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    @JoinColumn(name = "cat_id")
    Cat cat;

    @Column(length = 400,nullable = false)
    String text;

    @Column(length = 100)
    String picture_url;

    public Cat_Posts() {}
}
