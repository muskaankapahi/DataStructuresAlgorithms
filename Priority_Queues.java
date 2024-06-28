//****************************
//Priority Queue - FIFO, a queue but we first sort the elements on the basis of priority
//we poll and serve the elements with the highes priority first
//Higher priority elements go before the lower priority elements
//Linear data structure // add - enqueue[offer()], remove -dequeue [poll()], examine- element() or peek()
// if values in double, then printed in ascending order
//if we want descending we add Collections.reverseOrder()
//****************************
import java.util.*;

public class Priority_Queues {
    public static void queues(String[] args){
//        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("A");
        queue.offer("C");
        queue.offer("D");
        queue.offer("F");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());

        }


    }
}