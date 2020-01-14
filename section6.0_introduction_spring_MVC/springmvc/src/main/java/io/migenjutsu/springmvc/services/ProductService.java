package io.migenjutsu.springmvc.services;

import java.util.List;


import io.migenjutsu.springmvc.domain.*;

public interface ProductService {
    List<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveOrUpdateProduct(Product product);
}

    // List<Product> listAllProducts();

    // Product getProductById(Integer id);