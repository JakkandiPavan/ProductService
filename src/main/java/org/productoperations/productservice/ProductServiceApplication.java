package org.productoperations.productservice;

import org.productoperations.productservice.models.product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {
    product p1 = new product();
    

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

}
