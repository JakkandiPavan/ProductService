package org.productoperations.productservice.repositories;

import org.productoperations.productservice.models.Category;
import org.productoperations.productservice.models.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    //slect * from Category where title like '@parameter' - instead use JPA methods

    Category findByTitle(String title);

    product save(product p); //save will accpet the product object and save in product table
    //

}
