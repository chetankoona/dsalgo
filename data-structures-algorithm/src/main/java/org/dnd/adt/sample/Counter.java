package org.dnd.adt.sample;

public class Counter {
    private String name;
    private int value;
    public Counter(String name) {
        this.name = name;
    }

    public void increment(){
        value++;
    }

    public void decrement(){
        value--;
    }

    public int getCurrentValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
