package org.dnd.adt.queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        System.out.println(queue.remove());
        queue.insert(10);
        queue.insert(11);
        queue.insert(12);
        System.out.println(queue.remove());
        queue.insert(13);
        queue.insert(14);
        queue.insert(15);
        queue.insert(16);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
