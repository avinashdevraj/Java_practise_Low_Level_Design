package org.example.DesignPattern.Strategy;

public class CarPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String src, String dest) {
        System.out.println("Car wala");
    }
}
