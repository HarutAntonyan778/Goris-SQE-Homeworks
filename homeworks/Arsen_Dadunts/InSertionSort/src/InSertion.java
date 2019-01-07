public class InSertion {
    public void sort(int a[]) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j >0; j--) {
                if (a[j]<a[j-1]){
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else break;
            }
        }
        for (int number:a
             ) {
            System.out.print(" "+number);
        }
    }
}

