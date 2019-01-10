public class Main {
    public static void main(String[] args) {
        int arr[] = {45, 56, 9, 8, 1, 3, 98};
        ArrayList arrayList = new ArrayList(arr);
        System.out.println(arrayList.indexOf(3));
        arrayList.print();
        arrayList.remove(9);
        arrayList.print();
        arrayList.add(5);
        arrayList.print();
    }
}
