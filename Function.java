import java.util.*;

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Date:19/6/2024 | Functions |

        /*
         * 1. Swap value (USing swapValue function)
         * 
         * int a = 50;
         * int b = 5;
         * swapValue(a, b);
         */

        /*
         * 2.Find product of A & B ( using multiply function)
         * 
         * System.out.print("Enter A : ");
         * int a = sc.nextInt();
         * 
         * System.out.print("Enter B : ");
         * int b = sc.nextInt();
         * 
         * System.out.println("Product of A & B : "+multiply(a, b));
         */

        /*
         * 3.Print Factorial of a number n(using factorial function)
         * System.out.println("Factorial of n : "+factorial(5));
         */

        /*
         * 4.Binomial Cofficient(using binomialCofficient)
         * 
         * System.out.print("Enter n : ");
         * int n = sc.nextInt();
         * 
         * System.out.print("Enter r : ");
         * int r = sc.nextInt();
         * 
         * System.out.println("Binomial Cofficient : "+binomialCofficient(n, r));
         */

        /*
         * 5.Understanding function overloading using parameter with help of calculator
         * 
         * int userChoice;
         * do{
         * System.out.
         * println("Enter 1 to find sum of 2 number \nEnter 2 to find sum of 3 number \nEnter 3 for exit"
         * );
         * userChoice = sc.nextInt();
         * 
         * if(userChoice ==1){
         * System.out.print("Enter number 1 : ");
         * int num1 = sc.nextInt();
         * 
         * System.out.print("Enter number 2 : ");
         * int num2 = sc.nextInt();
         * 
         * System.out.println("Sum of 2 Numbers"+sum(num1, num2)); // there is function
         * different by their parmeters
         * }else if(userChoice == 2){
         * System.out.print("Enter number 1 : ");
         * int num1 = sc.nextInt();
         * 
         * System.out.print("Enter number 2 : ");
         * int num2 = sc.nextInt();
         * 
         * System.out.print("Enter number 3 : ");
         * int num3 = sc.nextInt();
         * 
         * System.out.println("Sum of 3 Numbers : "+sum(num1, num2,num3)); // see here
         * deferent parameters, it's called function overloading
         * }else{
         * break;
         * }
         * }while(userChoice != 3);
         */

        /*
         * 6.Check if number is prime or not (using isPrime function)
         * 
         * System.out.print("Enter number for check number is prime or not : ");
         * int num = sc.nextInt();
         * System.out.println("Your Number is : "+ isPrime(num));
         * 
         */

        /*
         * 7.Print all Prime number in range of 10(using isPrimeInRange)
         * isPrimeInRange(20);
         */

        /*
         * 8.Binary to Decimal
         * System.out.print("Enter Binary Number : ");
         * int binNumberByUser = sc.nextInt();
         * binToDeci(binNumberByUser);
         */

        /*
         * 9.Decimal to Binary Number
         * System.out.print("Enter Decimal Number : ");
         * int decimalNumber = sc.nextInt();
         * decimalToBinary(decimalNumber);
         */

        /*
         * Question 1. Write a Java method to compute the averge of three number (We are
         * using averge function)
         * 
         * System.out.print("Enter First Number : " );
         * double firstNumber = sc.nextDouble();
         * 
         * System.out.print("Enter Second Number : ");
         * double secondNumber = sc.nextDouble();
         * 
         * System.out.print("Enter Third Number : ");
         * double thirdNumber = sc.nextDouble();
         * 
         * System.out.println("Averge of Three number : "+ averge(firstNumber,
         * secondNumber, thirdNumber));
         */

        /*
         * Question 2. Write a method named isEven that accepts an int argument.The
         * method should return true if the argument is even, or false otherwise. Also
         * write a program to test your method.
         * 
         * System.out.print("Enter an integer : ");
         * int num = sc.nextInt();
         * 
         * if(isEven(num)){
         * System.out.println("Number is Even");
         * }else{
         * System.out.println("Number is Odd");
         * }
         */

        /*
         * Question 3. Write a Java program to check if a number is a palindrome in
         * Java?(121isapalindrome, 321 is not)A number is called a palindrome if the
         * number is equal to the reverse of a number e.g.,121 is a palindrome because
         * the reverse of 121 is 121 it self.On the other hand,321 is not a palindrome
         * because the reverse of 321 is 123, which is not equal to 321. (Using
         * palindrome function)
         * 
         * System.out.println("Enter Number : ");
         * int num = sc.nextInt();
         * 
         * if(palindrome(num)){
         * System.out.println("Number is Palindrome");
         * }else{
         * System.out.println("Number is not Palindrome");
         * }
         */

        /*
         * Question 4 :READ & CODE EXERCISE Search about(Google) & use the following
         * methods of the Math class in Java:
         * a.Math.min( )
         * b.Math.max( )
         * c.Math.sqrt( )
         * d.Math.pow( )
         * e.Math.abs( )
         * 
         * 
         * System.out.print("Enter number X : ");
         * int x = sc.nextInt();
         * 
         * System.out.print("Enter number Y : ");
         * int y = sc.nextInt();
         * 
         * System.out.println("Minimum number of X & Y : " + Math.min(x,y));
         * System.out.println("Maximum number of X & Y : " + Math.max(x,y));
         * System.out.print("Squarroot  number of X : " + Math.sqrt(x));
         * System.out.println("Minimum number of Y : " + Math.sqrt(y));
         * System.out.println("Power X of Y : " + Math.min(x,y));
         * System.out.println("Power Y of X : " + Math.min(y,x));
         * System.out.println("Absoulet number of X : " + Math.abs(x));
         * System.out.println("Absoulet number of Y : " + Math.abs(y));
         */

        /*
         * Question 5 :Write a Java method to compute the sum of the digits in an
         * integer.
         * System.out.print("Enter number to get sum of intger digits : ");
         * int num = sc.nextInt();
         * System.out.println("Sum of Digits : "+sumOfDigit(num));
         */

        sc.close();
    }

    // function for swap values
    public static void swapValue(int swapNumber1, int swapNumber2) {

        // swap process
        int temp = swapNumber1;
        swapNumber1 = swapNumber2;
        swapNumber2 = temp;

        // for print output
        System.out.println("A : " + swapNumber1);
        System.out.println("B : " + swapNumber2);
    }

    // function for find product value
    public static int multiply(int productValue1, int productValue2) {

        // mulitiplication process
        int product = productValue1 * productValue2;

        // return
        return product;
    }

    // function for print factorial of number n
    public static int factorial(int numberForFactorial) {

        int factorial = 1;
        for (int i = 1; i <= numberForFactorial; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    // function for find binomial cofficeint
    public static int binomialCofficient(int n, int r) {
        int factorial_n = factorial(n);
        int factorial_r = factorial(r);
        int factorial_rMr = factorial(n - r);

        int binomialCofficient = factorial_n / (factorial_r * factorial_rMr);
        return binomialCofficient;
    }

    // function for sum of 2 numbers
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // function for sum of 3 numbers
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // function to check number is prime or not
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // function for print Primes in range of 10
    public static void isPrimeInRange(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // function to change binary to decimal
    public static void binToDeci(int binNumber) {
        int pow = 0;
        int decimalNumber = 0;
        while (binNumber > 0) {
            int lastDigit = binNumber % 10;
            decimalNumber = decimalNumber + (int) (lastDigit * Math.pow(2, pow));
            pow++;
            binNumber /= 10;
        }
        System.out.println("Decimal Number : " + decimalNumber);
    }

    // Function to change number Decimal to Binary
    public static void decimalToBinary(int decNum) {
        int binaryNum = 0;
        int power = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binaryNum = binaryNum + (rem * (int) Math.pow(10, power));
            power++;
            decNum /= 2;
        }
        System.out.println("Binary Number : " + binaryNum);
    }

    // function for sum of 3 numbers
    public static double averge(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    // function for number is even or not
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Function to check the number is palindrome or not
    public static boolean palindrome(int number) {
        int reverseNumber = 0;
        int palindrome = number;
        while (palindrome != 0) {

            int remainder = palindrome % 10; // calculatingn remainder
            reverseNumber = reverseNumber * 10 + remainder;
            palindrome /= 10;
        }

        if (reverseNumber == number) {
            return true;
        } else {
            return false;
        }
    }

    // Function to get sum of intger digit
    public static int sumOfDigit(int num) {
        int sum = 0;
        int lastDigit = 0;

        while (num > 0) {
            lastDigit = num % 10;
            sum = sum + lastDigit;
            num /= 10;
        }

        return sum;
    }

    // function for print hollow rectangle
    public static void hollowRectangle(int totalRows, int totalColums) {
        // outer loop(Row)
        for (int i = 1; i <= totalRows; i++) {

            // inner loop(colum)
            for (int j = 1; j <= totalColums; j++) {

                // cell(i,j)
                if (i == 1 || j == 1 || i == totalRows || j == totalColums) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Function for print INverted & roated half-pyramid
    public static void invertedRoatedHalfPyramid(int n) {

        // outer loop (rows)
        for (int r = 1; r <= n; r++) {

            // innrt loop(spaces printing)
            for (int s = 1; s <= n - r; s++) {
                System.out.print("  ");
            }

            // inner loop(star printing)
            for (int j = 1; j <= r; j++) {
                System.out.print(" *");
            }
            // printing to new line
            System.out.println();
        }
    }

    // function for inverted half-pyramid with Numbers
    public static void invertedHalfPyramidWithNumbers(int n) {
        // outer loop(rows)
        for (int i = 0; i < n; i++) {
            // inner loop
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // function for print floyd's triangle
    public static void floydTriangle(int n) {
        int counter = 1;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    // function for print 0 & 1 triangle
    public static void zeroOneTriangle(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    // function for butterfly patter
    public static void butterfly(int n) {
        // 1st half
        // outerloop ( 1st half row)
        for (int i = 1; i <= n; i++) {

            // inner loop (inline 1st part printing stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // inner loop(inline 2nd part printing spaces)
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print("  ");
            }

            // inner loop(inline 3rd part printing stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // for new lines
        }

        // 2nd half
        // outer loop
        for (int i = n; i >= 1; i--) {

            // inner loop(1st part for star printing)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // inner loop(2nd part for spaces printing)
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print("  ");
            }

            // inner loop(3ed part fro star printing)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // for new line
        }
    }

    // function for solid rhombus
    public static void solidRhombusMyMethod(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {

            // spaces (1 to n-i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // 1st part star (1 to i )
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // 2nd part star ( n-i to 1 )
            for (int j = n - i; j >= 1; j--) {
                System.out.print("* ");
            }

            // for go in mext line
            System.out.println();
        }
    }

    // funcion for solid rhombs
    public static void solidRhombus(int n) {

        // outer loop
        for (int i = 1; i <= n; i++) {

            // spaces ( n-i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println(); // new line
        }
    }

    // function for hollow rhombus

    public static void hollowRhombus(int n) {

        for (int i = 1; i <= n; i++) {

            // spaces(n-i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars or hollow rectangle
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println(); // new line
        }
    }

    // function for diamond pattern
    public static void diamond(int n) {

        // outer loop 1st part

        for (int i = 1; i <= n; i++) {
            // spaces (n-i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars (1 to counter & counter+=2)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println(); // new line

        }

        for (int i = n; i >= 1; i--) {
            // spaces (n-i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars (1 to counter & counter+=2)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println(); // new line

        }
    }

    // Function for output the array
    public static void outputArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function for update array by 1
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    // FUnction for linear search for number
    public static int linearSearchNumber(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // function for find largest number of array
    public static int largestNumberInArray(int arr[]) {
        int largestNUmber = Integer.MIN_VALUE; // - infinity

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNUmber) {
                largestNUmber = arr[i];
            }
        }
        return largestNUmber;
    }

    // binary search
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // comparison
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) { // right
                end = mid - 1;
            } else { // left
                start = mid + 1;
            }
        }
        return -1;
    }

    // revers an array
    public static void reverArray(int arr[]) {
        int first = 0, last = arr.length - 1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = arr[temp];

            first++;
            last--;
        }
    }

    // pairs in an array
    public static void pairsInAnArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("[" + current + "," + arr[j] + "]");
            }
            System.out.println();
        }
    }

    // print subarray
    public static void subArray(int arr[]) {
        int ts = 0; // total subarray
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " "); // sub array
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Array : " + ts);
    }

    // sub array sum
    public static void maxSubArraySum(int arr[]) {
        int currentSum = 0 ,maxSum =Integer.MIN_VALUE;

        for(int i=0; i<arr.length ;i++) {
            for(int j=i; j<arr.length; j++) {
                currentSum =0;
                for(int k=i; k<=j;k++) {
                    currentSum += arr[k];
                }
                System.out.println(currentSum);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.print("Max subarray sum : "+maxSum);
    }

    // prefix array function
    public static void prefixArraySum(int arr[]) {

        int prefix[] = new int[arr.length];
        int currentSum;
        int maxSum = Integer.MIN_VALUE;

        // calculate prefix sum
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max Sum : " + maxSum);
    }

    // kadne's algorithim
    public static void kadanesSubArrayAum(int arr[]) {
       int cs =0;
       int ms = Integer.MIN_VALUE;

       for(int i=0; i<arr.length ;i++) {
        cs = cs + arr[i];
        // if(cs < 0) {
        //     cs =0;
        // }
        ms =Math.max(cs,ms);
       }

       System.out.println("Max sub array sum : "+ms);
    }

    // trapped rainwater
    public static int trappedRainWater(int arr[]) {
        int waterlevel=0;
        int trappedRainWater =0;
        int  n = arr.length;
        //leftmaxboundry-array lmb
        int lmb[] = new int[n];
        lmb[0] = arr[0];
        for(int i=1 ; i<n; i++) {
            lmb[i] = Math.max(arr[i],lmb[i-1]);    
        }
        //rightmaxboundry-array rmb
        int rmb[] = new int[n];
        rmb[n-1] = arr[n-1];
        for(int j=n-2 ; j>=0;j--) {
            rmb[j] = Math.max(arr[j], rmb[j+1]);
        }
        //waterlevel & trappedrainwater
        for(int i=0; i<n ;i++) {
            //water level = leftmaxboundry - rightmaxboundry
         waterlevel = Math.min(lmb[i],rmb[i]);
            //trappedrainwater = waterlevel - height
         trappedRainWater += waterlevel- arr[i];
        }
        return trappedRainWater;
    }

    // buy and sell stock at best price
    
    public static int bestPrice(int arr[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;  
        for (int i = 0; i < arr.length; i++) {
            if (buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = arr[i];
            }
        }
         return maxProfit;
    }

    // check array conatains duplicate numbers or not
    public static boolean conatainsDouble(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Binary search 2.O
    public static int binarySearch2(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // maxprofit from stock
    public static int maxProfitStocks(int price[]) {
        // Initializing
        int buyingprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // loop
        for (int i = 0; i < price.length; i++) {
            // calculating best price for selling
            if (buyingprice < price[i]) {
                int profit = price[i] - buyingprice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyingprice = price[i];
            }
        }
        if (maxProfit > 0) {
            return maxProfit;
        } else {
            return 0;
        }
    }

    // Trapped Rain water
    public static int trappedRainWater2(int arr[]) {
        // initializing

        int n = arr.length;
        int trappedRainWater = 0;

        // calclating left max boundary
        int leftmaxboundary[] = new int[n];
        leftmaxboundary[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftmaxboundary[i] = Math.max(arr[i], leftmaxboundary[i - 1]);
        }

        // calculating right max bounday
        int rightmaxboundary[] = new int[n];
        rightmaxboundary[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmaxboundary[i] = Math.max(arr[i], rightmaxboundary[i + 1]);
        }

        // Calculating waterheight
        for (int i = 0; i < n; i++) {
            int waterheight = Math.min(leftmaxboundary[i], rightmaxboundary[i]);
            trappedRainWater += waterheight - arr[i];
        }
        return trappedRainWater;
    }

        //Printing array
        public static void printArray(int arr[]){
        System.out.print("{");
            for(int i=0 ; i<arr.length ; i++){
                System.out.print(arr[i]+","); 
            }
            System.out.print("}");
        }

        //counting sort array
        public static void countingSort(int arr[]) {
            int largest = Integer.MIN_VALUE;
            for(int i=0; i<arr.length; i++) {
                largest = Math.max(largest,arr[i]);
            }

            int count[] = new int[largest+1];
            for(int i = 0 ; i <arr.length ; i++) {
                count[arr[i]]++;
            }

            //sorting
            int j =0;
            for(int i = 0 ; i < count.length ;i++) {
                while (count[i] > 0) {
                    arr[j] = i;
                    j++;
                    count[i]--;
                }
            }
        }
    }