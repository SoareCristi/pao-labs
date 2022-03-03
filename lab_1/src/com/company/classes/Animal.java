package com.company.classes;

// POJOs plain old java object (Campuri si constructori)
public class Animal {
    public int age;
    public String name;

    public Animal() {
    }

    public Animal(int age){
        this.age = age;
        // neaparat sa fie this
    }

//    Overloaded constructor
    public Animal(int age, String name) {
        this(age); //s-a apelat celalalt constructor, obligatoriu pe primul rand
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound (){
        System.out.println("This animal makes the sound: mac");
    }

    public void move(){
        System.out.println("This animal: flies");
    }


}
