package org.example.dependencyinjection;

import jdk.jfr.Category;
import org.springframework.stereotype.Component;

@Component
public class Run implements Human{
    @Override
    public void eat() {
        System.out.println("Eating");
    }
    public void run(){
        System.out.println("Starting now!!");
    }
}
