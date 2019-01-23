import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(4);
        myStack.push(6);
        myStack.push(3);
        myStack.push(9);
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