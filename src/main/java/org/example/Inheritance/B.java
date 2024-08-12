package org.example.Inheritance;

public class B extends A{
    int year;
    B(){
        System.out.println("B");
    }
    B(int year){
        System.out.println("B with 1 arguments");
    }
}
