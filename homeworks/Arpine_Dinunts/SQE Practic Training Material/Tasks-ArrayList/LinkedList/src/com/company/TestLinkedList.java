package com.company;

public class TestLinkedList {
    private static Node first;
    private static int numNodes;

    public TestLinkedList(Object value) {
        first = new Node(value);
        numNodes++;
    }

    public void addAtFirst(Object value) {
        Node temp = first;
        first = new Node(value);
        first.next = temp;
        numNodes++;
    }

    public void addAtEnd(Object value) {
        Node temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(value);
        numNodes++;
    }

    public void addAtIndex(int index, Object value) {
        Node temp = first;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(value);
        temp.next.next = holder;
        numNodes++;
    }

    public void update(int index, Object value) {
        Node temp = first;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next.data = new Node(value).data;
    }

    public void deleteAtIndex(int index) {
        Node temp = first;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public static int find(Node n) {
        Node t = first;
        int index = 0;
        while (t != n) {
            index++;
            t = t.next;
        }
        return index;
    }

    public static Node read(int index) {
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int getSize() {
        return numNodes;
    }

    class Node {
        private Node next;
        private Object data;

        public Node(Object value) {
            data = value;
        }

        public Object getData() {
            return data;
        }
    }
}
