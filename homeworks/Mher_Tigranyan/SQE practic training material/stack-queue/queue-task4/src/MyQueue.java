public class MyQueue {
    MyStack s1 = new MyStack();
    MyStack s2 = new MyStack();
    private int size;

    public void enqueue(int e) {
        s1.push(e);
    }

    public int dequeue() {
        // fill out all the Input if output stack is empty
        if(s2.isEmpty())
            while(!s1.isEmpty())
                s2.push(s1.pop());

        int temp = 0;
        if(!s2.isEmpty()) {
            temp = s2.pop();
            size--;
        }

        return temp;
    }
}
