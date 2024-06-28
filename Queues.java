//****************************
//Queue - FIFO
//A collection designed for holding elements prior to processing
//Linear data structure // add - enqueue[offer()], remove -dequeue [poll()], examine- element() or peek()
//Queue class extends collection class and is able to use methods like - isEmpty(), size() and contains()
//****************************


import java.util.Queue;
import java.util.LinkedList;

public class Queues{
    public static void queues_DS(String[] args){

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Chad"));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);


    }
}

//****************************
//Uses of queue
//Keyboard buffer (letter should print in the order they're typed)
//Printer queue
//Used in LinkedList, PriorityQueue and BFS
//****************************