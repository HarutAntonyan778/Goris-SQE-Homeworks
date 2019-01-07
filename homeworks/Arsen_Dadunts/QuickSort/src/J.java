public class J {
    public  void quickSort (int[] list)
    {
        quickSort(list, 0, list.length - 1);
        for (int i = 0; i <list.length; i++) {
            System.out.print(" "+ list[i]);
        }
    }
    public static void quickSort (int[] list, int low, int high)
    {
        final int MOVING_LEFT = 0;
        final int MOVING_RIGHT = 1;
        if (low < high)
        {
            int left = low;
            int right = high;
            int currentDirection = MOVING_LEFT;
            int pivot = list[low];
            while (left < right)
            {
                if (currentDirection == MOVING_LEFT)
                {
                    while ((list[right] >= pivot) && (left < right))
                        right--;
                    list[left] = list[right];
                    currentDirection = MOVING_RIGHT;
                }
                if (currentDirection == MOVING_RIGHT)
                {
                    while ((list[left] <= pivot) && (left < right))
                        left++;
                    list[right] = list[left];
                    currentDirection = MOVING_LEFT;
                }
            }
            list[left] = pivot; // or list[right] = pivot, since left == right
            quickSort(list, low, left-1);
            quickSort(list, right+1, high);
        }

    }
}
