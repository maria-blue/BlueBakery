package com.blue.enterprise.BlueBakery.repository;

import com.blue.enterprise.BlueBakery.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}