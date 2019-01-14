import java.util.*;

public class QueueStack {
    public QueueStack(Stack<Integer> stack) {
        stack = queStack1;
    }

    static Stack<Integer> queStack1 = new Stack<Integer>();


    static void pushQueue(int x) {
        Stack<Integer> queStack2 = new Stack<Integer>();

        while (!queStack1.isEmpty()) {
            queStack2.push(queStack1.pop());
        }
        queStack1.push(x);

        // Push everything back
        while (!queStack2.isEmpty()) {
            queStack1.push(queStack2.pop());
        }

    }


}
