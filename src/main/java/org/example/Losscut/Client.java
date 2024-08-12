package org.example.Losscut;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.example.Inheritance.A;

public class Client {
    public static void main(String[] args) {
        DecimalFormat decfor = new DecimalFormat("0.00");
        Match m1=new Match(10000, "A");
        System.out.println("Book on another team at rate >= "+ decfor.format(m1.getrate(5000))+" for profit of 5000 risk free");
    }
}
