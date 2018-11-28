public class Main {
    public static void main(String[] args) {
        LinkedList link = new LinkedList(10);
        link.addAtFirst(11);
        link.addAtFirst(12);
        link.addAtFirst(13);
        link.addAtEnd(8);
        link.addAtEnd(7);
        link.addAtIndex(4,9);
        link.addAtIndex(4,9);
        link.deleteAtIndex(4);
        link.printList();
    }
}
