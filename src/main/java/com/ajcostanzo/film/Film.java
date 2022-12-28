package com.ajcostanzo.film;

public class Film {

    private String title;
    private String id;

    public Film(String title, String id) {
        this.title = title;
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }
}
