public class Main {
    public static void main(String[] args) {
        int[] arr = {16, 3, 5, 1, 13, 9, 7, 4};
        BubbleSort b = new BubbleSort();
        b.bubbleSort(arr);
        b.printArray(arr);

        CountSort c = new CountSort();
        c.counting_sort(arr);

    }
}
