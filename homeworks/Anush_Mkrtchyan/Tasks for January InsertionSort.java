public class InsertionSort {
    public int[] insertionSort( int []a){
        int temp;
        for( int i=1 ; i<a.length; i++){
            for( int j=i; j>0; j--){
                if( a[j]< a[j-1]){
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        return a;
    }
}
