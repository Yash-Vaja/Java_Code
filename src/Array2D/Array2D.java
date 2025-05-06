package Array2D;

import java.util.Scanner;

public class Array2D {

    public static boolean staircaseSearch(int[][] arr, int key ) {
        int rows = 0, cols = arr[0].length - 1;

        while (rows < arr.length && cols >= 0) {

            if (arr[rows][cols] == key) {
                System.out.println(key + " found at ( " + rows+", "  + cols+" )");
                return true;
            }
            else if (key < arr[rows][cols]) {
                cols--;
            }
            else {
                rows++;
            }
        }
        System.out.println(key + " not found");
        return false;
    }

    public static void diagonalSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // pd
            sum += arr[i][i];

            //sd
            if (i != arr.length - i - 1) {
                sum += arr[i][arr.length - i - 1];
            }
        }
        System.out.println("Diagonal Sum is: " + sum);
    }

    public static void spiralMatrix(int[][] arr) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol -1 ; j >= startCol; j--) {
                if (startRow == endRow) {
                    return;
                }
                System.out.print(arr[endRow][j] + " ");
            }

            // left
            for (int i = endRow -1; i >= startRow +1; i--) {
                if (startCol == endCol) {
                    return;
                }
                System.out.print(arr[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static boolean search(int[][] arr, int target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (target == arr[i][j]) {
                  found = true;
                }
            }
        }
        return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


/*

        // creation-1
        int[][] arr = new int[3][3];

        // creation-2
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = i+ j;
            }
        }

        // output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(search(arr2, 3));
*/

/*

        // Spiral Matrix
        int[][] arr ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        spiralMatrix(arr);
*/

/*
        // diagonal sum
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        diagonalSum(arr);
*/

/*
        //   Staircase search
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        staircaseSearch(arr, 14);
*/

    }

}