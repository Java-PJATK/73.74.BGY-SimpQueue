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
