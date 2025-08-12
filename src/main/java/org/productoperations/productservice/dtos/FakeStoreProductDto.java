package org.productoperations.productservice.dtos;

import org.productoperations.productservice.models.Category;
import org.productoperations.productservice.models.product;

public class FakeStoreProductDto {
    private String title;
    private String description;
    private double price;
    private String Category;
    private String image;

    public product toProduct() {
        product p1 = new product();
        p1.setTitle(title);
        p1.setDescription(description);
        p1.setPrice(price);
        Category cat = new Category();
        cat.setTitle(Category);
        p1.setCategory(cat);
        p1.setImageurl(image);
        return p1;
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

    public String getCategory() {
        return this.Category;
    }

    public String getImage() {
        return this.image;
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

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public void setImage(String image) {
        this.image = image;
    }

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
}
