public class Task3 {
    static void smallest2(int arr[]) {
        int first, second;
        if (arr.length < 2) {
            System.out.println(" Invalid input ");
            return;
        }
        first = Integer.MAX_VALUE;
        second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];

            } else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element");
        } else {
            System.out.println("the smallest element is " + first + " and secont smallest element is " + second);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 56, 99, 4, 3, 9};
        smallest2(arr);
    }
}
