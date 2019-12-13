package io.migenjutsu.springmvc.services;

import java.util.List;

import io.migenjutsu.springmvc.domain.Product;

public interface ProductService {
    List<Product> listAllProducts();
}