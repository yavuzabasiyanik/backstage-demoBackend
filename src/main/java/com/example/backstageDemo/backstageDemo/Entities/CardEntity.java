package com.example.backstageDemo.backstageDemo.Entities;

import jakarta.persistence.*;

@Entity
public class CardEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "cardholder")
    private String cardholder;

    @Column(name = "score")
    private String score;



    public CardEntity(String cardholder, String score) {
        this.cardholder = cardholder;
        this.score = score;
    }

    public CardEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

}
