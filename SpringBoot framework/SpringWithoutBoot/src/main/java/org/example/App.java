package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev dev = context.getBean(Dev.class);
        Laptop laptop1 = context.getBean("laptop1",Laptop.class);
        laptop1.build();
//        Laptop laptop2 = context.getBean("laptop2",Laptop.class);
//        laptop2.build();
        dev.build();
//        System.out.println(dev.getAge());
    }
}
