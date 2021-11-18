package com.manifestcorp.techreads.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title;
    String author;
    Integer rating;
    String description;
    String coverURL;

    public Book() {}

    public Book(String title, String author, Integer rating,String coverURL,  String description){
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.coverURL = coverURL;
        this.description = description;

    }

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public String getTitle() { return title;}
    public void setTitle(String title){ this.title = title;}

    public String getAuthor() {return author;}
    public void setAuthor(String author){this.author = author;}

    public Integer getRating() {return rating;}
    public void setRating(Integer rating) {this.rating = rating;}

    public String getDescription() {return description;}
    public void setDescription(String description){this.description = description;}

    public String getCoverURL() {
        return coverURL;
    }

    public void setCoverURL(String coverURL) {
        this.coverURL = coverURL;
    }
}
