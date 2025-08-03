package org.productoperations.productservice.models;

public class product {
    private long id;
    private String title;
    private String description;
    private double price;
    private Category category;
    private String imageurl;

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
