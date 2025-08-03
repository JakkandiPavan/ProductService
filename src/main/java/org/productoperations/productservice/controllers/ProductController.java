package org.productoperations.productservice.controllers;

import org.productoperations.productservice.dtos.CreateProductDto;
import org.productoperations.productservice.models.product;
import org.productoperations.productservice.services.Productservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    //dependency injection
    private Productservice productservice;
    public ProductController(Productservice productservice) {
        this.productservice = productservice;
    }

    /*
    *API - methods in controller class
    * */

    /*
    * models
    * GET /products: get all products
    * */
    @GetMapping("/products")
    public List<product> getAllProducts() {
        return productservice.getAllProducts();
    }

    /*
    * GET /products/{id}
    * */
    @GetMapping("/products/{id}")
    public product getSingleProduct(@PathVariable("id") long id) {
        return productservice.getSingleProduct(id);
    }

    /*
    * Assertion: For creating a Product, we should call the API "/products/{id}"
    * with the HTTP method "POST". Reason: Every Product has a unique id
    *
    * ANS: Reason is correct, Assertion is wrong
    * -------------------------------------------------------------------------
    *
    * POST /product: Create a new product
    * {
    * title: ___________;
    * description: ___________;
    * imageurl: ____________;
    * .
    * .
    * .
    * }
    * */
    @PostMapping("/products")
    public void createProduct(CreateProductDto createProductDto)
    {
        productservice.createProduct(createProductDto);
    }
}
