package com.guccicoochie.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    @JoinColumn(name = "owner_user_id")
    User user;

    @Column(length = 10,nullable = false)
    String name;

    @Column(length = 300,nullable = false)
    String bio;

    @Column(length = 100)
    String breed;

    @Column(length = 100)
    String profile_picture_url;

    public Cat() {}
}
