package org.example.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo {
    public static void main(String[] args)  {
        try {
            dosomething();
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("Hope you are getting it");
        }
        try{
            find();
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

    }
    public static void dosomething() throws ArithmeticException, InputMismatchException {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(x/y);
    }
    public static void find(){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(x/y);
    }
}
