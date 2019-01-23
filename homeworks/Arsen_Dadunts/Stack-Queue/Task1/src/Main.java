public class Main {

    public static void main(String[] args) {
        Stack mStack = new Stack(10);

        mStack.push(279);
        mStack.push(549);
        mStack.push(135);
        mStack.push(284);
        mStack.pop();
        mStack.size();
        mStack.top();


        System.out.print("Stack: ");
        while (!mStack.isEmpty()) {
            int value = mStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
        mStack.isEmpty();
        mStack.clear();

    }
}
