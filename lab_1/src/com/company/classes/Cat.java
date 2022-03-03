package com.company.classes;

public class Cat extends Animal {

    private CatBreed catBreed;

//    shift+F6(Poate 7) redenumeste absolut oricepeste tot
    public Cat(int age, String name, CatBreed catBreed) {
        super(age, name);
        this.catBreed = catBreed;
    }

    public CatBreed getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(CatBreed catBreed) {
        this.catBreed = catBreed;
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public void move() {
        super.move();
    }
}
