package com.reza.reactiveDatabase.model;

import org.springframework.data.annotation.Id;

public class Document {
    @Id
    private int id;
    private String title;
    private String subject;

    public Document(String title, String subject) {
        this.title = title;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public Document setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Document setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public Document setSubject(String subject) {
        this.subject = subject;
        return this;
    }
}
