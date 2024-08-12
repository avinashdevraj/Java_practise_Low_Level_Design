package org.example.DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance=null;
    Flipkart(){

    }
    public static Flipkart getInstance(){
        if(instance==null){
            instance= new Flipkart();
        }
        return instance;
    }
    static List<OnOrderPlaced> list=new ArrayList<>();
    public static void register(OnOrderPlaced onOrderPlaced){
        list.add(onOrderPlaced);
    }
    public void deRegister(OnOrderPlaced onOrderPlaced){
        list.remove(onOrderPlaced);
    }
    public void OnOrder() {
         for (OnOrderPlaced oop : list) {
            oop.onOrderPlace();
         }
    }


}
