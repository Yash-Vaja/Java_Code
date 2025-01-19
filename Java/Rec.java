public class Rec {
    static String words[] = {"Zero","one","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
    public static void main(String[] args) {
        String str = "appnncollege";
        int arr[] ={2,1,2,5,1,3,5,2,1,2,3};

        //removeDuplicates(str,0,new StringBuilder(""),new boolean [26]);
        // System.out.println(tilingProblem(6));
        //System.out.println(friendsPairing(3));
        // printBinaryString(3,0,"");
        //allOccurences(arr,2,0);
        printDigits(1224);

    }

    public static void printDec(int n) {
        //base case
        if(n == 1) {
            System.out.println(n);
            return;
        }
        //work
        System.out.print(n+" ");

        //recursion
        printDec(n-1);
    }

    public static void printAsc(int n) {
        //base case
        if(n == 1) {
            System.out.print(n+" ");
            return;
        }
        //recursion
        printAsc(n-1);
        //work
        System.out.print(n+" ");
    }

    public static int pow(int x, int n) {
        //base case
        if(n == 1)  return x;
//        pow(x,n-1);
        //recursion and work
        return x * pow(x,n-1);
    }

    public static int opPow(int x,int n) {
    // base case
        if(n == 0)
            return 1;
        int halfpow = opPow(x,n/2);
        int halfPowSq = halfpow * halfpow;
        if(n % 2 != 0)
            return  halfPowSq = x * opPow(x,n/2) * opPow(x,n/2) ;
        return halfPowSq;
    }

    public static int factorialOfN(int n) {
        if(n == 0){
            return 1;
        }
        int fnm1 =factorialOfN(n-1);
        int fn = n * factorialOfN(n-1);
        return fn;
    }

    public static int sumOfNNumbers(int n) {
        if(n == 1){
            return 1;
        }
        int snm1 = sumOfNNumbers(n-1);
        int sum = n + sumOfNNumbers(n-1);
        return sum;
    }

    public static int fibonacci(int n) {
        if(n ==0 || n==1) {
            return n;
        }
        int fbnm1 = fibonacci(n-1);
        int fbnm2 = fibonacci(n-2);

        return fbnm1+fbnm2;
    }

    public static boolean isSorted(int arr[],int i) {
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
           return isSorted(arr,i+1);
    }

    public static int firstOccurence(int arr[],int key, int i) {
    if(i == arr.length-1) {
        return -1;
    }
    if(arr[i] == key) {
        return i;
    }
    return firstOccurence(arr,key,i+1);
    }

    public  static  int lastOccurence(int arr[],int key, int j) {
        if(arr[j] == arr[0]) {
            return -1;
        }
        if(arr[j] == key) {
            return j;
        }

        return lastOccurence(arr,key,j-1);
    }

    public static  int tilingProblem(int n) {  // 2 * n floor size
        //base case
        if(n== 0 || n==1){
            return 1;
        }

        //work
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //for horizontal choice
        int fnm2 = tilingProblem(n-2);

        return fnm1+ fnm2;
    }

    //function to remove duplicate from string
    public static void removeDuplicates(String str,int index , StringBuilder newStr,boolean map[]) {
        //base case
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }

        //work
        char currentChar = str.charAt(index);
            //checking character is duplicate or not
            if(map[currentChar-'a'] == true) {
                //for duplicate
                removeDuplicates(str,index +1 , newStr,map);  //recursion
            }else{
                map[currentChar-'a'] = true;
                removeDuplicates(str,index+1,newStr.append(currentChar),map); //recursion
            }
    }

    //function to set n friends
    public static int friendsPairing(int n){
        //base case
        if(n==1 || n==2) {
            return n;
        }
//        //work
//        //for single
//        int fnm1 = friendsPairing(n-1); //recursion   // (n-1) for {a} or {b} or {c} which is single
//
//        //for pair
//        int fnm2 = friendsPairing(n-2); //recursion   //(n-2) for {(a,b)} or{(a,c)} or {(b,c)}
//        int pairWays = (n-1) * fnm2;        //(n-1) * fnm2 is for  {a and (b,c)} or {b and(a,c)} or {c and (a,b)}
//
//        return fnm1 + pairWays ; // this total ways of pairing friends here we can use variable also

        //this is single line code
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    //function to print binary string
    public static void printBinaryString(int n , int lastPlace, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

        //work
        //to add 0 where lastPlace = 1
        printBinaryString(n-1,0,str+"0");

        //to place 1 where lastPlace=0
        if(lastPlace == 0) {
            printBinaryString(n-1,1,str+"1");
        }
    }

    //print all occurences of key
    public  static void allOccurences(int arr[],int key,int index){

        //base case
        if(index == arr.length){
            return;
        }
        //work
        if(arr[index] == key){
            System.out.print(index + " ");
        }

        //recursion
        allOccurences(arr,key,index+1);
    }

    //function for print digits
    public static void printDigits(int number) {

        //base case
        if(number == 0) {
            return;
        }

        //work
        int lastDigit = number%10;

        //recursion
        printDigits(number/10);

        System.out.print(words[lastDigit] + " ");
    }


}