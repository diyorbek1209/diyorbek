package org.example.service;

import org.example.model.Basket;
import org.example.model.Product;


import java.util.List;

public interface BasketService {
    Basket create(Basket basket);

    Basket get(long id);

    List<Basket> getAll();

    Basket update(long id, Basket basket);

    Basket delete(long id);
}