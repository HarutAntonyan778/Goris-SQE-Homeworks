import java.util.Arrays;

public class MergeSort {
     void Sort(int [] a, int low, int high){
        if (high<=low)return;
        int mid=low+(high-low)/2;
        Sort(a,low,mid);
        Sort(a,mid+1,high);
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
}
