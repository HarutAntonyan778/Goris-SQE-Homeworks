public class Main {
    public static void main(String[] args) {
        int arr[] = {45, 56, 9, 8, 1, 3, 98};
        ArrayList arrayList = new ArrayList(arr);
        System.out.println(arrayList.find(3));
        arrayList.print();
        arrayList.delete(9);
        arrayList.print();
        arrayList.insert(5);
        arrayList.print();
        System.out.println(arrayList.readFromIndex(2));
    }
}
