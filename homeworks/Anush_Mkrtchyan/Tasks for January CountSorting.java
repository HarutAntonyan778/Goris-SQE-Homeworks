public class CountSorting {


    public  int [] countingSorting(int []arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0 ){
                System.out.println("The Counting Sorting isn't working");
                return arr;
            }
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > max && arr[i]>=0) {
                max = arr[i];
            }
        }
        int counta[] = new int[max + 1];
        for (int i = 0; i < arr.length; ++i) {
            int k = arr[i];
            counta[k] ++;
        }
        for (int i = 0; i < counta.length; i++) {
            for (int j = 0; j < counta[i]; j++) {
                System.out.println(i);
            }
        }
        return counta;
    }
}
