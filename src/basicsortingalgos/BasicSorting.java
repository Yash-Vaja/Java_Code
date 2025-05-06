package basicsortingalgos;

import java.util.Arrays;
import java.util.Collections;

public class BasicSorting {


    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int[] counts = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
            arr[j++] = i;
            counts[i]--;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            int current = arr[i];
            int previous = i - 1;
            while (previous >= 0 && arr[previous] > current) {
                arr[previous + 1] = arr[previous];
                previous--;
            }

            // insertion
            arr[previous + 1] = current;
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9 , 7 ,8 ,6 , 4 ,5};
/*
        // Bubble sort
        bubbleSort(arr);
*/

/*
        // Selection sort
        selectionSort(arr);
*/

/*
        // Insertion sort
        insertionSort(arr);
*/

/*
        // Inbuilt sort
        Arrays.sort(arr);
*/

/*
        // inbuilt sort reverse
        Integer[] arr2 = { 9,7,8,6,4,5};
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));
*/

/*
        // Counting sort
        int[] arr3 = {1,4,1,3,2,4,7};
        countingSort(arr3);
        System.out.println(Arrays.toString(arr3));
*/
    }
}
