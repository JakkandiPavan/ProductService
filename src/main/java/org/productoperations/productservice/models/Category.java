package org.productoperations.productservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity //entity is JPA annotation - will tell that create tables when I run this
public class Category extends BaseModel {

    private String title;

    @OneToMany (fetch = FetchType.EAGER, mappedBy = "category", cascade = {CascadeType.REMOVE})
    @JsonIgnore
    private List<product> products;//electronics

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<product> getProducts() {
        return products;
    }

    public void setProducts(List<product> products) {
        this.products = products;
    }
}


/*
* P-Product C-Category
* P C
* 1 1
* m 1 -> cardinality
* */