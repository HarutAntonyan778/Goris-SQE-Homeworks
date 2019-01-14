package com.company;

public class Mergesort {
    public static void merge(int data[], int left, int right, int middle) {
        int first_data = middle - left + 1;
        int second_data = right - middle;

        int a = 0, b = 0, c = left;
        int Left[] = new int[first_data];
        int Right[] = new int[second_data];

        for (int x = 0; x < first_data; x++) {
            Left[x] = data[left + x];
        }
        for (int y = 0; y < second_data; y++) {
            Right[y] = data[middle + 1 + y];
        }

        while (a < first_data && b < second_data) {
            if (Left[a] < Right[b]) {
                data[c] = Left[a];
                a++;
                c++;
            } else {
                data[c] = Right[b];
                b++;
                c++;
            }
        }

        while (a < first_data) {
            data[c] = Left[a];
            a++;
            c++;
        }

        while (b < second_data) {
            data[c] = Right[b];
            b++;
            c++;
        }
    }

    public static void MergeSort(int data[], int start, int end) {

        if (start < end) {
            int middle = (end + start) / 2;
            MergeSort(data, start, middle);
            MergeSort(data, middle + 1, end);
            merge(data, start, end, middle);
        }
    }
}
// O(nlogn)/2 himqov/
