import java.util.ArrayList;
// 《剑指Offer》-顺时针打印矩阵
public class PrintMatrix {

  public static void main(String[] args) {
    int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    // int[][] matrix = {{1},{2},{3},{4},{5}};
    ArrayList<Integer> list = new ArrayList<Integer>();
    list = printMatrix(matrix);
    for (int i=0; i < list.size(); i++ ) {
      System.out.println(list.get(i));
    }
  }

  public static ArrayList<Integer> printMatrix(int [][] matrix) {
    if (matrix == null) {
      return null;
    }
    int row = matrix.length;
    int col = matrix[0].length;
    int start = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    while (row > 2 * start && col > 2 * start) {
      printMatrixInCircle(matrix, start, list);
      start++;
    }
    return list;
  }

  public static void printMatrixInCircle(int[][] matrix, int start, ArrayList<Integer> list){
    int endX = matrix[0].length-1-start;
    int endY = matrix.length-1-start;
    // 从左到右打印一行
    for (int i = start; i <= endX; i++) {
      list.add(matrix[start][i]);
    }
    // 如果终止行大于起始行，则从上到下打印一列
    if (endY > start) {
      for (int i = start + 1; i <= endY; i++) {
        list.add(matrix[i][endX]);
      }
      // 在前置条件下，如果终止列大于起始列，则从右到左打印一行
      if(endX > start){
        for (int i = endX - 1; i >= start; i--) {
          list.add(matrix[endY][i]);
        }
        // 在前置条件下，如果终止行大于起始行两行以上，在从下到上打印一列
        if (endY - start >= 2) {
          for (int i = endY - 1; i > start; i--) {
            list.add(matrix[i][start]);
          }
        }
      }
    }
  }
}
