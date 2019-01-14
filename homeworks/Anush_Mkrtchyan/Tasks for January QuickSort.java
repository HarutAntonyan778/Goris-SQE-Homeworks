public class QuickSort {
    private  int[]arr;

    public void sort(int[] arr) {

        if (arr == null || arr.length == 0 ) return;
        this.arr = arr;
        quickSort(0,arr.length-1 );
    }

    private void quickSort(int low, int hight) {
        int i=low;
        int j=hight;
        int pivot=arr[low+(hight-low)/2];
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(low, j);
        if (i < hight)
            quickSort(i, hight);
    }
}
