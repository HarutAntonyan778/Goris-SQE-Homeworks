public class Main {
    public static void main(String[] args) {
        String str = "([({})()])";

        boolean result;
        char[] ch = str.toCharArray();
        result = checkOrder(ch);

        if (result == true){
            System.out.println("brackets have the correct order");
        }else {
            System.out.println("brackets have wrong order");
        }
    }

    static boolean checkOrder(char[] ch){
        MyStack myStack = new MyStack();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '{' || ch[i] == '(' || ch[i] == '['){
                myStack.push(ch[i]);
            }
            if (ch[i] == '}'){
                if (myStack.isEmpty()){
                    return false;
                }
                if (myStack.top() != '{'){
                    return false;
                }
                    myStack.pop();
            }
            if (ch[i] == ')'){
                if (myStack.isEmpty()){
                    return false;
                }
                if (myStack.top() != '('){
                    return false;
                }
                    myStack.pop();
            }
            if (ch[i] == ']'){
                if (myStack.isEmpty()){
                    return false;
                }
                if (myStack.top() != '['){
                    return false;
                }
                    myStack.pop();
            }
        }
        if (myStack.isEmpty()){
            return true;
        }
        return false;
    }
}