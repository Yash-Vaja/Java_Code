import java.util.*;
public class SortingAlgos {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       //common array
      // int commonArr[] = {-2,1,0,15,-25,15,35,-85,-69,25};
       int array[] = {3,6,2,1,8,7,4,5,3,1};
       /*bubble sort Date : 19/7/2024
       bubbleSort(commonArr);
       Function.printArray(commonArr);
       */

       /*selection sort Date : 19/7/2024
        selectionSort(commonArr);
        Function.printArray(commonArr);
        */

        /*Insertion sort Date : 23/7/2024
        insetionSort(commonArr);
        Function.printArray(commonArr);
        */
        
        /*counting sort Date : 24/7/2024 
        int arr[] = {1,4,1,3,2,4,3,7};
        couningSort(arr);
        Function.printArray(arr);
        */
        
        //bubbleSortDescending(array);
        //selectionSortDescending(array);
        //insertionSortDescending(array);
        couningSortDescending(array);
        Function.printArray(array);
       sc.close(); 
    }

    //bubble sort Date : 19/7/2024
    public static void  bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0 ; i<=n-2 ;i++){
            for(int j=1 ; j<=n-2-i ;j++){
                if(arr[j] < arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //selection sort Date : 19/7/2024
    public static void selectionSort(int arr[]){
        for(int i=0 ; i <arr.length-1 ;i++){
            int minPosition = i;
            for(int j = i+1 ; j <arr.length; j++){
                if(arr[minPosition] > arr[j]){
                    minPosition = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
        
    }

    // insertion sort
    public static void  insetionSort(int arr[]){
        for(int i=1 ; i<arr.length-1 ; i++){
            int curr = arr[i];
            int prev =  i-1;

            while (prev >= 0 && curr > arr[prev]) {
                arr[prev + 1 ] = arr[prev];
                prev--;
            }

            //insertion
            arr[prev+1] = curr;
        }
    }

    //counting sort Date : 24/7/2024
    public static void couningSort(int arr[]){
       
        //finding larges number
        int largest = Integer.MIN_VALUE;
       for(int i=0 ; i<arr.length ;i++) {
        largest = Math.max(largest, arr[i]);
       }

       //new array count 
       int count[] = new int[largest+1];
       for(int i=0 ; i<arr.length ;i++){
        count[arr[i]]++;
       }

       //sorting
       int j=0;
       for(int i=0 ; i<count.length ;i++) {
        while(count[i] > 0 ){
            arr[j] = i;
            j++;
            count[i]--;
        }
       }
    }

    //bubble sort but in descendng order 
    //8,7,6,5,4,3,3,2,1 <-- output
    public static void bubbleSortDescending(int arr[]){
       for(int i=0 ; i<arr.length-1 ; i++) {
        for(int j=i+1 ; j<arr.length ; j++) {
            if(arr[j] > arr[i]){
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
       }
    }

    //selection sort but descending order
    public static void selectionSortDescending(int arr[]){
    for(int i=0 ; i<arr.length-1 ;i++) {
        int maxpos = i ;
        for(int j=i+1 ; j<arr.length ; j++) {
            if(arr[j] > arr[maxpos]) {
                maxpos = j;
            }
        }
        //swap
        int temp = arr[i];
        arr[i] = arr[maxpos];
        arr[maxpos] = temp;
    }  
    }

    //insertion sort descending order
    public static void insertionSortDescending(int arr[]) {
        for(int i=1 ; i <arr.length ;i++) {
            int curr = arr[i];
            int pre = i-1;

            while(pre>=0 && curr>arr[pre]) {
                arr[pre+1] = arr[pre];
                pre--;
            }

            //insertion
            arr[pre+1] = curr;
        }
    }

    //counting sort Descending order Date : 25/7/2024
    public static void couningSortDescending (int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length-1 ; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0 ; i<arr.length ; i++) {
            count[arr[i]]++;
        }

        int j= 0;
        for(int i=count.length-1 ; i >0 ; i--) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
}
