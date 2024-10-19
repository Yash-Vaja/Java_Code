import java.util.*;

public class Loop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

      // While Loop

        /*
         * 1.Print number from 1 to 10
         * int counter = 0;
         * while ( counter <= 10) {
         * System.out.println(counter);
         * counter++;
         * }
         */

        /*
         * 2.Print number from 0 to n
         * int n = sc.nextInt();
         * int counter = 1 ;
         * while (counter <= n) {
         * System.out.println(counter);
         * counter++;
         * }
         */

        /*
         * 3.Print som fo first n Natrual numbers
         * int n =sc.nextInt();
         * int sum = 0;
         * int counter = 0;
         * while (counter < n) {
         * sum = sum + counter;
         * counter++;
         * }
         * System.out.println("Sum : " +sum);
         */

        // For Loop

        /*
         * 1.Print square
         * for(int c = 0 ; c < 4 ; c++){
         * System.out.println("* * * *");
         * }
         */

        /*
         * 2.Print reverse number row
         * 
         * int n = 123;
         * while(n > 0 ){
         * int lastDigit = n % 10 ; //using modulo we get last digit
         * System.out.print(lastDigit);
         * n /= 10; // after divided by 10 lastdigit will be remove
         * }
         */

        /*
         * 3.Revers the given number
         * 
         * int n =sc.nextInt();
         * int reverse = 0 ;
         * 
         * while(n > 0 ){
         * int lastDigit = n%10;
         * reverse = reverse*10 +lastDigit;
         * n /=10;
         * }
         * System.out.println(reverse);
         */

        // Do While Loop

        /*
         * 1.Print Hello world using do while loop
         * 
         * int counter = 1;
         * do{
         * System.out.println("Hello World");
         * counter++;
         * }while(counter <= 10);
         */

        /*
         * 2.Kepp entering the number till user enters a multplye of 10
         * 
         * do{
         * int number = sc.nextInt();
         * if(number % 10 == 0){
         * System.out.println("your wrong");
         * break;
         * }
         * }while(true);
         */

        /*
         * 3.Display all number from user expect multiplied by 10
         * do{
         * System.out.print("Enter your Number : ");
         * int number = sc.nextInt();
         * if(number % 10 ==0){
         * continue;
         * }
         * System.out.println("Your Number  : "+number);
         * }while(true);
         */

        /*
         * 4.Check if number is prime or not
         * 
         * int n =sc.nextInt();
         * boolean isPrime = true;
         * 
         * if(n == 2){
         * System.out.println("Number is Prime");
         * 
         * }
         * for(int i = 2 ; i <= n-1 ; i++){
         * if( n % 2 == 0){
         * isPrime = false;
         * }
         * }
         * 
         * if(isPrime== true){
         * System.out.println("Number is Prime");
         * }else{
         * System.out.println("Number is not Prime");
         * }
         */

        /*
         * Qusetion 2. Write a program that reads a set of integers, and then prints the
         * sum of the even and odd integers
         * 
         * int number;
         * int choice;
         * int evenSum = 0 ;
         * int oddSum = 0 ;
         * do{
         * number = sc.nextInt();
         * if(number % 2 == 0){
         * evenSum += number;
         * }else{
         * oddSum += number;
         * }
         * 
         * System.out.println("Sum of Even number : "+evenSum);
         * System.out.println("Sum of Odd number : "+oddSum);
         * System.out.println("if you want to coninue press 1 or not to press 2");
         * choice = sc.nextInt();
         * }while(choice == 1);
         * 
         */

        /*
         * Qusetion 3.Write a program to find the factorialof any number entered by the
         * user.C
         * 
         * int factorial = 1;
         * System.out.print("Enter any positive number : ");
         * int n = sc.nextInt();
         * for(int i = 1; i <= n ; i++){
         * factorial = factorial*i;
         * }
         * 
         * System.out.println("Factorial : "+factorial);
         */

        /*
         * Qusetion 4.Write a program to print the multiplication table of a number N,e
         * ntered by the user.
         * 
         * System.out.print("Enter the number of Tabel : ");
         * int numberOfTabel = sc.nextInt();
         * for(int i = 1 ; i <=10 ; i++){
         * System.out.println(numberOfTabel+" * "+i+" = "+(numberOfTabel*i));
         * }
         */

        // Nested Loop
        // Pattern Part 1

        /*(1)Print pattern
         *
         * *
         * * *
         * * * *
          
          
          for(int i = 1 ; i <= 4 ; i++){
          for(int j = 1 ; j <=i ; j++){
          System.out.print("* ");
          }
          System.out.println();
          }
         */

        /*(2)Print inverted star pattern
         * * * *
         * * *
         * *
         * 
         
         
         for(int row = 4 ; row >= 1 ; row--){
         for(int star = 1 ; star <= row ; star++){
         System.out.print("* ");
         }
         System.out.println();
         }
         */

        /*(3)Print Half Pyramid
         1
         1 2
         1 2 3
         1 2 3 4
         
         for(int row = 1 ; row <= 4 ; row++){
         for(int star = 1 ; star <= row ; star++){
         System.out.print(star+" ");
         }
         System.out.println();
         }
         */

        /*(4)Print char Patern
         A
         B C
         D E F
         G H I J
         
         char ch = 'A';
         for(int row = 1 ; row <= 4 ; row++){
         for(int cha = 1; cha<= row;cha++){
         System.out.print(ch+" ");
         ch++;
         }
         System.out.println();
         }
         */

        
         //Advanced pattern
         
        /*1.Hollow Rectangle 
              * * * * *
              *       *
              *       *
              * * * * *
              Function.hollowRectangle(4,5);
        */

        /*2.Inverted & Rotated Half Pyramid
                   *
                 * * 
               * * *
             * * * *
         
        System.out.println("Eneter n : ");
        int n = sc.nextInt();
        Function.invertedRoatedHalfPyramid(n);
        */

        /*3.Inverted half-pyrmid with number 
        System.out.print("Enter n Number : ");
        int n = sc.nextInt();
        Function.invertedHalfPyramidWithNumbers(n);
        */

        /*4.Floyd's Triangle
          1
          2 3
          4 5 6 
          7 8 9 10
          11 12 13 14 15
         
        System.out.print("Enter n number : ");
        int n = sc.nextInt();
        Function.floydTriangle(n);
        */

        /*5. 0 & 1 triangle 
          1
          0 1
          1 0 1
          0 1 0 1
          1 0 1 0 1
       
        System.out.print("Enter n number : ");
        int n = sc.nextInt();
        Function.zeroOneTriangle(n);
         */

         /*6.Butterfly pattern
          *             *
          * *         * *
          * * *     * * *
          * * * * * * * *
          * * * * * * * *
          * * *     * * *
          * *         * *
          *             *
         
          Function.butterfly(2);
           */

           /*7.solid Rhombus
                  * * * * *
                * * * * *
              * * * * *
            * * * * *
          * * * * *
        
        Function.solidRhombus(10);
           */ 

      /*8.hollow rhombus
                  * * * * *
                *       * 
              *       *
            *       *
          * * * * *
          Function.hollowRhombus(10);
       */

      /*9. Diamond Pattern
              *
            * * *
          * * * * *
        * * * * * * *
        * * * * * * *
          * * * * *
            * * *
              *
              Function.diamond(5);
       */


      sc.close();
    }
}
