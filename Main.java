// BGY-SimpQueue/Main.java
// git clone https://github.com/Java-PJATK/BGY-SimpQueue.git

public class Main {
    public static void main(String[] args) {
        MyQueue qS = new MyQueue();
        for (double d = 0.5; d < 5; d += 1)
            qS.enqueue("" + d);
        while (!qS.empty())
            System.out.print(qS.dequeue() + " ");
        System.out.println();
    }
}

/*
 * Page 113/114
 * 12.3 Queues
 * A queue is similar to a stack, but with the reversed order of “pops.” Instead
 * of popping the most recently pushed element, we dequeue the “oldest” element.
 * This concept is known as FIFO (first in, first out). For instance, if we
 * enqueue elements A, B, and C in that order, three consecutive dequeues will
 * yield A, B, and finally C.
 * 
 * A straightforward implementation of a queue is based on a singly linked list.
 * We always add elements at the end and remove them from the beginning. To
 * achieve this efficiently, we maintain a reference to the last element
 * (referred to as the tail).
 * 
 * Let’s consider an example. The Node class is now a nested class within the
 * MyQueue class. It is declared as a static and private class, making it
 * invisible to the user but usable within the enclosing MyQueue class (similar
 * to previous examples).
 */
