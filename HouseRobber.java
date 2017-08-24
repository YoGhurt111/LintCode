// LintCode 打劫房屋
public class HouseRobber{
  public static void main(String[] args) {
    int[] A = {3,8,4,1,5};
    System.out.println(houseRobber(A));
  }

  public static long houseRobber(int[] A){
    if (A.length == 0) {
      return 0;
    }
    long[] dp = new long[A.length+1];
    dp[0] = 0;
    dp[1] = A[0];
    long max = dp[1];
    for (int i=2; i<=A.length; i++) {
      dp[i] = dp[i-1];
      if (dp[i-2] + A[i-1] > dp[i]) {
        dp[i] = dp[i-2] + A[i-1];
      }
      if (max < dp[i]) {
        max = dp[i];
      }
    }
    return max;
  }
}
