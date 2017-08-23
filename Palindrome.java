import java.lang.Math;

// LintCode 回文数
public class Palindrome{
  public static void main(String[] args) {
    int a = 112;
    System.out.println(isPalindrome(a));
  }

  public static boolean isPalindrome(int num) {
        // write your code here
        int n = Math.abs(num);
        char[] temp = new Integer(n).toString().toCharArray();
        int begin = 0;
        int end = temp.length - 1;
        while(begin < end){
          if (temp[begin] != temp[end]) {
            return false;
          }
          begin++;
          end--;
        }
        return true;
  }
}
