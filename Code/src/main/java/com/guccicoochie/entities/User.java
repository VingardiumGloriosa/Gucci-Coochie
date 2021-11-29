package com.guccicoochie.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(length = 10,nullable = false)
    String name;

    @Column(length = 300,nullable = false)
    String bio;

    @Column(length = 100,nullable = false)
    String location;

    @Column(length = 100)
    String profile_picture_url;

    public User() {}

    public User(String name, String bio, String location){
        this.name=name;
        this.bio=bio;
        this.location=location;
    }

    public User(String name, String bio, String location, String profile_picture_url){
        this.name=name;
        this.bio=bio;
        this.location=location;
        this.profile_picture_url=profile_picture_url;
    }
}
