package org.example.ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Queue<Object> store = new ConcurrentLinkedQueue<>();
        int maxsize = 6;
        Semaphore producersemaphore=new Semaphore(maxsize);
        Semaphore consumersemaphore=new Semaphore(0);
        Producer p1 = new Producer(store, maxsize,"p1",producersemaphore,consumersemaphore);
        Producer p2 = new Producer(store, maxsize,"p2",producersemaphore,consumersemaphore);
        Producer p3 = new Producer(store, maxsize,"p3",producersemaphore,consumersemaphore);
        Producer p4 = new Producer(store, maxsize,"p4",producersemaphore,consumersemaphore);
        Producer p5 = new Producer(store, maxsize,"p5",producersemaphore,consumersemaphore);
        Producer p6 = new Producer(store, maxsize,"p6",producersemaphore,consumersemaphore);

        Consumer c1 = new Consumer(store, maxsize,"c1",producersemaphore,consumersemaphore);
        Consumer c2 = new Consumer(store, maxsize,"c2",producersemaphore,consumersemaphore);
        Consumer c3 = new Consumer(store, maxsize,"c3",producersemaphore,consumersemaphore);
        Consumer c4 = new Consumer(store, maxsize,"c4",producersemaphore,consumersemaphore);
        Consumer c5 = new Consumer(store, maxsize,"c5",producersemaphore,consumersemaphore);
        Consumer c6 = new Consumer(store, maxsize,"c6",producersemaphore,consumersemaphore);


        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        Thread t5 = new Thread(p5);
        Thread t6 = new Thread(p6);


        Thread t7 = new Thread(c1);
        Thread t8 = new Thread(c2);
        Thread t9 = new Thread(c3);
        Thread t10 = new Thread(c4);
        Thread t11 = new Thread(c5);
        Thread t12 = new Thread(c6);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();



    }
}
