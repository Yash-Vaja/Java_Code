package array;

import java.util.Scanner;

public class Arrays {

    public static void printSubArrays(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length; j++) {
                System.out.print("{");
                for (int k=i; k<=j; k++) {
                    System.out.print(arr[k]+",");
                }
                System.out.println("}");
            }
        }
    }

    public static void pairsInArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }

    public static void printAnArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverseAnArray(int[] arr) {
        int first = 0;
        int last = arr.length-1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }

        printAnArray(arr);
    }

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int last = arr.length-1;


        while (start <= last) {
            int mid = (start + last) /2;

            if (key == arr[mid]) {
                return mid;
            }

            if (key > arr[mid]) {
                start = mid+1;
            }else {
                last = mid - 1;
            }
        }
        return -1;
    }

    public static int smallestInArray(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }


    public static int largestInArray(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int linearSearch(int[] arr,int key) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == key) {
                return i; // if we found key we return the index of the key in array
            }
        }
        return -1; // -1 mean key is not exists in the array
    }

    public static void update(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*

        // Input/output and update

        int[] marks = new int[100];

        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt();  //math
        marks[2] = sc.nextInt();  // chem

        System.out.println("Phy: "+ marks[0]);
        System.out.println("Math: "+ marks[1]);
        System.out.println("Chem: "+ marks[2]);

        int per = (marks[0] + marks[1] + marks[2] ) /3;
        System.out.println("Percentage: "+per+"%");

*/


        /*

        // Array as function argument

        int[] marks = {90,91,92};

        update(marks);

        for (int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        */

/*
        // Linear search
        int[] numbers = {2,4,6,8,10,12,14,16};
        System.out.println("Key at index: "+ linearSearch(numbers,10));
*/

/*

        // Largest in array
        int[] numbers = {1,2,6,3,5};
        System.out.println(largestInArray(numbers));
*/

/*
        // Smallest in array
        int[] numbers = {1,2,6,3,5};
        System.out.println(smallestInArray(numbers));
*/

/*
        // Binary search
        int[] numbers = {2,4,6,8,10,12,14,16};
        System.out.println(binarySearch(numbers,10));
*/

/*
        // Reverse an array
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,6};
        reverseAnArray(arr1);
        reverseAnArray(arr2);
*/


/*
        // pairs in array
        int[] arr = {2,4,6,8,10};
        pairsInArray(arr);
*/

/*
        // Print Sub-arrays
        int[] arr = {2,4,6,8,10};
        printSubArrays(arr);
*/
        sc.close();
    }
}
