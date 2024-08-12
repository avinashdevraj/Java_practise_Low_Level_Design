package org.example.DesignPattern.Prototype;

import org.example.DesignPattern.Builder.Student;

public class Client2 {
    public static void main(String[] args) {

        Registry register=new Registry();
        fillregistry(register);
        Student2 ramesh=new Student2(register.getValue("Acharya"));
        ramesh.setName("Ramesh");
        ramesh.setAge(23);

        Student2 raj=new Student2(register.getValue("Acharya"));
        raj.setName("raj");
        raj.setAge(23);


        Student2 basu=register.getValue("Acharya").clone();
        basu.setName("basu");
        basu.setAge(24);


        System.out.println("Debug");

    }
    public static void fillregistry(Registry registry){
        Student2 acharyaPrototype=new Student2();
        acharyaPrototype.setName("Avinash");
        acharyaPrototype.setUniName("VTU");
        acharyaPrototype.setAge(26);
        acharyaPrototype.setCity("Banglore");
        acharyaPrototype.setCollegeName("Acharya");
        registry.register("Acharya",acharyaPrototype);
    }

}