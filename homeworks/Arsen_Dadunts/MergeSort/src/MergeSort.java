import java.util.Arrays;

public class MergeSort {
    void sort(int [] a, int low, int high){
        if (high<=low)return;
        int mid=low+(high-low)/2;
        sort(a,low,mid);
        sort(a,mid+1,high);
        int [] buffer= Arrays.copyOf(a,a.length);
        for (int i = low; i <high; i++)
            buffer[i]=a[i];
        int i=low, j=mid+1;
        for (int k = low; k <=high; k++) {
            if (i>mid){
                a[k]=buffer[j];
                j++;
            }
            else if (j>high){
                a[k]=buffer[i];
                i++;
            }
            else if (buffer[j]<buffer[i]){
                a[k]=buffer[j];
                j++;
            }
            else {
                a[k]=buffer[i];
                i++;
            }
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
