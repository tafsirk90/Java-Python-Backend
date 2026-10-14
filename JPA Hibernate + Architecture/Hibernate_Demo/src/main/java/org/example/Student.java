package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private String id;
    private String name;
    private String dept;

    public void setId(String id){this.id=id;}
    public void setName(String name){this.name=name;}
    public void setDept(String dept){this.dept=dept;}
    public String getId(){return id;}
    public String getName(){return name;}
    public String getDept(){return dept;}

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
    }
}
