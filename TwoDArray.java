import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creat a 2 D array
      //  int arr[][] = new int[3][3];
        int matrix[][] = {  { 1, 2, 3, 4 },
                            { 5, 6, 7, 8 },
                            { 9, 4, 1, 1 },
                            { 13, 14, 15, 16 } };
        int key =2;
        System.out.println(sumOfGivenRowNumber(matrix, key));
        // System.out.println(numberOfkey(matrix, key));
        //staircase(matrix, key);
        //spiral(matrix);
        // inTDArray(arr);
        // outTDArray(arr);
        // searchTDArray(arr, 7);

        //System.out.println(diagonalSum(matrix));
        sc.close();
    }

    // function for input 2d array
    public static void inTDArray(int arr[][]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    // function for output 2d array
    public static void outTDArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // function for find element or key in 2d array
    public static void searchTDArray(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.print("key found at [" + i + "," + j + "]");
                } else {
                    System.out.println("Key not found");
                }
            }
        }
        System.out.println("Key not found");
    }

   //spiral matrix
   public static void spiral(int arr[][]) {
    int sr=0;
    int sc=0;
    int er=arr.length-1; 
    int ec=arr[0].length-1;

    while(sr<=er && sc<=ec){
        //top 
        for(int i = sc ; i<ec;i++) {
            System.out.print(arr[sr][i]+" ");
        }

        //right
        for(int i=sr+1; i<=er ;i++) {
            System.out.print(arr[i][ec]+" ");
        }

        //bottom
        for(int i=ec-1 ; i>=sc ;i--) {
            if(sr==er){
                break;
            }
            System.out.print(arr[er][i]+" ");
        }

        //left
        for(int i=er-1 ; i>=sr+1 ;i--) {
            if(sc==ec){
                break;
            }
            System.out.print(arr[i][sc]+" ");
        }
        sc++;
        sr++;
        er--;
        ec--;
    }
    System.out.println();
   }


   //diagonal sum
   public static int diagonalSum(int arr[][]) {
   int sum=0;
   //brute force
    //  for(int i=0 ;i<arr.length; i++) {
    //     for(int j=0; j<arr[0].length;j++){
    //         if(i==j) {
    //             sum+=arr[i][j];
    //         }else if(i+j == arr.length-1) {
    //             sum+=arr[i][j];
    //         }
    //     }
    //  }
     
    for(int i=0 ; i<arr.length ; i++) {
        //  for primary diagonal
        sum += arr[i][i];

        //sd
        if(i != arr.length-i-1) {
            sum+= arr[i][arr.length-i-1];
        }
    }
     return sum;
   }

   //staircase search
   public static boolean staircase(int arr[][],int key){

    //for start from top right
    // int row=0,col=arr[0].length-1;
    // while (row <arr.length && col >=0) {
    //     if(arr[row][col] == key) {
    //         System.out.println("Key Found at ("+row+","+col+")");
    //         return true;
    //     }
    //     else if(key < arr[row][col]) {
    //         col--;
    //     }else{
    //         row++;
    //     }
    // }

    //for start from bottom left
    // int row = arr.length-1;
    // int col=0;
    // while (row >=0 && col < arr.length) {
    //     if(arr[row][col] == key){
    //         System.out.print("Key found at ("+row+","+col+")");
    //         return true;
    //     }else if(arr[row][col] > key) {
    //         row--;
    //     }else{
    //         col++;
    //     }
    // }
    System.out.println("!!Key not Found !!");
    return false;
   }

   /*Question 1 : Print the number of 7’s that are in the 2d array.
    Example :
    Input - int[][] array = { {4,7,8},{8,8,7} };
    Output - 2*/
    public static int numberOfkey(int arr[][],int key) {
        int count=0;
        for(int i=0 ;i<arr.length; i++) {
            if(key == arr[i][arr.length-i-1]) {
                count++;
            }
        }
        return count;
    }

    /*Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
    Example :
    Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
    Output - 18 */
    public static int sumOfGivenRowNumber(int arr[][],int rno){
        int sum =0;
        for(int i=0 ; i<arr[0].length ;i++) {
            //for  second row  note this program is static
            sum += arr[1][i];
        }
        return sum;
    }
}
