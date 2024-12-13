package com.leaning.app.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private record Product(Integer productId, String productName, double price) {
    }

    List<Product> products = new ArrayList<>(List.of(new Product(1, "Macbook", 150000), new Product(2, "Samsung Galaxy", 1700), new Product(3, "Keyboard", 2100)));

    @GetMapping
    public List<Product> getProducts(){
        return products;
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product){
        products.add(product);
        return product;
    }
}
