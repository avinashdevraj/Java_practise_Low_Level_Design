package org.example.AdderSubtractorSynchronisedKeyword;


public class Subtracror implements Runnable {
    Count count;

    Subtracror(Count count) {
        this.count = count;

    }

    @Override
    public void run() {
        for (int i = 1; i <= 100000; i++) {
            synchronized (count) {
                count.val -= i;

            }
        }
    }
}