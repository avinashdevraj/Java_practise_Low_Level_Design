package org.example.DesignPattern.Strategy;

public class BikePathCalculator implements PathCalculatorStrategy{

    @Override
    public void findPath(String src, String dest) {
        System.out.println("Bike wala");
    }
}
