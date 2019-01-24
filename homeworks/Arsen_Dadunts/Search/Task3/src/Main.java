
public class Main {
    public static void main(String[] args) {
        int [] array1={4,3,2,7,98,65,43,21,1,2,0,54};
        int [] array2={5,32,23,13,38,63,4,13,41,23,10,52};
        int [] array3={2,25,21,33,28,35,15,43,13,13,178,152};
        findsmallestnumbers(array1);
        findsmallestnumbers(array2);
        findsmallestnumbers(array3);
    }
    public static void findsmallestnumbers(int arr []) {

        if (arr.length<2){
            System.out.println("The array have not enough element:");
            return;
        }
        if (arr.length==2){
            if (arr[0]>arr[1]) System.out.println("The first smallest number is: " + arr[1]);
            else System.out.println("The first smallest number is: " + arr[0]);
            System.out.println("The array have not second smallest element:");
            System.exit(0);
        }
        int min1 = arr[1];
        int min2 = arr[2];

        for (int i = 0; i <arr.length; i++) {
            if (min1>arr[i]) {
                min2 = min1;
                min1 = arr[i];
            }
            else if (arr[i] < min2 && arr[i] != min1)
                min2 = arr[i];
        }

        System.out.println("The first smallest number is: "  + min1 +"\t The second smallest number is: "+ min2);
    }
}
