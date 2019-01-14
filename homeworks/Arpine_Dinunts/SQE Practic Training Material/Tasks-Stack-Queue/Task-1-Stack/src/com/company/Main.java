package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TestStack myStack = new TestStack();
        myStack.push(5);
        myStack.push(-1);
        myStack.push(2);
        myStack.push(7);
        myStack.push(2);
        System.out.println(Arrays.toString(myStack.arr));
        System.out.println(myStack.pop());
        System.out.println(Arrays.toString(myStack.arr));
        System.out.println(myStack.top());
        System.out.println(myStack.size());
        System.out.println(myStack.isEmpty());
        myStack.clear();
        System.out.println(Arrays.toString(myStack.arr));
    }
}

