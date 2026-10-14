package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> productList = new ArrayList<>(Arrays.asList(
            new Product(101, "Pen", "20"),
            new Product(102, "Pencil", "5"),
            new Product(103, "Scale", "10")
    ));
    public  List<Product> getProductList() {
        return productList;
    }
    public Product getProductById(int prodID) {
        return productList.stream()
                .filter(p -> p.getProdID() == prodID)
                .findFirst()
                .orElse(null);
    }
    public void addProduct(Product prod) {
        productList.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for(int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getProdID() == prod.getProdID()) {
                index = i;
            }
        }
        productList.set(index, prod);
    }

    public void deleteProduct(int prodID) {
        int index = 0;
        for(int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getProdID() == prodID) {
                index = i;
            }
        }
        productList.remove(index);

    }
}
