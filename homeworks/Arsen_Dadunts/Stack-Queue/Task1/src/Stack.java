public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int m) {
        this.maxSize = m;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int element){
        stackArray[++top]=element;
    }

    public int pop(){
        return stackArray[top--];
    }

    public void top(){
        System.out.println(stackArray[top]);
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public void size(){
        System.out.println(top+1);
    }

    public void clear(){
        for (int i = 0; i <=top+1; i++) {
            pop();
        }
    }
}
