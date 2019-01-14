package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
            int arr[] = {10,15,-1,3,5,78,6};
            TestDynamicArray arrayList = new TestDynamicArray(arr);
            System.out.println(arrayList.find(6));
            arrayList.print();
            arrayList.delete(6);
            arrayList.print();
            arrayList.insert(18);
            arrayList.print();
            System.out.println(arrayList.readFromIndex(3));
        }
    }

