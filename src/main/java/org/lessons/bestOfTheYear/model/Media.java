package org.lessons.bestOfTheYear.model;

public abstract class Media {

    //ATTRIBUTI ------------------------------------------------
    private int id;
    private String title;

    //COSTRUTTORE ------------------------------------------------
    public Media(int id, String title) {
        this.id = id;
        this.title = title;
    }

    //GETTERS ------------------------------------------------
    public int getId() { return id; }
    public String getTitle() { return title; }

}
