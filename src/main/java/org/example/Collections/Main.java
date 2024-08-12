package org.example.Collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
       // TreeSet<Integer> set=new TreeSet<>();
        Set<Integer> set2=new LinkedHashSet<>();
        set2.add(3);
        set2.add(5);
        set2.add(1);
        set2.add(8);
        System.out.println(set2);

    }
}
