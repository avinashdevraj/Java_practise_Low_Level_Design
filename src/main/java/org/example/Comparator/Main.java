package org.example.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, 26, "Avinash"));
        list.add(new Student(2, 25, "Akshay"));
        list.add(new Student(3, 24, "Brijesh"));
        list.add(new Student(4, 26, "Abhishek"));

        Collections.sort(list, (a, b) -> {
            return b.age - a.age;
        });

        Sort sort=new Sort(list);
        sort.sort();
        //for (Student s : list)
            System.out.println(list);
    }



}
