public class Main {
    public static void main(String args[])
    {
        System.out.println("A :");
        System.out.println("Queue Testing:");
        FIFOQUEUE queue = new FIFOQUEUE(10);
        queue.enqueue("test");
        queue.enqueue("wow");
        System.out.println(queue.getQueue()[0]);
        System.out.println(queue.getQueue()[1]);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("Stack Testing:");
        LIFOQUEUE stack = new LIFOQUEUE(10);
        stack.enqueue("test");
        stack.enqueue("wow");
        stack.enqueue("test123");
        System.out.println(stack.getQueue()[0]);
        System.out.println(stack.getQueue()[1]);
        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        System.out.println("");
        System.out.println("B :");
        System.out.println("Manually done, no array functions were used.");
        System.out.println("");
        System.out.println("C :");
        System.out.println("I would make the interface more abstract as there as similar components to both the FIFO and LIFO queues by including the attributes like count and max.");
        System.out.println("Secondly, I would increase the error handling part of the enqueue and dequeue to accept mistakes like enqueuing when the queue is full or dequeuing when the queue is empty etc...");
    }
}