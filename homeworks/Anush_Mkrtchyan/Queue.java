public class Queue {
    private static final int defaultSize = 10;
    private String[] quArray= new String [defaultSize];
    private int len = 0;

    public void push(String newElement) {
        if (len == quArray.length - 1) {
            String arr2[] = new String [quArray.length + 5];
            for (int i = 0; i < quArray.length; ++i) {
                arr2[i] = quArray [i];
            }
            quArray = arr2;
        }
        quArray[len ] = newElement;
        len++;
        System.out.println("The string added");
    }

    public String pop() {
        if (len == 0)
            return null ;
        return quArray [--len];
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
