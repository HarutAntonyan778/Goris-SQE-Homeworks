package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TestQueue myQueue = new TestQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(5);
        myQueue.push(-1);
        System.out.println(Arrays.toString(myQueue.arr));
        System.out.println(myQueue.pop());
        System.out.println(Arrays.toString(myQueue.arr));
        System.out.println(myQueue.top());
        System.out.println(myQueue.size());
        System.out.println(myQueue.isEmpty());
        myQueue.clear();
        System.out.println(Arrays.toString(myQueue.arr));
        System.out.println(myQueue.isEmpty());
    }
}

