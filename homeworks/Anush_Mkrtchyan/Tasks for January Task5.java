public class Task5 {

    public void print(int low, int hight, int arr[]) {
        int temp = low;
        int t = hight - low;
        if (findLow(arr, low) && t > 0) {
            for (int i = 0; i <= t; i++) {
                if (!ok(temp, arr) && temp <= hight)
                    System.out.println(temp);
                temp++;
            }

        } else System.out.println("The range is not correct");
    }

    public boolean ok(int m, int arr[]) {
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == m) {
                b = true;
                break;
            }
        }
        return b;
    }

    public boolean findLow(int arr[], int k) {
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k || arr[i] > k) {
                b = true;
                break;
            }
        }
        return b;
    }
}
