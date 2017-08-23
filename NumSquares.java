import java.lang.Math;

// LintCode 完美平方
public class NumSquares{
  public static void main(String[] args) {
    int n = 13;
    System.out.println(numSquares(n));
  }

  public static int numSquares(int n){
    int[] d = new int[n+1];
    d[0] = 0;
    d[1] = 1;
    for (int i = 1; i <= n; i++) {
      d[i] = 9999999;
      for (int j = 1; j <= Math.sqrt(i); j++) {
        if (d[i-(int)Math.pow(j,2)] + 1 < d[i]) {
          d[i] = d[i-(int)Math.pow(j,2)] + 1;
        }
      }
    }
    return d[n];
  }
}
