package org.example.DesignPattern.Strategy;

public class Map {
    PathCalculatorStrategy pathCalculatorStrategy;
    public void pathcalculate(String src,String dest,Enum mode){
        pathCalculatorStrategy= PathFactory.path(mode);
        pathCalculatorStrategy.findPath(src,dest);
    }
}
