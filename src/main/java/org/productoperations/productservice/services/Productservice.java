package org.productoperations.productservice.services;

import org.productoperations.productservice.dtos.CreateProductDto;
import org.productoperations.productservice.models.product;

import java.util.List;

public interface Productservice {

    public List<product> getAllProducts();

    public product getSingleProduct(long id);

    public product createProduct(CreateProductDto createProductDto);
}
