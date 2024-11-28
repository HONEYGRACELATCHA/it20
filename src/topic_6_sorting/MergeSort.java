package topic_6_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    // MergeSort function
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the two sorted arrays into arr[]
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    // Main function where we accept user input and use mergeSort
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        // Ask the user to input the elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        mergeSort(arr);

        long startTime = System.nanoTime();
        mergeSort(arr);
        long endTime = System.nanoTime();

        System.out.println("Sorted array: " + Arrays.toString(arr));

        long duration = endTime - startTime;
        System.out.println("Sorting took: " + duration + " nanoseconds ");
        in.close();
    }
}
