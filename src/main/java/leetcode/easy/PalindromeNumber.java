package leetcode.easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        int a = 667766;
        System.out.println(isPalindrome(a));
    }

    public static boolean isPalindrome(int x) {
    if (x<0){
        return false;
    }
    String num = String.valueOf(x);
        for (int i = 0; i < num.length()/2; i++) {
          if (num.charAt(i) != num.charAt(num.length()-1-i)){
              return false;
          }
        }
        return true;
    }
}
