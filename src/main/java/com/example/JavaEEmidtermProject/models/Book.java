package com.example.JavaEEmidtermProject.models;

public class Book implements java.io.Serializable {
    private long id;
    private String title;
    private String author;
    private String genre;
    private int published;
    private long userId = 0;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
    public Book(){

    }
    public Book(long id, String title, String author, String genre, int published) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.published = published;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }
}
