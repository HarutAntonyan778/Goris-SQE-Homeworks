import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(4);
        myQueue.push(6);
        myQueue.push(3);
        myQueue.push(9);
        myQueue.push(2);
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