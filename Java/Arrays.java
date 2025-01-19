
import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //  int numbers[] = {1,2,3,4,5,15,25,35}; //comman array
        /*  1st array
        int marks[] = new int[3];
        System.out.print("Math : ");
        marks[0] = sc.nextInt();
        System.out.print("Computer : ");
        marks[1] = sc.nextInt();
        System.out.print("English : ");
        marks[2] = sc.nextInt();

        //Updating marks by 1
        Function.update(marks);

        // for output the array
        Function.outputArray(marks);
        */
        
        /*//Linear Search
        int key = sc.nextInt();
        int index = Function.linearSearchNumber(numbers, key);
        if(index ==  -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Number at Index : "+ index);
        }
        */

        /*3.Largest Number in array 
        System.out.println(Function.largestNumberInArray(number));
        */
        
        /*4.Binary search 
        Function.outputArray(number);
        System.out.println();
        System.out.print("Enter number for search : ");
        int key = sc.nextInt();
        System.out.println("Key at index of: "+ Function.binarySearch(number, key));
        
        */

        /*5.Rever array 
        Function.reverArray(numbers);
        Function.outputArray(numbers);
        */

        /*6.Pairs in an array 
        Function.pairsInAnArray(numbers);
        */

        /*7.Print subarray 
        Function.subArray(numbers);
        */

        /*8.max subarray sum  
        Function.maxSubArraySum(numbers);
         */
        
        /*9.Prifix array 
        Function.prefixArraySum(numbers);
        */

        /*10.Kadane's Algorithim 
        Function.kadanesSubArrayAum(numbers);
        */
        
        /*11.TrappedRain Water
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(Function.trappedRainWater(height));
         */
        
        /*12.Best time to buy and sell stocks 
        int price[] = {20, 25, 14, 30, 45, 11, 23, 36, 18, 40};
        System.out.println(Function.bestPrice(price));
        */
        
        /*Question 1.Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct. 
        Function.conatainsDouble(numbers);
        */
        
        /*Question 2.There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2]. Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums. You must write an algorithm with O(log n) runtime complexity.
        System.out.println(Function.binarySearch2(numbers, 15));
         */
       
        /*3.ou  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. 
        int price[] = {1,2,3,5,6,7,8,9,10};
        System.out.println(Function.maxProfitStocks(price));
        */
        
        /*4.Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining
        int builingheights[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(Function.trappedRainWater(builingheights));
         */

         
        sc.close();
    }
}