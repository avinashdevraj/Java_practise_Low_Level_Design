package org.example.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(x/y);
            System.out.println("checked the exception");

        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Good to go");
        }

    }
}
