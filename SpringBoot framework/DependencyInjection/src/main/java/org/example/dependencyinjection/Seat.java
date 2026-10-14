package org.example.dependencyinjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Seat implements Human {
    public void eat(){
        System.out.println("Eating while seating");
    }
}
