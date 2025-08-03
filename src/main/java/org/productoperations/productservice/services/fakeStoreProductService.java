package org.productoperations.productservice.services;

import org.productoperations.productservice.dtos.CreateProductDto;
import org.productoperations.productservice.dtos.FakeStoreProductDto;
import org.productoperations.productservice.models.product;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class fakeStoreProductService implements Productservice {

    //is to call FakeStoreAPI.com(internet) from the method
    //declaring it as a private field within a service class,
    // then injecting it via constructor injection.
    private RestTemplate restTemplate;

    public fakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public List<product> getAllProducts() {
        return List.of();
    }

    //this method is used to call 3rd party API to fetch single data
    @Override
    public product getSingleProduct(long id) {
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreProductDto.class);
        //return FakeStoreProductDto.toProduct() -> You're calling toProduct() on the class name, but toProduct() is not static.
        //You should call it on the object:
//        if (fakeStoreProductDto == null) {
//            throw new RuntimeException("Product not found for id: " + id);
//        }
        return fakeStoreProductDto.toProduct();
    }

    @Override
    public void createProduct(CreateProductDto createProductDto) {

    }
}

