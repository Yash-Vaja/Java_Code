public class Rec {
    public static void main(String[] args) {

        System.out.println(tiling(5));
    }

    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printAsc(int n) {
        if(n == 1) {
            System.out.print(n+" ");
            return;
        }
        printAsc(n-1);
        System.out.print(n+" ");
    }

    public static int pow(int x, int n) {
        if(n == 1)  return x;
//        pow(x,n-1);
        return x * pow(x,n-1);
    }




    public static int opPow(int x,int n) {
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

    public static int tiling(int n) {
        if(n == 0 || n == 1 ){
            return 1;
        }
        int fnm1 =  tiling(n-1);
        int fnm2 =  tiling(n-2);
        int tw = fnm2+fnm1;
        return tw;
    }


}