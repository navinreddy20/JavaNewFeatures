package org.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class RecordDemo {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student student = new Student(3,"Navin");
        Student student2 = new Student(1,"Hyder");
        Student student3 = new Student(1,"Hyder");

        Set<Student> set = new HashSet<>();
        set.add(student);
        set.add(student2);
        set.add(student3);

        System.out.println(set.size());



    }
}

record Student(int id, String name) { }

//class Student {
//    private int id;
//    private String name;
//
//    public Student(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return id == student.id && Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//}
//
//
//
//
//



// POJO - Plain Old Java Object
// EJB - Enterprise Java Bean
// Object -> POJOs

class Laptop {
    private int id;
    private String brand;
    private String model;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}










// DTO - Data Transfer Object

// Client -> Server  -> Database
// Android -> Java Code -> Table
// JSON ->   Java Code (multiple layers) -> Student
// XML ->    Java Code (multiple layers) -> Student
// JavaScript Object Notation
// Extensible Markup Language

// Multiple Layers -> Controller  -> Service -> Repository -> Database