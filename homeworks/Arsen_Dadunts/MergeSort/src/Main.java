public class Main {
    public static void main(String[] args) {
        int [] a={21,78,65,123,24,456,14,59,123,456,74,153,489,53,1};
        MergeSort mergeSort=new MergeSort();
        mergeSort.Sort(a,0,a.length-1);
        for (int k = 0; k < a.length; k++) {
            System.out.print(" "+a[k]);
        }
    }
}
