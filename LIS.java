// LintCode 最长上升子序列
public class LIS{
  public static void main(String[] args) {
    int[] test = {5,3,4,8,6,7};
    System.out.println(longestIncreasingSubsequence(test));
  }

  public static int longestIncreasingSubsequence(int[] nums){

    int[] maxLength = new int[nums.length];
    int max = 0;
    for (int i=0; i<maxLength.length; i++) {
      maxLength[i] = 1;
      for (int j=0; j<i; j++) {
        if (nums[j] < nums[i] && maxLength[j]+1 > maxLength[i]) {
          maxLength[i] = maxLength[j]+1;
        }
      }
      if (maxLength[i] > max) {
        max = maxLength[i];
      }
    }
    return max;
  }
}
