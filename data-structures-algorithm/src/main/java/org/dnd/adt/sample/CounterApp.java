package org.dnd.adt.sample;

import org.dnd.adt.sample.Counter;

public class CounterApp {
    public static void main(String[] args) {
        Counter counter = new Counter("MyCounter");
        counter.increment();
        counter.increment();
        counter.decrement();
        System.out.println("Counter = "+counter.getCurrentValue());
        counter.toString();
    }
}
