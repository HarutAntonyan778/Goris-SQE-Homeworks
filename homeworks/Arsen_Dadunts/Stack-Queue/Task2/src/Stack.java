public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;


    public Stack() {
        this.maxSize = 100;
        stackArray = new char[maxSize];
        top= -1;
    }

    private void push(char element) {
        stackArray[++top] = element;
    }


    private char pop() {
        return stackArray[top--];
    }

    private boolean isEmpty() {

        return (top == -1);
    }

    public int isValid(String a) {
        if (a.length() % 2 != 0) {

            return 0;
        } else if (a.length() == 0) {

            return 1;
        } else {

            char c[] = a.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
                    push(c[i]);
                } else {
                    if (isEmpty()) {
                        return 0;
                        //break;
                    } else {

                        char cc = c[i];
                        if (cc == ')' && stackArray[top]== '(') {
                            pop();
                        } else if (cc == ']' && stackArray[top] == '[') {

                            pop();
                        } else if (cc == '}' && stackArray[top] == '{') {
                            pop();
                        }
                    }
                }

            }
            if (isEmpty()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
