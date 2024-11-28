package topic_6_sorting;
import java.util.Scanner;
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = in.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter Elements of the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }            

        System.out.println("Original array:");
        printArray(arr);

        long startTime = System.nanoTime();
        insertionSort(arr);
        
        long endTime = System.nanoTime();
           System.out.println("Sorted array:");
        printArray(arr);
        
        long duration = endTime - startTime;
        System.out.println("Sorting took " + duration + " nanoseconds ");

        in.close();
    }
}