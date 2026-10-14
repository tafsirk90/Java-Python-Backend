package com.example.demo.model;

public class Product {
    int ProdID;
    String ProdName;
    String ProdPrice;

    public Product(int ProdID, String ProdName, String ProdPrice) {
        this.ProdID = ProdID;
        this.ProdName = ProdName;
        this.ProdPrice = ProdPrice;
    }

    public String getProdName() {
        return ProdName;
    }
    public String getProdPrice() {
        return ProdPrice;
    }
    public int getProdID() {
        return ProdID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProdID=" + ProdID +
                ", ProdName='" + ProdName + '\'' +
                ", ProdPrice='" + ProdPrice + '\'' +
                '}';
    }
}
