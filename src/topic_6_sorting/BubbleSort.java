package topic_6_sorting;
import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = in.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
             System.out.println("Original array:");
        printArray(arr);
        
        long startTime = System.nanoTime();
        bubbleSort (arr);
        
        long endTime = System.nanoTime();
        
        System.out.println("Sorted array");
        printArray(arr);
        
       long duration = endTime - startTime;
       System.out.println("Sorting took " + duration + " nanoseconds. ");
      
       in.close();
    }
}
