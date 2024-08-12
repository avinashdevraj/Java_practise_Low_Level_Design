package org.example.Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> ani1=new ArrayList<>();
        List<Cat> ani2= new ArrayList<Cat>();
        List<Dog> ani3=new ArrayList<>();
          dosomething(ani1);
          dosomething(ani2);
          dosomething(ani3);

//        dosomething2(ani2);
//        dosomething2(ani3);


       // r.findMedianSubarrayUniquenss(arr);
          Pair p1=new Pair(2,3);
          Pair p2=new Pair();
          p2.x="4gj";
          p2.y=8;
        System.out.println("("+p1.x+","+p1.y+")"+"and"+ "("+p2.x+","+p2.y+")" );
       // Student<String,Integer> s1=new Student<>();
        Student<String,Integer> s1=new Student<>();
        s1.name="Avinash";
        s1.marks=86;
        System.out.println(s1.name+" "+s1.marks);
    }
//
    private static void dosomething(List< ? extends Animal> ani1) {

    }
    private static void dosomething2(List< ? super Animal> ani1) {

    }


}
