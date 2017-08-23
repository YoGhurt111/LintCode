// LintCode 解码方法
public class NumDecodings{
  public static void main(String[] args) {
    String s = "0";
    System.out.println(numDecodings(s));
  }

  public static int numDecodings(String s){
    if (s == null || s.length() == 0) {
      return 0;
    }
    char[] c = s.toCharArray();
    int[] dp = new int[c.length+1];
    dp[0] = 1;
    dp[1] = c[0] != '0' ? 1 : 0;
    for (int i = 2; i <= c.length; i++) {
      if (c[i-1] != '0') {
        dp[i] = dp[i-1];
      }
      int sumOfTwoNums = (c[i-2] - '0') * 10 + (c[i-1] - '0');
      if (sumOfTwoNums >= 10 && sumOfTwoNums <= 26) {
        dp[i] += dp[i-2];
      }
    }
    return dp[c.length];

  }
}
