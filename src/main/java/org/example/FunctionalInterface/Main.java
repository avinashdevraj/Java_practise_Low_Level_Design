package org.example.FunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //Can we create object of Interface?-ans=NO
        //how to use functionality of Interface.3-different Ways.

        //Way-1-creating class object which implements those Interface and use class object to call the method of Interface
        BiPredicate<String,Integer> biPredicate1=new Bipredicatesimpl();
        System.out.println(biPredicate1.test("Scaler",3));

        //Way-2-creating ananoymus class by itself and override the Interface method here itself
        BiPredicate<String,Integer> biPredicate2=new BiPredicate<String, Integer>() {
            @Override
            public boolean test(String s, Integer val) {
                return s.length()>val;
            }
        };
        System.out.println(biPredicate2.test("scaler",7));


        //way-3-by lambda technique(Java-8).Only used in Functional-Interface.
        //()->inputs in round brackets.
        //{}->Implementation of logic.
        BiPredicate<String,Integer> biPredicate3=(str,val)->{return str.length()>=val;};
        System.out.println(biPredicate3.test("Scaling",7));


    }
}
