package LabPrograms;

import java.util.Scanner;

public class Lab3_BubbleSort {
    Scanner sc = new Scanner(System.in);

    int[] inputArray() {

        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element " + (i + 1));
            input[i] = sc.nextInt();
        }
        return input;
    }

    void bubbleSort(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - 1; j++)
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
