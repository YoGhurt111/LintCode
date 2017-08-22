public class BackPackII{
  public static void main(String[] args) {
    int[] A = {2,3,5,7};
    int[] V = {1,5,2,4};
    int m = 10;
    System.out.println(backPackII(m,A,V));
  }

  public static int backPackII(int m, int[] A, int[] V){
    if (A.length == 0 || V.length == 0 || A.length != V.length) {
      return 0;
    }
    int[][] max = new int[A.length+1][m+1];
    for (int i=0; i <= m; i++) {
      max[0][i] = 0;
    }
    for (int i = 1; i <= A.length; i++) {
      for (int j = 0; j <= m; j++) {
        max[i][j] = max[i-1][j];
        if (j >= A[i-1] && (max[i-1][j-A[i-1]] + V[i-1] > max[i-1][j])) {
          max[i][j] = max[i-1][j-A[i-1]] + V[i-1];
        }
      }
    }
    return max[A.length][m];
  }

}
