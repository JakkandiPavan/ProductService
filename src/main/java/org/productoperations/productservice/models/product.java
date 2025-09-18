package org.productoperations.productservice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class product extends BaseModel {
    private long id;
    private String title;
    private String description;
    private double price;
    @ManyToOne(cascade = {CascadeType.PERSIST}) //cardinality
    private Category category;
    private String imageurl;
    /*
    * product Category
    * relation = cardinality
    *
    * product  Category
    * 1        1
    * Many     1
    * P : C
    * M : 1
    *
    * are we defining a foreign key constraints?
    *
    * in your product table, will you have a category id column?
    * */

    public product(long id, String title, String description, double price, Category category, String imageurl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.category = category;
        this.imageurl = imageurl;
    }

    public product() {
    }

    public long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public Category getCategory() {
        return this.category;
    }

    public String getImageurl() {
        return this.imageurl;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
