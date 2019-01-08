public class Task5 {
    public static void main(String[] args) {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("First repeating integer is " + arr[i]);
                    return;
                }
            }
        }
        System.out.println("No repeating integer found");
    }
}
