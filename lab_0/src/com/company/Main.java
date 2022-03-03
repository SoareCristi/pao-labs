package com.company;
//imports
import com.company.models.Student;
import com.company.models.Teacher;
//import com.company.models.* importa toate clasele din pachet

public class Main {

    //psvm pentru public static void main
    public static void main(String[] args) {
	Student student = new Student();
    Teacher teacher = new Teacher();
    System.out.println(":("); //sout

    // tipuri de date
    // numerice
    // byte, short, int, long, float, double
    long myLong = 100_000_000_000L;
    float myFloat = 2.14F;
    double myDouble = 2.14;
    float myFloat2 = (float)2.14;
    // alfanumerice

    char c = 'a';
    //char d = 'asdb';
    String myString = "asdb";

    // other

    boolean f = true;
    boolean t = false;


    //Operatori


    // Decizionale
    if (2 == 2){
        System.out.println("ASDF");
    } else if (2 == 3) {
        System.out.println();
    } else {
        System.out.println();
    }

    switch(1){
        case 1:
            System.out.println();
            break;
        case 0:
            System.out.println();
            break;
        default:
            System.out.println();
            break;
    }

    // Repetitive
    for (int i = 0; i < 10; i++){
        System.out.println();
        break;
    }

    while(f){
        System.out.println();
        f = false;
    }

    }
}
