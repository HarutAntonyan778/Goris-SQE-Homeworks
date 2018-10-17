//check the correctness characters of the text
public class Main {
    public static void main(String[] args) {
        String str = "{{hello(how)are[you]}}{}";
        MyStack myStack = new MyStack();
        System.out.println(myStack.chack(str));

    }
}
