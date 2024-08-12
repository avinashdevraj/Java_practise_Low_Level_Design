package org.example.AdderSubtractorLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count=new Count();
        Lock lock=new ReentrantLock();
        Adder adder=new Adder(count,lock);
        Subtracror subtracror=new Subtracror(count,lock);

        Thread t1=new Thread(adder);
        Thread t2=new Thread(subtracror);

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.join();

        System.out.println(count.val);

    }
}
