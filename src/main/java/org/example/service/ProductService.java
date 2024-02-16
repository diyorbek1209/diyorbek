package org.example.service;

import org.example.model.Product;

import java.util.List;

public interface ProductService {
    Product create(Product product);
    Product get(long id);
    List<Product> getAll();
    Product update(long id, Product product);
    Product delete(long id);
}