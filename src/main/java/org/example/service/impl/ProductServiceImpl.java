package org.example.service.impl;

import org.example.model.Product;
import org.example.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private List<Product> products = new ArrayList<>();

    @Override
    public Product create(Product product) {
        if (get(product.getId()) == null) {
            products.add(product);
            return product;
        }
        return null;
    }

    @Override
    public Product get(long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product update(long id, Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getId() == id) {
                products.set(i, updatedProduct);
                return updatedProduct;
            }
        }
        return null;
    }

    @Override
    public Product delete(long id) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getId() == id) {
                products.remove(i);
                return product;
            }
        }
        return null;
    }
}
