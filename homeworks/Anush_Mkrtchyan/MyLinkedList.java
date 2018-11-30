package com.company;

import java.util.stream.Stream;

public class MyLinkedList {
    private Node firstNode;
    private Node currentNode;
    private static int size=0;
    public void add(String value) {
       if( size==0){
           firstNode = new Node(null,null,value);
           currentNode = firstNode;
       } else {
           currentNode.next = new Node(null,currentNode,value);
           currentNode = currentNode.next;
       }
        size++;
    }

    public int size(){
        return size;
    }
    public boolean remove(String value ){
        if (size == 0) return false;
        Node second = firstNode;
        for (int i = 0; i < size; i++) {
            if (second.value == value) {
                if (second.prev != null) {
                    second.prev.next = second.next;
                }
                if (second.next != null) {
                    second.next.prev = second.prev;
                }
                if (i == 0 && size > 1) {
                    firstNode = firstNode.next;
                }
                size--;
                return true;
            } else {
                second = second.next;
            }
        }
        return false;
    }
    public Node getValue( String value ){
        Node second= firstNode;
        for( int i =0; i<size; i++){
            if( second.value.equals(value) ){
                return  second;
            }
        }
        return  null;
    }
    public void addIndexValue (int index, String value)
    {
        Node current = firstNode;
        Node holder;
        for(int i=0; i < index-1 && current.next != null; i++)
        {
            current= current.next;
        }
        holder = current.next;
        current.next = new Node(value);
        current.next.next = holder;
        size++;
    }
    public void deleteIndexValue(int index)
    {
        Node current = firstNode;
        for(int i=0; i< index - 1 && current.next != null; i++)
        {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }
    public void print(){
        Node current=firstNode;
        while ( current.next != null ){
            System.out.println(current.value );
            current=current.next;
        }
        System.out.println(current.value);
    }

    public Node getNode(int index){
        Node second =firstNode;
        if( index>size || index< 0){

            System.out.println(" Out of Ex");
            return null;
        }else {
        for( int i=0 ; i<index; i++){
           second= second.next;
        }
        return second;
        }
    }
    public class Node {
        Node next;
        Node prev;
        String value;

        public Node(Node next, Node prev, String value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
        public  Node(String value){
            this.value=value;
        }
    }
}
