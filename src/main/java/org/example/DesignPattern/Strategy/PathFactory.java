package org.example.DesignPattern.Strategy;

public class PathFactory {
    public static PathCalculatorStrategy path(Enum mode){
        if(mode.equals(Mode.BIKE)) return new BikePathCalculator();
        if(mode.equals(Mode.CAR)) return new CarPathCalculator();
        if(mode.equals(Mode.WALK)) return new WalkPathCalculator();
        return null;
    }
}
