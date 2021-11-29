package com.guccicoochie.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Timer;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Adoption_Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    @JoinColumn(name = "adopting_user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "adoptee_cat_id")
    Cat cat;

    @Column(length = 30,nullable = false)
    String status;

    public Adoption_Request() {}
}
