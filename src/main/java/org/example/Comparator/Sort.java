package org.example.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    List<Student> list;

    public Sort(List<Student> list) {
        this.list = list;
    }

    public void sort(){
        Collections.sort(list,this::comp);                            ///2nd way to sort it using comparator.
//        for (Student s : list)
//            System.out.println(s.name);

        Collections.sort(list, new Comparator<Student>() {            ////3rd way to sort using comparator
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        Collections.sort(list,new Sortkar());                         ////4th way to sort using comparator

        Collections.sort(list,(a,b)-> a.name.compareTo(b.name));

    }

    public int comp(Student s1,Student s2){

        return s2.id-s1.id;

    }
}

