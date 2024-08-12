package org.example.FunctionalInterface;

import java.util.*;

public class Cars {
    public static class car{
        String name;
        Integer price;
        Integer speed;

        car(String name,Integer price,Integer speed){
            this.name=name;
            this.price=price;
            this.speed=speed;
        }


    }
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,2,7,4,5,9);
        Collections.sort(list);
        System.out.println(list);

        car c1=new car("A",5,200);
        car c2=new car("B",8,350);
        car c3=new car("c",4,250);

        List<car> carList=Arrays.asList(c1,c2,c3);
        Comparator<car> comparator=(car1,car2)->{return car1.price-car2.price;};
        Collections.sort(carList,comparator);

        //OR

        Collections.sort(carList,(car1,car2)->{return car1.price-car2.price;});

        System.out.println(carList);



    }
}
