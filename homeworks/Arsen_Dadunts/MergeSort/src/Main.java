public class Main {
    public static void main(String[] args) {
        MergeSort mergeSort =new MergeSort();
        int array [] ={15,26,7,8,6,4,2,6,3,4,5,1,9,12,10};
        int [] array1={4,3,2,7,98,65,43,21,1,2,0,54};
        int [] array2={5,32,23,13,38,63,4,13,41,23,10,52};
        int [] array3={2,25,21,33,28,35,15,43,13,13,178,152};
        mergeSort.sort(array, 0, array.length-1);
        mergeSort.sort(array1, 0,array1.length-1);
        mergeSort.sort(array2, 2 ,7);
        mergeSort.sort(array3, 1, 6);
        mergeSort.printArray(array);
        mergeSort.printArray(array1);
        mergeSort.printArray(array2);
        mergeSort.printArray(array3);
    }
}
