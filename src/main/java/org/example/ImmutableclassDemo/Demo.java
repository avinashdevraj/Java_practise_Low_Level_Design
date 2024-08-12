package org.example.ImmutableclassDemo;

public class Demo {
    public static void main(String ar[])
    {
        Employee e = new Employee("ABC123");
        String s1 = e.getPancardNumber();
        Employee e2=new Employee("axcv");
        System.out.println("Pancard Number: " + e2.getPancardNumber());
    }
}
