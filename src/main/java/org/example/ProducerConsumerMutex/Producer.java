package org.example.ProducerConsumerMutex;

import java.util.Queue;

public class Producer implements Runnable{
    private Queue<Object> store;
    private String name;
    int maxsize;
    public Producer(Queue<Object> store, int maxsize,String name) {
        this.store=store;
        this.maxsize=maxsize;
        this.name=name;
    }

    @Override
    public void run() {
        while(true){
            synchronized (store){
                if(store.size()<maxsize){

                    System.out.println("producer "+this.name+" is producing and store size is ="+store.size());
                    store.add(new Object());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }


    }
}
