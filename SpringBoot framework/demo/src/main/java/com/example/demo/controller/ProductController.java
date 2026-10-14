package com.example.demo.controller;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/Products")
    public List<Product> getProducts() {
        return productService.getProductList();
    }
    @RequestMapping("/Products/{prodID}")
    public Product getProductById(@PathVariable int prodID) {
        return productService.getProductById(prodID);
    }
    @PostMapping("/Products")
    public void addProducts(@RequestBody Product prod) {
        productService.addProduct(prod);
    }
    @PutMapping("/Products")
    public void updateProducts(@RequestBody Product prod) {
        productService.updateProduct(prod);
    }
    @DeleteMapping("/Products/{ProdID}")
    public void deleteProducts(@PathVariable int ProdID) {
        productService.deleteProduct(ProdID);
    }
}
