package org.example.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, 26, "Avinash"));
        list.add(new Student(2, 25, "Akshay"));
        list.add(new Student(3, 24, "Brijesh"));
        list.add(new Student(4, 26, "Abhishek"));

        Collections.sort(list,new Sortkar()); //this one according to comparator
        for (Student s : list)
            System.out.println(s.name);
        Collections.sort(list);   //this is sorting according to comparable
        System.out.println(list);
    }
}
