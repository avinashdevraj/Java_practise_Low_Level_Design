package org.example.ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Queue<Object> store;
    private String name;
    int maxsize;
    Semaphore producersemaphore;
    Semaphore consumersemaphore;
    public Producer(Queue<Object> store, int maxsize, String name, Semaphore producersemaphore, Semaphore consumersemaphore) {
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
                producersemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            if(store.size()<maxsize){
//                store.add(new Object());
//                System.out.println("producer"+this.name+"is producing and store size is ="+store.size());
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
            consumersemaphore.release();
        }


    }
}
