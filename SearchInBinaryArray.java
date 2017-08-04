// 牛客网——剑指Offer——二维数组中的查找
public class SearchInBinaryArray{
  public static boolean Find(int target, int [][] array) {
      int row = array.length;
      int col = array[0].length;
      for(int i = 0, j = col - 1; i < row && j >= 0; ){
          if(array[i][j] == target){
            return true;
          }else if(array[i][j] > target){
              j--;
              continue;
          }else{
              i++;
              continue;
          }
      }
      return false;
    }

    public static void main(String[] args){
      int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
      int n = 7;
      System.out.println(Find(n, array));
    }
}
