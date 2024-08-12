package org.example.NumberPrinter1to100;

public class NumberPrinter implements Runnable{
        int number;
        public NumberPrinter(int number)
        {
            this.number=number;
        }


    @Override
    public void  run(){
        System.out.println(number+" Thread is = "+Thread.currentThread().getName());
    }
}
