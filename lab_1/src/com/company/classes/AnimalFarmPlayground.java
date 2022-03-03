package com.company.classes;

public class AnimalFarmPlayground {

    public static void main(String[] args) {

//        Animal myAnimal = new Animal(); -> constructorul default dispare daca cream un constructor manual
        Animal myAnimal = new Animal(2);//ctrl + d duplicate line
        System.out.println(myAnimal.getAge());

        Animal myAnimal2 = new Animal(2, "Azorel");
        System.out.println(myAnimal2.getAge());
        System.out.println(myAnimal2.getName());
        myAnimal2.makeSound();
        myAnimal2.move();

        Bird myBird = new Bird();
        myBird.makeSound();
        myBird.move();
//        Casting la animal ca sa apelam functia din clasa de baza
        //myBird.super.makeSound();


        Cat myCat = new Cat(4, "Olicul", CatBreed.PERSIAN);
        System.out.println(myCat.getCatBreed());
        System.out.println(myCat.getName());

        Bird bird1 = new Bird(1, "Paul");
        Bird bird2 = new Bird(1, "Paul");
        Bird bird3 = bird1;

        System.out.println(bird1 == bird2);
        System.out.println(bird1 == bird3);
        System.out.println(bird1.equals(bird2));
    }
}
