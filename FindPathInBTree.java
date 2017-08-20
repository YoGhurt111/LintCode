import java.util.ArrayList;
// 《剑指Offer》二叉树中和为某一值的路径
public class FindPathInBTree{
  private static ArrayList<ArrayList<Integer>> pathList = new ArrayList<ArrayList<Integer>>();
  private static ArrayList<Integer> list = new ArrayList<Integer>();
  public static void main(String[] args) {

  }

  public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    if (root == null) {
      return pathList;
    }
    target -= root.val;
    list.add(root.val);
    if (target == 0 && root.left == null && root.right == null) {
      pathList.add(new ArrayList<Integer>(list);
    }
    if (root.left != null) {
      FindPath(root.left, target);
    }
    if (root.right != null) {
      FindPath(root.right,target);
    }
    target += root.val;
    list.remove(list.size()-1);
    return pathList;
  }



  class TreeNode{
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val){
      this.val = val;
    }
  }
}
