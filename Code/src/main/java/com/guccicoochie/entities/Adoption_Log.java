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
public class Adoption_Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    @JoinColumn(name = "new_owner_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "adopted_cat_id")
    Cat cat;

    @Column
    Date date;

    @Column
    Time time;

    public Adoption_Log() {}
}
