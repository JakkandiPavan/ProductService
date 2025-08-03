package org.productoperations.productservice.models;

public class Category {

    private long id;
    private String title;

    public Category(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Category() {
    }

    public long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


/*
* P-Product C-Category
* P C
* 1 1
* m 1 -> cardinality
* */