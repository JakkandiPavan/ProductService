package org.productoperations.productservice.repositories;

import org.productoperations.productservice.models.Category;
import org.productoperations.productservice.models.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<product, Long> {
    //JpaRepository<model type(model), data type of primary key (ID - Long)>
    @Override
List<product> findAll();

    @Override
    Optional<product> findById(Long id);

    List<product> findAllByCategory(Category category);


}

