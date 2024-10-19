public class Sorting {

    public static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        // bubble sort

        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1,85,62,32,96,74,85,96,21,25,36,14,74,58,56,52,65,6,3,32,36,39,35,85,96, 0,45 ,58,54,2,6,1,8,2,6,8,1,15,2,6,3,1,8,5,9,6,8,2 };

        for (int i = 0; i < arr.length - 1; i++) { // counter
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        printArray(arr);
    }
}
