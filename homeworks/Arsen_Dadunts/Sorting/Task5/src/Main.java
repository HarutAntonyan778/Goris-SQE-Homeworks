public class Main {
    public static void main(String[] args) {
        int [] array= {1, 14, 11, 51, 15};
        int [] array1={4,3,2,7,98,65,43,21,1,2,0,54};
        int [] array2={5,32,23,13,38,63,4,13,41,23,10,52};
        int [] array3={2,25,21,33,28,35,15,43,13,13,178,152};
        printmissingelements(array, 10, 15);
        printmissingelements(array1, 20,30);
        printmissingelements(array2, 15,19);
        printmissingelements(array3, 35,45);

    }

    public static void printmissingelements(int arr[], int low, int hight) {

        if (low > hight) return;

        int arr2[] = new int[hight - low];
        boolean list[] = new boolean[hight - low];

        for (int i = low, j = 0; i < hight; i++, j++) {
            arr2[j] = i;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] != i) list[j] = true;
                else {
                    list[j] = false;
                    break;
                }
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] == true)System.out.print(" " + arr2[i]);
        }
        System.out.println();
    }
}
