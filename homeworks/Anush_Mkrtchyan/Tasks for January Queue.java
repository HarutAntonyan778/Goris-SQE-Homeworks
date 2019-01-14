public class Queue {
    private int maxsize = 20;
    private String[] quArray = new String[maxsize];
    private int len = 0;

    public void push(String newElement) {
        if (len < quArray.length - 1) {
            quArray[len + 1] = newElement;
            len++;
            System.out.println("The string added");
        } else {
            System.out.println(" The stack is full");
        }
    }

    public void pop() {
        if (len >= 0) {
            String st[] = new String[maxsize];
            for (int i = 1; i <= len; i++)
                st[i - 1] = quArray[i];
            len--;
            quArray = st;
        } else {
            System.out.println(" the queue is empty");
        }
    }

    public String top() {
        System.out.println(" the top element is  " + quArray[0]);
        return quArray[0];
    }

    public void size() {
        if (len >= 0)
            System.out.println(len);
        else System.out.println(0);
    }

    public boolean isEmpty() {
        boolean b = false;
        if (len <= 0)
            b = true;
        System.out.println(b);
        return b;
    }

    public void clear() {

        for (int i = len; i >= 0; i--) {
            pop();
        }
        System.out.println(" The stack is empty ");
    }
}
