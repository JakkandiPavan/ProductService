package org.productoperations.productservice.services;

import org.productoperations.productservice.exceptions.ProductNotFoundExceptions;
import org.productoperations.productservice.models.product;

import java.util.List;
import java.util.Optional;

public interface Productservice {

    public List<product> getAllProducts();

    product getSingleProduct(long id) throws ProductNotFoundExceptions;

    public product createProduct(String title, String description, String Category, double price, String image);//this will be wrong if we send whole product object

}
