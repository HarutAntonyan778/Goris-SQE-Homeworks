package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyQueue q = new MyQueue();
        q.enqueue(1);
        q.enqueue(6);
        q.enqueue(5);
        q.enqueue(8);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(7);
        q.enqueue(1);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }
}

