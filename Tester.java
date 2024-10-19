import java.util.*;

public class Tester {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{7,1,1},{1,1,5},{3,6,4}};
        //Function.maxSubArraySum(arr);
       // Function.kadanesSubArrayAum(arr);
       // Function.trappedRainWater(arr);
      // System.out.println(Function.bestPrice(arr));
       //System.out.println(Function.countingSort(arr));
       //Function.countingSort(arr);
      // Function.printArray(arr);
      //SortingAlgos.bubbleSort(arr);
     //bubbleeSortDescending(arr);
     // Function.printArray(arr);
    // TwoDArray.spiral(arr);
    // TwoDArray.outTDArray(arr);


                System.out.println("Enter integers (type 'exit' to quit):");
                int c = 1;
                while (sc.hasNextLine()) {
                    String str = sc.nextLine();
                    System.out.println(c+" "+ str);
                    c++;
                }
        sc.close();
    }

  /*   private static void bubbleeSortDescending(int arr[]) {
        for(int i=0 ; i<=arr.length-2 ; i++) {
            for(int j=0 ; j<=arr.length-2-i ;j++) {
                if(arr[j] <arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    } */
}
