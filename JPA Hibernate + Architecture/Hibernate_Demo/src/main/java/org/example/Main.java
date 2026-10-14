package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setId("IT-24065");
        s.setName("Mohit");
        s.setDept("ICT");

        Configuration config = new Configuration();
        config.addAnnotatedClass(org.example.Student.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(s);
        transaction.commit();
//        Student r = session.find(org.example.Student.class, "IT-24060");
//        session.remove(r);
        //Eager Loading
        Student result = session.find(org.example.Student.class, "IT-24065");
        System.out.println(result);
//        //Lazy Loading
//        Student result2 = session.byId(org.example.Student.class).getReference("IT-24060");
//        System.out.println(result2);
    }
}