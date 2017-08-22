// LintCode 背包问题
public class BackPack{
  public static void main(String[] args) {
    int m = 12;
    int[] a = {2,3,5,7};
    System.out.println(backPack(m,a));
  }

  /** v[i][m]到第i个物品为止，在m容量下能装的最大重量
    * v[i][m]=max{v[i-1][m-A[i]]+A[i], v[i-1][m]}
    **/
  public static int backPack(int m, int[] A){
    if (A.length == 0) {
      return 0;
    }
    int max = 0;
    int[][] v = new int[A.length+1][m+1];
    for (int i=0; i <= m; i++) {
      v[0][i] = 0;
    }
    for (int i = 1; i <= A.length; i++) {
      for (int j = 0; j <= m; j++) {
        v[i][j] = v[i-1][j];
        if (j >= A[i-1] && (v[i-1][j-A[i-1]] + A[i-1] > v[i-1][j])) {
          v[i][j] = v[i-1][j-A[i-1]] + A[i-1];
        }
      }
    }
    return v[A.length][m];
  }
}
