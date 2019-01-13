public class Main {
    public static void main(String[] args) {
        int arr[] = {0, 1, 15, 25, 6, 7, 30, 40, 50};
        unsorted(arr);
    }

    public static void unsorted(int arr[]) {
        int start=0;
        int end= arr.length-1;
        int i, max, min;

        for (start = 0; start< arr.length-1; start++) {
            if (arr[start] > arr[start + 1]) break;
        }
        if (start == arr.length-1) {
            System.out.println("The array is sorted:");
            return;
        }

        for (end = arr.length-1; end > 0; end--) {
            if (arr[end] < arr[end - 1])break;
        }

        max = arr[start];
        min = arr[start];
        for (i = start+1; i <= end; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        for (i = 0; i < start; i++) {
            if (arr[i] > min) {
                start = i;
                break;
            }
        }
        for (i = arr.length-1; i >= end+1; i--) {
            if (arr[i] < max) {
                end = i;
                break;
            }
        }


        System.out.println(" The minimum length subarray: " + start+" - "+end);
        return;
    }

}

