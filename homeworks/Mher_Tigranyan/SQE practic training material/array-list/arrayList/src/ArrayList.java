public class ArrayList {
    private int[] arr;
    private int size;

    public ArrayList(int[] ar) {
        this.arr = ar;
        this.size = ar.length;
    }

    int find(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    boolean delete(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                --size;
                for (; i < size; ++i) {
                    arr[i] = arr[i + 1];
                }
                return true;
            }
        }
        return false;
    }

    void print() {
        for (int i = 0; i < size; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void insert(int a) {
        if (size == arr.length) {
            int[] secondArray = new int[arr.length + 5];
            for (int i = 0; i < arr.length; i++) {
                secondArray[i] = arr[i];
            }
            arr = secondArray;

        }
        arr[size++] = a;
    }

    public int readFromIndex(int x){
        return arr[x];
    }

    public void updateAtIndex(int val, int index){
        arr[index] = val;
    }
}
