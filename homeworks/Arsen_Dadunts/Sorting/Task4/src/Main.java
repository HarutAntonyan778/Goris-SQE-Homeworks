public class Main {
    public static void main(String[] args) {
        int a []= {10, 5, 6, 3, 2, 20, 100, 80};
        int [] array1={4,3,2,7,98,65,43,21,1,2,0,54};
        int [] array2={5,32,23,13,38,63,4,13,41,23,10,52};
        int [] array3={2,25,21,33,28,35,15,43,13,13,178,152};
        wavelikearray(a);
        wavelikearray(array1);
        wavelikearray(array2);
        wavelikearray(array3);
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
        System.out.println();
    }
}
