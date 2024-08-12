package org.example.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args)  {
        try {
            dosomething();
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("Hope you are getting it");
        }

    }
    public static void dosomething()  {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(y==0){
            throw new ArithmeticException("Dont give zero as input");
        }
        System.out.println(x/y);
    }
}
