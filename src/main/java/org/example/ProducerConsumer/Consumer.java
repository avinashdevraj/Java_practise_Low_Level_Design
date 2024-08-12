package org.example.ProducerConsumer;

import java.util.Queue;

public class Consumer implements Runnable{
    private Queue<Object> store;
    private String name;
    int maxsize;
         Consumer(Queue<Object> store, int maxsize,String name){
             this.store=store;
             this.maxsize=maxsize;
             this.name=name;

         }
     @Override
    public void run() {
             while(true){
                 if(store.size()>0){
                     System.out.println("consumer"+this.name+"is consuming and store size is ="+store.size());
                     store.remove();
                     try {
                         Thread.sleep(3000);
                     } catch (InterruptedException e) {
                         throw new RuntimeException(e);
                     }

                 }
             }

    }
}
