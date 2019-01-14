public class MyStack {
    int arr[] = new int[5];
    int len = 0;

    public void push(int a) {

        if (len == arr.length - 1) {
            int arr2[] = new int[arr.length + 5];
            for (int i = 0; i < arr.length; ++i) {
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[len++] = a;
    }

    public int pop() {
        if (len == 0) return 0;
        return arr[--len];
    }

    public int readtop() {
        System.out.println(arr[len - 1]);
        return arr[len - 1];
    }

    public int size() {
        System.out.println(len);
        return len;
    }

    public boolean isEmpty() {
        boolean b = false;
        if (len == 0)
            b = true;
        System.out.println(b);
        return b;
    }

    public int clear() {
        for (int i = len; i >= 0; i--) {
            pop();
        }
        System.out.println(" The stack is empty!!!!");
        return 0;
    }
}


