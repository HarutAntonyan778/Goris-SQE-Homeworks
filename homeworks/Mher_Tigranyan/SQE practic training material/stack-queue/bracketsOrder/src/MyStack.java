public class MyStack {
    char[] arr =new char[10];
    char p;
    int lenght = 0;
    void push(char a){
        if (lenght==arr.length){
            char[] secondarr = new char[arr.length+1];
            for (int i = 0; i < arr.length; i++) {
                secondarr[i] = arr[i];
            }
            arr = secondarr;
        }
        arr[lenght++] = a;
    }
    char pop(){
        p = arr[lenght-1];
        arr[lenght-1] = arr[lenght];
        lenght--;
        return p;
    }

    char top(){
        return arr[lenght-1];
    }

    int size(){
        return lenght;
    }

    boolean isEmpty(){
        if (lenght == 0){
            return true;
        }
        return false;
    }
    void clear(){
        for (int i = 0; i < lenght; i++) {
            arr[i] = 0;
        }
        lenght = 0;
    }
}