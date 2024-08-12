package org.example.DesignPattern.Builder;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static <Builder> void main(String[] args) {
      //  Student student=new Student();
//        student.setName("Avinash");
//        student.setage(19);


//next-2nd solution---
//Student student=new Student("Avinas","xyz","abc",26,97,"126368569");
        //Builder builder=Student.getbuilder();

//        Builder builder=new Builder();
//        builder.setAge(25);
//        builder.setName("Raj");
//        builder.setAddress("abc");
//        builder.setPhoneNumber("1234567897");

        //Student student=new Student(builder);



//        Student student=builder.build();

        Student student1=Student.getbuilder()
                        .setAddress("xyz").setAge(23)
                        .setName("Raj")
                                .setPhoneNumber("1234567890").build();

        System.out.println("Debug");


    }
}
