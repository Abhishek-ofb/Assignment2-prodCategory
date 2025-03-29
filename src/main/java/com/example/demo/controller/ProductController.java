package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;


    @GetMapping
    public Page<Product> getAllProducts(Pageable pageable) {
        return productService.getProducts(pageable);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PostMapping("/bulk")
    public List<Product> createProducts(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }

    @GetMapping("/category/{categoryId}")
    public Page<Product> getProductsByCategory(@PathVariable Long categoryId, Pageable pageable) {
        return productService.getProductsByCategory(categoryId, pageable);
    }
}
