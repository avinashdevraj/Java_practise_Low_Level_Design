package org.example.executors;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
//        for(int i=1;i<=100;i++){
//            NumberPrinter n=new NumberPrinter(i);
//            Thread t=new Thread(n);
//            t.start();
//        }
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        //Executor executor=Executors.newFixedThreadPool(10);
        for(int i=1;i<=100;i++){
            NumberPrinter n=new NumberPrinter(i);
            executorService.submit(n);
            //executor.execute(n);


        }
        executorService.shutdown();
    }
}
