package org.productoperations.productservice.services;

import org.productoperations.productservice.exceptions.ProductNotFoundExceptions;
import org.productoperations.productservice.models.Category;
import org.productoperations.productservice.models.product;
import org.productoperations.productservice.repositories.CategoryRepository;
import org.productoperations.productservice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService")
public class SelfProductService implements Productservice{

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }
    public product getSingleProduct(long id) throws ProductNotFoundExceptions {
        Optional<product> OptionalProduct = productRepository.findById(id);
        if(OptionalProduct.isEmpty())
        {
            throw new ProductNotFoundExceptions("product with given id does not exist");
        }
        return OptionalProduct.get();

    }

    public List<product> getAllProducts()
    {
        //get all products from product table
        return productRepository.findAll();

    }

    @Override
    public product createProduct(String title, String description, String CategoryName, double price, String image) {
        product product1 = new product();
        product1.setTitle(title);
        product1.setDescription(description);
        product1.setPrice(price);
        product1.setImageurl(image);

        //category object
        //product1.SetCategory(category object / table)

        //need to get the corresponding object from the
        //category table -> u need check with a category with the name in the parameter exist r not
        Category categoryFromDB = categoryRepository.findByTitle(CategoryName);
        if (categoryFromDB == null) {
            Category newCategory = new Category();
            newCategory.setTitle(CategoryName);
            product1.setCategory(newCategory);
        }
        else
        {
            product1.setCategory(categoryFromDB);
        }
        //who will help to insert the product in the product table? - category repository
        product createdProduct = productRepository.save(product1);////save will accpet the product object and save in product table
        //when product is not created, return value maybe null or enterily on object response
       // how will then new category id is stored in DB? -> via FK constraints
        return createdProduct;
    }
}
