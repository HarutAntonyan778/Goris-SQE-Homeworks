package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TestLinkedList link = new TestLinkedList(10);
        link.addAtFirst(7);
        link.addAtFirst(2);
        link.addAtFirst(9);
        link.addAtEnd(15);
        link.addAtEnd(4);
        link.addAtIndex(2, 8);
        link.addAtIndex(6, 7);
        link.deleteAtIndex(3);
        link.printList();
        System.out.println("size: " + TestLinkedList.getSize());
        TestLinkedList.Node r = link.read(3);
        System.out.println(r.getData());
        link.update(4, 15);
        link.printList();
        TestLinkedList.Node f = link.read(6);
        System.out.println("index of f is " + link.find(f));
    }
}

