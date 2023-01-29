package org.dnd.adt.queue;

public class Queue {

    private long[] arr;
    private int first;
    private int last;
    private int size;
    private int count;

    public Queue(int size) {
        this.arr = new long[size];
        this.size = size;
        this.count = 0;
        first = 0;
        last = -1;
    }

    public void insert(long value){
        if (count<size){
            if (last==size-1){
                last = -1;
            }
            last++;
            arr[last] = value;
            count++;
        }else {
            System.out.println("Cannot insert, reached max size.");
        }
    }

    public long remove(){
        if (count>0){
            long value = arr[first];
            if (first==size-1){
                first = 0;
            }else {
                first++;
            }
            count--;
            return value;
        }else {
            System.out.println("Queue is empty.");
            return -1;
        }
    }
}
