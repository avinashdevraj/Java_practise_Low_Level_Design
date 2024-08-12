package org.example.StreamsMapFilter;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.sql.Date.valueOf;

public class Streamcheck {
    public static void main(String[] args) {
        List<String> list= List.of("1","2","3","4","-6","-8","10");
        List<Integer> list1=list.stream().map(Integer::valueOf).collect(Collectors.toList());
        Collections.sort(list1);
        System.out.println(list1);
        List<Integer> list2=list.stream().map(a->Integer.parseInt(a)).filter(a->a%2==0).collect(Collectors.toList());
        Collections.sort(list2);
        System.out.println("Even numbers are :"+" "+ list2);
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
    }

}
