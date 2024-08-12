package org.example.Inheritance;

public class C extends B{
    double marks;
    C(){
        System.out.println("C");
    }
    C(double marks){
        System.out.println("C with 1 Arguments"+marks);
    }
    C(double marks,int val){
        System.out.println("C with 2 Arguments"+marks+"-"+val);
    }

}
