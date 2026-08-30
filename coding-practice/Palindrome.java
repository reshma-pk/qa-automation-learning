//Given a string, return true if it's a palindrome, ignoring case and non-alphanumeric characters 
//(e.g., "A man, a plan, a canal: Panama" → true). Don't use a built-in reverse — write the check yourself.

public class Palindrome {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while(left < right) {

            while(left < right & !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }

            while(left < right & !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
        left++;
        right--;
        }
    return true;
    }
public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    System.out.println(isPalindrome("Hello"));
    }
}