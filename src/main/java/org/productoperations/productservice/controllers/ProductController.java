package org.productoperations.productservice.controllers;

import org.productoperations.productservice.dtos.CreateProductDto;
import org.productoperations.productservice.exceptions.ProductNotFoundExceptions;
import org.productoperations.productservice.models.product;
import org.productoperations.productservice.services.Productservice;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {


    //dependency injection
    private Productservice productservice;//object datatype and interface and dependency injection(DI)
    //in @Qualifier need to inject objects of service class ex: fakeStoreProductService or selfProductService
    public ProductController(@Qualifier("selfProductService") Productservice productservice) {
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
        //return productservice.getAllProducts(List<Long> ids);
    }

    /*
    * GET /products/{id}
    * */
    @GetMapping("/products/{id}")
    public product getSingleProduct(@PathVariable("id") long id) throws ProductNotFoundExceptions {

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
    //we are changing return type from void to product just for testing
    @PostMapping("/products")//products -> endpoint
    public product createProduct(@RequestBody CreateProductDto createProductDto)
    {
        return productservice.createProduct(createProductDto.getTitle(), createProductDto.getDescription(), createProductDto.getImage(), createProductDto.getPrice(), createProductDto.getImage());
    }
}
