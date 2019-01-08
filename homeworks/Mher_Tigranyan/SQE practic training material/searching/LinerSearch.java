
public class LinerSearch {
    public static void search(int arr[], int a) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == a) {
                System.out.print("index of element " + a);
                return;
            }
        }
        System.out.print("Element is not found");
    }

    public static void main(String args[])
    {
        int arr[] = { 1, 3, 6, 10, 30, 55 };
        int a = 6;
        search(arr, a);

    }
}
