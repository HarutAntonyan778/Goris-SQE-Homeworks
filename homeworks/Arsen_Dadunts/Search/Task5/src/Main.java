public class Main {
    public static void main(String[] args) {
        int [] arr = {6, 25, 4, 7, 6, 98 , 89, 3, 4, 456, 123};

        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("The index of first element that occurs more than once: " + i + "\nThe second element under the index: " + j);
                    System.exit(0);
                }
            }

        }
    }
}
