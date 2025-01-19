import java.util.*;
import java.util.Arrays;
public class Strings {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   // StringBuilder sb = new StringBuilder("");
    
    //common string
   // String fullname ="yash vaja ";
    /* 
    //array of char
    char arr[] = {'a','b','c'};

    //string decalre  1
    String str = "abc";

    //string decalre 2
    String str2 = new String("xyz");

    // strings are immutable mean it not modify or never change

    //input
    String name;
    //name = sc.next();   // sc.next is only for one text or word
    name = sc.nextLine();  //sc.nextline take whole line
    System.out.println(name);
*/
         //.length() count string's length include spaces
       /*  String fullname = "Yash VAJA";
        System.out.println(fullname.length()); */


        //concatenation is like connect two string 
        /*  String fname ="Yash ";
        String lname = "Vaja";
        String full_name = fname + lname;
        System.out.println(full_name); */

        //string charAt() method
        //System.out.println(fname.charAt(0)); //it returns 0th index character

        //printletters(full_name);

        //Q1 check if string is palindrome 
       /*  String str3 = "racecar";
        System.out.println(isPalindromeString(str3)); */

        //q2 given a route containing 4 direction (e,w,n,s) find the shortest path to reach destination  "wneeneaennn"
        /*String path = "NNN";
        System.out.println(getshortestPath(path)); */

        //string comapair using .isequalto
         /*String str4 = "abcd";
        String str5 = "abcd";
        if(str4.equals(str5)) {
            System.out.println("true");
        } */

        //string-function substring using .sunstring(beginINdex,EndIndex)  note ebdIndex is excluded
       // System.out.println(fullname.substring(0,2));

       //print largest strings for a given set of strings,print the largset string with lexicographic using compare "apple" "mango" "banana"
       /*   String fruite[] = {"apple","mango","banana"};
        String largest = fruite[0];
        for(int i=1 ; i<fruite.length; i++)  {
            if(largest.compareToIgnoreCase(fruite[i]) < 0) {
                largest = fruite[i];
            }
        }
        System.out.println(largest); */

        //string builder you can modify it synatx=> stringbuiler sb = new stringbuilder("hw");
        /*  for(char ch='a' ; ch<='d' ;ch++) {
            sb.append(ch);
        }
        System.out.println(sb); */

        //Q4 for a given string convert each the first letter of each word to uppercase
        /*System.out.println(uppercase(fullname));*/
    
        //Q5 String Compression "aaabbcccdd" => "a3b2c3d2"
        /*  String str5 = "aaabbbbcd";
        System.out.println(compression(str5)); */

        //Assignment q1 Count how many times lowercase vowels occurred in a String entered by the user.
       /*  String str6 = "Orange";
        System.out.println(lowecaseVowels(str6));*/

        /*Assignment q2 : What will be the output of the followingcode?
        public class Solution {
            public static void main(Stringargs[]) {
                String str="ShradhaDidi";
                String str1="ApnaCollege";
                Stringstr2="ShradhaDidi";
                System.out.println(str.equals(str1) +" "+str.equals(str2));
            }
        } 
         Output: False and True*/

         /*Assignment q3 : What will be the output of the followingcode?
         public class Solution {
            public static void main(Stringargs[]) {
                String str="ApnaCollege".replace("l","");
                System.out.println(str);
                }
            }
            Output: ApnaCoege
          */

          /*Assignmetn q4 : Determine if 2 Strings areanagramsof each other.
          What are anagrams?
          If two strings contain the same characters but in a different order,they can be said to be anagrams.Consider race and care.In this case,race's characters can be formed in to a study,or care's characters can be formed in to race.Below is a java program to check if two strings are anagrams or not. */
          String str7 = "race";
          String str8 = "care";
          isAnagrams(str7, str8);
        sc.close();
    }

    //function to check that two strings are anagrams or not
    public static void isAnagrams(String str , String str1) {
        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        if(str.length() == str1.length()) {
            char[] strchararr = str.toCharArray();
            char[] str1chararr = str1.toCharArray();
            
            Arrays.sort(strchararr);
            Arrays.sort(str1chararr);

            boolean results = Arrays.equals(strchararr, str1chararr);
            if(results) {
                System.out.println("String 1 and String 2 are Anagrams");
            }else{
                System.out.println(" String1  and String2 aren't Anagrams");
            }
        }else{
            System.out.println("String 1  and String 2 are not Anagrams");
        }
        
    }
    // funciton to calculate lowecase vowels in string
    public static int lowecaseVowels(String str) {
        int count = 0;
        for(int i=0 ; i<str.length(); i++) {
            if(str.charAt(i) =='a' || str.charAt(i) == 'e' || str.charAt(i) =='i' || str.charAt(i) == 'o'|| str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    //function for string compression
    public static String compression(String str) {
       StringBuilder db = new StringBuilder("");
        for(int i=0; i <str.length(); i++) {
            Integer count = 1;
            while( i < str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            db.append(str.charAt(i));
            if(count > 1){
                db.append(count);
            }
        }
        return db.toString();
    }

    // function for ppercase
    public static String uppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i <str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }


    //function for getshortest parth
    public static float getshortestPath(String str) {
        int x=0,y=0;
        for(int i=0; i<str.length(); i++) {
            int dir = str.charAt(i);
            if(dir == 'S') {
                y--;
            }else if(dir == 'N') {
                y++;
            }else if(dir == 'S') {
                x--;
            }else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }

    //function for check if string is palindrome
    public static boolean isPalindromeString(String str) {
        int n = str.length();
        for(int i=0 ; i<n/2 ; i++) {
            if(str.charAt(i) != str.charAt(n-i-1)) //we use not equal for not a palindrome
            return false;
        }
        return true;
    }

    //function for printletters using charAt and length method
    public static void printletters(String str) {
        for(int i =0 ;i<str.length(); i++) {
            System.out.print(str.charAt(i) +" ");
        }    
    }

    
}