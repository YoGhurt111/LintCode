public class MinCost{
  public static void main(String[] args) {
    int[][] a = {{14,2,11},{11,14,5},{14,3,10}};
    System.out.println(minCost(a));
  }

  public static int minCost(int[][] costs){
    if (costs.length == 0) {
      return 0;
    }
    int m = costs.length;
    int n = costs[0].length;
    int[][] d = new int[m][n];
    for (int i = 0; i<n; i++) {
      d[0][i] = costs[0][i];
    }
    for (int i = 1; i < m; i++) {
      for(int j = 0; j < n; j++){
        d[i][j] = 999999;
        if ((d[i-1][(j+1)%n] + costs[i][j])<d[i][j]) {
          d[i][j] = d[i-1][(j+1)%n] + costs[i][j];
        }
        if ((d[i-1][(j+2)%n] + costs[i][j])<d[i][j]) {
          d[i][j] = d[i-1][(j+2)%n] + costs[i][j];
        }
      }
    }
    int min = d[m-1][0];
    for (int i=1; i<n; i++) {
      if (min > d[m-1][i]) {
        min = d[m-1][i];
      }
    }
    return min;
  }
}
