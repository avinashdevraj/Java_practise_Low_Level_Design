package org.example.ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Object> store;
    private String name;
    int maxsize;
    Semaphore producersemaphore;
    Semaphore consumersemaphore;
         Consumer(Queue<Object> store, int maxsize, String name, Semaphore producersemaphore, Semaphore consumersemaphore){
             this.store=store;
             this.maxsize=maxsize;
             this.name=name;
             this.producersemaphore=producersemaphore;
             this.consumersemaphore=consumersemaphore;

         }
     @Override
    public void run() {
             while(true){
                 try {
                     consumersemaphore.acquire();
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
//                 if(store.size()>0){
//                     System.out.println("consumer"+this.name+"is consuming and store size is ="+store.size());
//                     store.remove();
//                     try {
//                         Thread.sleep(3000);
//                     } catch (InterruptedException e) {
//                         throw new RuntimeException(e);
//                     }
//
//                 }
                 producersemaphore.release();
             }

    }
}
