package org.example.Addersubtractorconcurrenct3;

public class Adder implements Runnable{
    Count count;
    Adder(Count count){
        this.count=count;
    }
    @Override
    public void run() {
       for(int i=1;i<=100000;i++){
           count.val+=i;
       }
    }
}
