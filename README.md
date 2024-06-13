### 12.3 Queues

A queue operates on a FIFO (First In, First Out) principle, where elements are dequeued in the same order they were enqueued. Below is a simple implementation using a singly linked list, where elements are added at the end and removed from the beginning.

#### Listing 73: BGY-SimpQueue/MyQueue.java

```java
public class MyQueue {
    // nested class
    private static class Node {
        String data;
        Node next = null;
        
        Node(String d) { 
            data = d; 
        }
    }

    private Node head, tail;

    public MyQueue() {
        head = tail = null;
    }

    public void enqueue(String s) {
        if (head == null)
            head = tail = new Node(s);
        else
            tail = tail.next = new Node(s);
    }

    public String dequeue() {
        String s = head.data;
        if ((head = head.next) == null) 
            tail = null;
        return s;
    }

    public boolean empty() {
        return head == null;
    }
}
```

In `Main`, we test our queue:

#### Listing 74: BGY-SimpQueue/Main.java

```java
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
```

When executed, the program prints:
```
0.5 1.5 2.5 3.5 4.5
```

This confirms that elements are dequeued in the same order they were enqueued.

### Notes


classDiagram

    class MyQueue {
        -Node head
        -Node tail
        +MyQueue()
        +enqueue(String s) void
        +dequeue() String
        +empty() boolean
    }

    class Node {
        +String data
        +Node next
        +Node(String d)
    }

    class Main {
        +main(String[] args) void
    }

    MyQueue o-- Node
    Main ..> MyQueue : uses
