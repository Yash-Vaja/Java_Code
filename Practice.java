public class Practice {
    public static void main(String[] args) {
    String str = "MADAM";
        System.out.println(isPalindrome(str));

    }
    public static boolean isPalindrome (String str) {
        if(str.length() <= 1){
            return true;
        }
        char fc = str.charAt(0);
        char lc = str.charAt(str.length()-1);
        if( fc != lc) {
            return false;
        }
        String remainingstring = str.substring(1,str.length()-1);
        return  isPalindrome(remainingstring);
    }
}