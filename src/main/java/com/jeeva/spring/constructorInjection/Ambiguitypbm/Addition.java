package com.jeeva.spring.constructorInjection.Ambiguitypbm;

public class Addition {

    Addition(int a, int b) {
        System.out.println("inside Constructor int");
    }

    Addition(double a, double b) {
        System.out.println("inside Constructor double");
    }

    Addition(String a, String b) {
        System.out.println("inside Constructor String");
    }


    Addition(int a, double b){
        System.out.println("Inside the int and Double constructor");
        System.out.println(a);
        System.out.println(b);
    }

    @Override
    public String toString() {
        return "Addition{}";
    }
}
