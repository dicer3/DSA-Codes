
public class IsPalindrome {

    static boolean isPalindromeRec(String str,int start,int end){
        System.out.println("index "+start+" "+end);
        if(start == end)
           return true;
        if(str.charAt(start)!=str.charAt(end))
           return false;
        return isPalindromeRec(str,start+1,end-1);      
    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int n = str.length();
        System.out.println("n "+n);
       return isPalindromeRec(str, 0,n-1);
    }

    public static void main(String[] args) {
        System.out.println("nice "+isPalindrome("sucuhhucus"));
    }
}
