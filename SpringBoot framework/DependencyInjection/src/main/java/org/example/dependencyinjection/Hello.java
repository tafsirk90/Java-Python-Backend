package org.example.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Hello {
    @Autowired //Field Injection
    @Qualifier("seat")
    private Human h;
//    private Run r; //Constractor Injection
//    public Hello(Run r){
//        this.r = r;
//    }
//    private Run r; //Setter Injection
//    @Autowired
//    public void SetRun(Run r){
//        this.r = r;
//    }
    public void build(){
        System.out.println("Hello !!");
        h.eat();
    }
}
