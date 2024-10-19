import java.util.*;
public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //if number is odd or even 
        //oddOrEven(5);

        //GEt iTh bit
        //System.out.println(getIThBit(4,10));

        //set ith bit
        // System.out.println(setIThBit(1,4));

        // clear ith bit
        // System.out.println(clearIThBit(1,10));

        //update ith bit
        //System.out.println(updateIThBit(10,2,1));

        //clear last ith bit
        //System.out.println(clearLastIThBit(2,15));

        //clear range of bits
        //System.out.println(clearRangeBit(10,2,4));

        // number is power of  2 or not
        // System.out.println(isPowerOfTwo(4));

        //to check set bit in number
        //System.out.println(checkSetBit(10));

        // fast expo at log n complexity
        //System.out.println(fastExpo(3,5));



        sc.close();
    }

    public static void oddOrEven (int num){
        int bitmask = 1;
        if((num & bitmask) == 1 ){
            System.out.println("NUmber is Odd");
        }else{
            System.out.println("Number is Even");
        }
    }

    public static int getIThBit (int i,int num) {
        int bitmask = 1 << i;
        if((num & bitmask) == 0){
            return  0;
        }else {
            return  1;
        }
    }

    public static int setIThBit(int i,int num) {
        int bitmask = 1<<i;
        return num | bitmask;
    }

    public static int clearIThBit(int i, int num) {
        int  bitmask = ~(1<<i);
        return  num & bitmask;
    }

    public static int updateIThBit(int num,int i, int newBit) {

        //1st approach using set and clear ith bit
        /*if(newBit == 0) {
            return clearIThBit(i,num);  //this for 0
        }else{
            return setIThBit(i,num); //this case for 1
        }*/

        //2nd approach
        num = clearIThBit(i,num);
        int bitMask =  newBit<<i;

        return num | bitMask;
    }

    public static int clearLastIThBit(int i,int num){
        int bitmask = (~0)<<i;
        return num & bitmask;
    }

    public static int clearRangeBit(int num,int i,int j) {
        int a =  (~0)<<(j+1);
        int b = 1 << (i-1);
        int bitmask = a | b;
        return  num & bitmask;
    }

    public static boolean isPowerOfTwo(int num) {
        return (num & (num-1)) == 0;
    }

    public static int checkSetBit(int num) {
       int count = 0;
       while(num >0) {
           if((num & 1)!= 0) {
               count++;
           }
          num = num>>1;
       }
       return  count;
    }

    public static int fastExpo(int a , int num) {
        int ans= 1 ;
        while(num>0) {
            if((num & 1 ) != 0) {
                ans *= a;
            }
            a *= a;
            num = num>>1;
        }
        return  ans;
    }
}
