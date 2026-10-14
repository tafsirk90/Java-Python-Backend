package org.example;

public class Dev {
    //Setter injection for ref variable
//    private Laptop laptop;
//    private Laptop getLaptop() {
//        return laptop;
//    }
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
    //Setter injection
//    private int age;
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public int getAge(){
//        return this.age;
//    }
    //Constactor injection for ref variable
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }
    private Computer com;
    public void setCom(Computer com) {
        this.com = com;
    }
    public Computer getCom(){
        return this.com;
    }
    public void build() {
        System.out.println("Already built!!");
        com.compile();
//        laptop.build();
    }
}
