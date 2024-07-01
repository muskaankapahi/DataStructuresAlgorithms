import java.util.*;

class MovingAverage {

    Queue<Integer> queue;
    int size;
    double sum;

    public MovingAverage(int size) {
        this.queue = new LinkedList<Integer>();
        this.size = size;
        this.sum = 0;
    }

    public double next(int val) {
        this.queue.offer(val);
        if (this.queue.size()>this.size){
            this.sum -= this.queue.poll();
        }
        this.sum = this.sum + val;
        return this.sum/this.queue.size();


    }
}

