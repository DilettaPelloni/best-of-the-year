package org.lessons.bestOfTheYear.model;

public class Movie {

    //ATTRIBUTI ------------------------------------------------
    private int id;
    private String title;

    //COSTRUTTORE ------------------------------------------------
    public Movie(int id, String title) {
        this.id = id;
        this.title = title;
    }

    //GETTERS ------------------------------------------------
    public int getId() { return id; }
    public String getTitle() { return title; }

}
