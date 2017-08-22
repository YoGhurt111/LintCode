// LintCode 背包问题
public class BackPackVI{
  public static void main(String[] args) {
    int[] nums = {8,7,4,3};
    int target = 11;
    System.out.println(backPackVI(nums, target));
  }

  public static int backPackVI(int[] nums, int target){
    if (nums.length == 0) {
      return 0;
    }
    int[] dp = new int[target+1]; //dp[i]代表目标为i时的方法数
    dp[0] = 1;
    for (int i=1; i<=target; i++) {
      for (int j=0; j<nums.length; j++) {
        if (i < nums[j]) {
          continue;
        }
        dp[i] += dp[i-nums[j]];
      }
    }
    return dp[target];
  }
}
