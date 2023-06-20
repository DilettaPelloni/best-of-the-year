package org.lessons.bestOfTheYear.model;

public class Song {

    //ATTRIBUTI ------------------------------------------------
    private int id;
    private String title;

    //COSTRUTTORE ------------------------------------------------
    public Song(int id, String title) {
        this.id = id;
        this.title = title;
    }

    //GETTERS ------------------------------------------------
    public int getId() { return id; }
    public String getTitle() { return title; }

}
