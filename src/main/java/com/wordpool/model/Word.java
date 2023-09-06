package com.wordpool.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TERM" )
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "term")
    String term;
    @Column(name = "description")
    String description;
    @Column(name = "active")
    boolean active;
}
