package com.company.statics;

public class StaticPlayground {

//    block of code, in this case a static one
    static {
    System.out.println("In this static block");

    }


    public static int num = 0;

    public StaticPlayground(){
        StaticPlayground.num++;
        System.out.println(StaticPlayground.num);
    }

    public static void main(String[] args) {
        StaticPlayground x = new StaticPlayground();
        StaticPlayground y = new StaticPlayground();
        StaticPlayground.staticMethod(); //Recommended
        x.staticMethod(); //Not recommended
    }

    public static void staticMethod(){
        System.out.println("asdf");
    }

}
