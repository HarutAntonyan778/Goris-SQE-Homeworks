package com.company;

public class Node {
        private Node nextNode;
        private int data;

        private Node(int val, Node next) {
            data = val;
            nextNode = next;
        }

        private void setData(int val) {
            this.data = val;
        }

        private int getData() {
            return this.data;
        }

        private void setNextNode(Node n) {
            this.nextNode = n;
        }

        private Node getNextNode() {
            return this.nextNode;
        }
    }

}
