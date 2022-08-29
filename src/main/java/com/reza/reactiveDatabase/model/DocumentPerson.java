package com.reza.reactiveDatabase.model;

import org.springframework.data.annotation.Id;

public class DocumentPerson {
    @Id
    private int id;
    private int documentId;
    private int personId;

    public DocumentPerson(int documentId, int personId) {
        this.documentId = documentId;
        this.personId = personId;
    }

    public int getId() {
        return id;
    }

    public DocumentPerson setId(int id) {
        this.id = id;
        return this;
    }

    public int getDocumentId() {
        return documentId;
    }

    public DocumentPerson setDocumentId(int documentId) {
        this.documentId = documentId;
        return this;
    }

    public int getPersonId() {
        return personId;
    }

    public DocumentPerson setPersonId(int personId) {
        this.personId = personId;
        return this;
    }
}
