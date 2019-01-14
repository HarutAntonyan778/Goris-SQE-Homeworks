public class MargeSorting {
    public static int a[];
    public  static void margeSort(int a[], int n){
        if( n<2){
            return;
        }
        int midl=n/2;
        int []l= new int[midl];
        int r []=new int[n-midl];
        for( int i=0; i<midl; i++){
            l[i]=a[i];
        }
        for( int i=midl; i<n; i++) {
            r[i - midl] = a[i];
        }
         margeSort(l,midl);
        margeSort(r,n-midl);
        marge( a,l,r,midl,n-midl);

    }
    public static void marge(int a[], int l[], int r[], int left, int right ){
        int i=0, j=0, k=0;
        while ( i<left && j< right ){
            if(l[i]<= r[j]){
            a[k++]=l[i++];
        }
        else {
            a[k++]=r[j++];
            }
        }
        while ( i<left){
            a[k++]=l[i++];
        }
        while ( j<right ){
            a[k++]=r[j++];
        }

    }

}
