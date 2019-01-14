package com.company;

public class Main {

    public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            System.out.println(ll.getSize());
            ll.add(8);
            System.out.println(ll.getSize());
            ll.add(17);
            ll.add(5);
            ll.add(10);
            System.out.println(ll.find(17).getData());
            ll.remove(5);
            System.out.println(ll.getSize());
            System.out.println(ll.find(5));
        }
    }
}
