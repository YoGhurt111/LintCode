// LintCode 最长公共子序列
public class LCS{
  public static void main(String[] args) {
    String l1 = "ABCD";
    String l2 = "EDCA";
    System.out.println(longestCommonSubsequence(l1,l2));
  }

  public static int longestCommonSubsequence(String A, String B){
    char[] a = A.toCharArray();
    char[] b = B.toCharArray();
    int[][] maxCommon = new int[a.length+1][b.length+1];
    for (int i=0; i<=a.length; i++) {
      maxCommon[0][i]=0;
      maxCommon[i][0]=0;
    }
    for (int i=1; i<=a.length; i++) {
      for (int j=1; j<=b.length; j++) {
        if (a[i-1] == b[j-1]) {
          maxCommon[i][j] = maxCommon[i-1][j-1] + 1;
        }
        else if (maxCommon[i-1][j] >= maxCommon[i][j-1]) {
          maxCommon[i][j] = maxCommon[i-1][j];
        }
        else{
          maxCommon[i][j] = maxCommon[i][j-1];
        }

      }
    }
    return maxCommon[a.length][b.length];
  }
}
