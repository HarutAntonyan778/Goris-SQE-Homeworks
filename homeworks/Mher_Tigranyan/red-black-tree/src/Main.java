public class Main {
    public static void main(String[] args) {
        RedBlackTree redBlackTree = new RedBlackTree();
        redBlackTree.add(4, "aaa");
        redBlackTree.add(6, "d");
        redBlackTree.add(1, "srwt");
        redBlackTree.add(3, "fdeg");
        redBlackTree.add(7, "rte");
        redBlackTree.add(2, "erte");
        redBlackTree.add(0, "erterte");
        redBlackTree.add(9, "erterter");
        System.out.print(redBlackTree.height());

    }
}
