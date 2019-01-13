public class Main {
    public static void main(String[] args) {
        int a []= {10, 5, 6, 3, 2, 20, 100, 80};
        wavelikearray(a);
    }
    public static void wavelikearray(int arr[]){
        for (int i = 0; i <arr.length-2; i++) {
            if (arr[i]>arr[i+1] && arr[i]>arr[i+2]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for (int output:arr) {
            System.out.print(" "+output);
        }
    }
}
