package org.example.Addersubtractorconcurrenct3;


import java.util.concurrent.locks.Lock;

public class Subtracror implements Runnable{
    Count count;

    Subtracror(Count count){
        this.count=count;

    }

    @Override
    public void run() {
        for(int i=1;i<=100000;i++){

            count.val-=i;

        }
    }
}