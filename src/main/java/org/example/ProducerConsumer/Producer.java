package org.example.ProducerConsumer;

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
            if(store.size()<maxsize){
                store.add(new Object());
                System.out.println("producer"+this.name+"is producing and store size is ="+store.size());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
