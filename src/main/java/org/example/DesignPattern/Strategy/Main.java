package org.example.DesignPattern.Strategy;

public class Main {
    public static void main(String[] args) {
        Map map=new Map();
        map.pathcalculate("A","B",Mode.BIKE);
    }
}
