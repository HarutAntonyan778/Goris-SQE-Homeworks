public class Main {
    public static void main(String[] args) {
        int[] array1 = {6, 25, 4, 7, 6, 98, 89, 3, 4, 456, 123};
        int [] array2={5,32,23,13,38,63,4,13,41,23,10,52};
        int [] array3={2,25,21,33,28,35,15,43,13,13,178,152};
        repeatingelements(array1);
        repeatingelements(array2);
        repeatingelements(array3);


    }
    public static void repeatingelements(int arr []){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("The index of first element that occurs more than once: " + i + "\nThe second element under the index: " + j);
                    return;
                }
            }
        }
        System.out.println();
    }
}
