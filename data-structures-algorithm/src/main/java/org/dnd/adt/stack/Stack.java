package org.dnd.adt.stack;

import java.util.Arrays;

public class Stack {
    private long[] arr;
    private int top;

    public Stack(int size) {
        this.arr = new long[size];
        this.top = -1;
    }

    public void push(long value){
        if (isNotFull()){
            arr[++top] = value;
        }
    }

    public long pop(){
        return isNotEmpty() ?arr[this.top--]:-1;
    }

    public long peek(){
        return isNotEmpty() ?arr[this.top]:-1;
    }

    private boolean isNotFull() {
        return top < arr.length - 1;
    }

    public boolean isNotEmpty() {
        return top >= 0;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
