package org.example.Exceptions;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
         dosomething();
         String s1="hello";
         String s2="hello";
         String s3=new String("hello");
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));

    }
    public static void dosomething(){
        System.out.println("hi");
        find();
    }
    static void find(){
        System.out.println("find");
    }

}
