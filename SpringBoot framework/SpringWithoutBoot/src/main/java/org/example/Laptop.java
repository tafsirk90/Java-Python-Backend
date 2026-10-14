package org.example;

public class Laptop implements Computer{
    public void build() {
        System.out.println("Building some thing");
    }
    @Override
    public void compile(){
        System.out.println("Compiling in laptop");
    }
    //Constractor injection
//    private String name;
//    private int price;
//    public Laptop(String name) {
//        this.name = name;
//        System.out.println("Laptop " + name);
//    }
//    public Laptop(String name, int price){
//        this.name = name;
//        this.price = price;
//        System.out.println("Laptop " + name + " " + price);
//    }
}
