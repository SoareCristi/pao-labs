package com.company.classes;

public class Bird extends Animal {

    public Bird() {
    }

    public Bird(int age, String name) {
        super(age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("This birds says: chirp");
//        super.makeSound(); //apeleaza din clasa de baza
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public boolean equals(Object obj) {
        Bird b = (Bird) obj;
        if (this.getAge() == b.getAge() && this.getName().equals(b.getName())) {
            return true;
        } else {
            return false;
        }

//        return this.getAge() == b.getAge() && this.getName().equals(b.getName())
    }

    @Override
    public String toString() {
        return "Bird's name is " + this.getName() + " and it is " + this.getAge() + " years old";
    }
}
