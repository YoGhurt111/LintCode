import java.util.ArrayList;
// 《剑指Offer》 二叉搜索树的后序遍历序列
public class VerifySquenceOfBST{
  public static void main(String[] args) {
    // int[] a = {5,7,6,9,11,10,8};
    int[] a = {7,4,6,5};
    System.out.println(verify(a));
  }

  public static boolean verify(int[] sequence){
    if (sequence.length == 0) {
      return false;
    }
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < sequence.length; i++) {
      list.add(sequence[i]);
    }
    return verify(list);
  }

  public static boolean verify(ArrayList<Integer> list){

    boolean left = true;
    boolean right = true;
    ArrayList<Integer> leftList = new ArrayList<Integer>();
    ArrayList<Integer> rightList = new ArrayList<Integer>();
    int i = 0;
    int n = list.size() - 1;
    while(i < list.size() && list.get(i) < list.get(n)){
      leftList.add(list.get(i));
      i++;
    }
    for (int j = i; j < n; j++) {
      if (list.get(j) < list.get(n)) {
        return false;
      }
      rightList.add(list.get(j));
    }
    if (leftList.size() != 0) {
      left = verify(leftList);
    }
    if (rightList.size() != 0) {
      right = verify(rightList);
    }
    return left && right;
  }
}
