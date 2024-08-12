package org.example.DesignPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        College college=College.getInstance();
        College c=College.getInstance();
        System.out.println(college+" "+c);
    }
}
