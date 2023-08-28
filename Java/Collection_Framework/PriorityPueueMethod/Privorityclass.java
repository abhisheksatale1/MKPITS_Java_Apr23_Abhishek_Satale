package PriorityPueueMethod;

import java.util.PriorityQueue;

public class Privorityclass {
    public static void main(String args[]){
        PriorityQueue priorityQueue= new PriorityQueue();
        priorityQueue.offer(100);
        priorityQueue.offer(200);
        priorityQueue.offer(300);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.retainAll(priorityQueue));
    }
}
