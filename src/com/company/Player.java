package com.company;

/**
 * Created by Piotr Czubkowski on 2017-05-17.
 */
public class Player {

    public int score;
    public String name;
    private String lastname;


    @UsingInternet(internetGetway = "WiFi")
    public String getName() {
        return name;
    }

    private int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @UsingInternet(internetGetway = "3g")
    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void printScore(String s) {
        System.out.println("to klasa " + s);
    }
}

