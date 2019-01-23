import java.util.Scanner;

public class Array {
    private int size=0;
    private int array[]=new int[10];

    public void insert(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value.");
        int insertedvalue=scanner.nextInt();
        if (size==array.length-1){
            int array2 [] =new int[array.length+1];
            for (int i = 0; i <array.length; i++) {
                if (i==array.length-1){
                    array2[i]=insertedvalue;
                }
                array2[i]=array[i];
            }
            array=array2;
        }
        else {
            array[size]=insertedvalue;
            size++;
        }

    }

    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index.");
        int index = scanner.nextInt();
        if (index > array.length - 1) {
            System.out.println("Incorrect index.Please try again:");
            update();
        }
        int updatedvalue=scanner.nextInt();
        array[index]=updatedvalue;
    }

    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index.");
        int index = scanner.nextInt();
        if (index > array.length - 1) {
            System.out.println("Incorrect index.Please try again:");
            delete();
        }
            for (int i = index; i < array.length-1; i++) {
             array[i]=array[i+1];
        }
            size--;
    }

    public void print(){
        for (int i = 0; i <size; i++) {
            System.out.print(" "+array[i]);
        }
    }

    public void read(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the index.");
        int index=scanner.nextInt();
        if (index>array.length-1){
            System.out.println("Incorrect index.Please try again:");
            read();
        }
        System.out.println(array[index]);
    }

    public void find(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value.");
        int element=scanner.nextInt();
        for (int i = 0; i <array.length; i++) {
            if (element==array[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
