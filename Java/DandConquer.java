import  java.util.*;

public class DandConquer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {12,3,2,1,5,6,0,};
        int arr0[] = {4,5,6,7,0,1,2};

        //mergeSort(arr,0,arr.length-1);
        //quickSort(arr,0,arr.length-1);

        //Function.printArray(arr);


        //System.out.println( search(arr0,3,0,arr.length-1));
    }

    public static void mergeSort(int arr[],int si,int ei){
        //Base case
        if(si>= ei){
        return;
        }
        //Work
        int mid = si + (ei-si)/2;

        //left side
        mergeSort(arr,si,mid);

        //right side
        mergeSort(arr,mid+1,ei);

        //to merge
        merge(arr,si,mid,ei);

    }

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //for temp array

        //comparison of left sorted part and right sorted part
        while(i <= mid && j <= ei ){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left over left side element
        while(i <= mid){
            temp[k++] = arr[i++];  //we are using post increment so it return the value first then it increment it
        }

        //left over right side element
        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        //copying element form temp array to original array
        for(k=0,i=si;k<temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }

    public static void quickSort(int arr[],int si, int ei){
        // base case
        if(si >= ei) {
            return;
        }

        //last element
        int pidx = partition(arr,si,ei);

        quickSort(arr,si,pidx-1);
        quickSort(arr,pidx+1,ei);



    }

    public static int partition(int arr[], int si,int ei){
        int pivot = ei;
        int i = si-1; // to make space for elementes are smaller than pivot

        for(int j = si ; j <= ei ; j++) {
            if(arr[j] <= pivot){  //checking if jth index value is <= pivot mean last index value
                i++;  // make a space to place smaller element then pivot
                //swap
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i] = temp;
            }
        }

        //now changing position of pivot to right index
        i++;
        int temp = pivot;   //pivot which is initialized with ei goes to temp
        arr[ei] = arr[i];   // ei take index of i
        arr[i] = temp;         //i made right index position for pivot

        return i;       //return right pivot index
    }

    //search in sorted rotated array
    public static int search(int arr[],int target,int si,int ei) {
        //base case
        if(si > ei){
            return -1;
        }

        int mid = si + (ei-si)/2;
        
        //work
        if(arr[mid] == target){
            return mid;
        }

        //case 1 : mid is on line 1
        if(arr[si] <= arr[mid]){
            // left side
            if(arr[si] <= target && target <= arr[mid]){
               return search(arr,target,si,mid); //recursion for search target in left of mid
            }else{ // right side
              return  search(arr,target,mid+1,ei); //recursion for search target in right side of mid
            }
        }

        //case 2 : mid is on line 2
        if(arr[mid] <= arr[ei]){
            //left side
            if(arr[mid+1] <= target && target <=arr[ei]) {
                return search(arr,target,mid+1,ei);  //recursion for search target in right side of mid
            }else{ //right side
                return search(arr,target,si,mid); //recursion for search target in left side of mid
            }

        }
        return  mid;
    }
}
