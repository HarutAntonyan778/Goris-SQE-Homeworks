public class MyLinkedList {
    private Node firstNode;
    private Node currentNode;
    private static int size = 0;

    public void add(String value) {
        if (size == 0) {
            firstNode = new Node(null, null, value);
            currentNode = firstNode;
        } else {
            currentNode.next = new Node(null, currentNode, value);
            currentNode = currentNode.next;
        }
        size++;
    }

    public boolean insert(int index, String value) {
        Node newNode = new Node(value);
        Node second = firstNode;
        if (index < 0 || index > size) {
            System.out.println(" Error ");
            return false;
        } else {
            for (int i = 0; i < index; i++) {

                if (index == 0 && size > 1) {
                    newNode.prev = null;
                    newNode.next = firstNode;
                    firstNode = newNode;
                }
                if (index == size && i == size - 1) {
                    newNode.prev = second;
                    newNode.next = null;
                }
                if (index > 0 && index < size && i == index - 1) {
                    second.next.prev = newNode;
                    newNode.next=second.next;
                    second.next = newNode;
                    newNode.prev = second;

                }
                second = second.next;
            }
        }
        size++;
        return true;
    }


    public boolean delete(String value) {
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

    public boolean update(String oldvalue, String newvalue) {
        Node second = firstNode;
        for (int i = 0; i < size; i++) {
            if (second.value == oldvalue) {
                second.value = newvalue;
                return true;
            } else {
                second = second.next;
            }
        }
        return false;
    }

    public Node findAtIndex(int index) {
        Node second = firstNode;
        if (index > size || index < 0) {
            System.out.println(" Out of Ex");
            return null;
        } else {
            for (int i = 0; i < index; i++) {
                second = second.next;
            }
            return second;
        }
    }

    public void print() {
        Node current = firstNode;
        while (current.next != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);
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

    public Node(String value) {
        this.value = value;
    }
}
}
