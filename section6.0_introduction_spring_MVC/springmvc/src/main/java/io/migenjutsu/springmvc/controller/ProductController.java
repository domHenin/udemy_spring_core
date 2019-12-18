package io.migenjutsu.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.migenjutsu.springmvc.services.ProductService;

@Controller
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String listProducts(Model model){

        model.addAttribute("products", productService.listAllProducts());

        return "products";
    }
}


    // private ProductService productService;

    // @Autowired
    // public void setProductService(ProductService productService) {
    //     this.productService = productService;
    // }

    // @RequestMapping("/products")
    // public String listProducts(Model model) {

    //     model.addAttribute("products", productService.listAllProducts());

    //     return "products";
    // }