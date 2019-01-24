public class Main {
    public static void main(String[] args) {
        int arr[] = {0, 1, 15, 25, 6, 7, 30, 40, 50};
        int [] array1={4,3,2,7,98,65,43,21,1,2,0,54};
        int [] array2={5,32,23,13,38,63,4,13,41,23,10,52};
        int [] array3={2,25,21,33,28,35,15,43,13,13,178,152};
        unsorted(arr);
        unsorted(array1);
        unsorted(array2);
        unsorted(array3);
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
