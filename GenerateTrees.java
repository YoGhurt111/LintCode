import java.util.List;
import java.util.ArrayList;

// LintCode 不同的二叉查找树 II
public class GenerateTrees{
  public static void main(String[] args) {
    System.out.println(generateTrees(4).size());
  }

  public static List<TreeNode> generateTrees(int n){

    return createTrees(1,n);
  }

  public static List<TreeNode> createTrees(int start, int end){
    List<TreeNode> list = new ArrayList<TreeNode>();
    if (start > end) {
      list.add(null);
      return list;
    }
    for (int i=start; i<=end; i++) {
      List<TreeNode> left = createTrees(start,i-1);
      List<TreeNode> right = createTrees(i+1, end);
      for (int j=0; j<left.size(); j++) {
        for (int k=0; k<right.size(); k++) {
          TreeNode root = new TreeNode(i);
          root.left = left.get(j);
          root.right = right.get(k);
          list.add(root);
        }
      }

    }
    return list;
  }


  static class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val){
      this.val = val;
      this.left = this.right = null;
    }
  }

}
