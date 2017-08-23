// LintCode 最长上升连续子序列
public class LICS{
  public static void main(String[] args) {
    // int[] A = {5,4,2,1,3};
    int[] A = {5,1,2,3,4};
    System.out.println(longestIncreasingContinuousSubsequence(A));
  }

  public static int longestIncreasingContinuousSubsequence(int[] A){
    if (A.length == 0) {
      return 0;
    }
    int[] maxLength = new int[A.length];
    int max = 1;
    int flag = 0; // 0代表递增序列，1代表递减序列
    int temp = 1;
    for (int i=1; i<A.length; i++) {
      if (flag == 0 && A[i] > A[i-1]) {
        temp ++;
      }
      else if (flag == 1 && A[i] < A[i-1]) {
        temp ++;
      }
      else if (flag == 0 && A[i] < A[i-1]) {
        temp = 2;
        flag = 1;
      }
      else if (flag == 1 && A[i] > A[i-1]) {
        temp = 2;
        flag = 0;
      }
      if (temp > max) {
        max = temp;
      }
    }
    return max;
  }
}
