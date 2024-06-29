# DataStructuresAlgorithms
Data Strcutures and Algorithms in Java

1. FIFO DS
In a FIFO data structure, the first element added to the queue will be processed first.

The queue is a typical FIFO data stucture. The insert operation is also called enqueue and the new element is always added at the end of the queue. The delete operation is called dequeue. You are only allowed to remove the first element.

2. Circular Queue-
In a circular queue, we use an array and two pointers, head and tail. head indicates the start position of the queue while tail indicates the ending position of the queue.


Important things to remember-
1. to prevent overflow in an array-

index ++;
index = index % array.length;

//used in circular queue when enqueue is performed
