
public class MyStack {
    int[] arr = new int[10];
    char p;
    int lenght = 0;
    char expect;
    boolean result = true;

    void push(int a) {
        if (lenght == arr.length) {
            int[] secondarr = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                secondarr[i] = arr[i];
            }
            arr = secondarr;
        }
        arr[lenght++] = a;
    }

    char pop() {
        p = (char) arr[lenght - 1];
        arr[lenght - 1] = arr[lenght];
        lenght--;
        return p;
    }

    boolean chack(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == '{') || (str.charAt(i) == '[') || (str.charAt(i) == '(' )) {
                push(str.charAt(i));
            }
            if (str.charAt(i) == '}') {
                if (lenght == 0){
                    return false;
                }
                expect = '{';
                if (pop() != expect) {
                    result = false;
                }
            }
            if (str.charAt(i) == ']') {
                if (lenght == 0){
                    return false;
                }
                expect = '[';
                if (pop() != expect) {
                    result = false;
                }
            }
            if (str.charAt(i) == ')') {
                if (lenght == 0){
                    return false;
                }
                expect = '(';
                if (pop() != expect) {
                    result = false;
                }
            }
        }
        if (lenght != 0) {
            result = false;
        }
        return result;
    }
}