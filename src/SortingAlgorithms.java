import java.util.Arrays;

/**
 * A class to implement all the sorting algorithms
 * so that we can test timing.
 *
 * @author: Nandhini Namasivayam
 * @version February 2025
 */
public class SortingAlgorithms {
    // Change this value to change testing size
    public static final int TEST_SIZE = 69000;

    // Change this value to change the range of numbers generated
    public static final int MAX_NUMBER_SIZE = 100;

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        // TODO: Implement bubble sort
        long startTime = System.currentTimeMillis();
        int temp;
        for(int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j< arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("BubbleSort Time: " + duration + "ms");
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        // TODO: Implement selection sort
        long startTime = System.currentTimeMillis();
        int temp;
        for(int i = 0; i < arr.length - 1; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j< arr.length; j++) {
                if(arr[j] < arr[lowestIndex]) {
                    lowestIndex = j;
                }
            }
            if (lowestIndex != i) {
                temp = arr[i];
                arr[i] = arr[lowestIndex];
                arr[lowestIndex] = temp;
            }
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("SelectionSort Time: " + duration + "ms");
    }

    // Merge Sort
    public static void mergeSort(int[] arr) {
        // TODO: Implement merge sort
    }

    private static void mergeSortHelper(int[] arr, int left, int right) {
        // TODO: Implement the recursive helper for merge sort
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        // TODO: Implement the merge step for merge sort
    }

    // Quick Sort
    public static void quickSort(int[] arr) {
        // TODO: Implement quick sort
    }

    private static void quickSortHelper(int[] arr, int low, int high) {
        // TODO: Implement the recursive helper for quick sort
    }

    private static int partition(int[] arr, int low, int high) {
        // TODO: Implement the partition step for quick sort
        return 0; // Placeholder
    }
}