// LeetCode Binary Tree Preorder Traversal #144
import java.util.*;
public class PreorderTraversal{
  public static void main(String[] args) {

  }

  public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp = root;
        while(temp != null || !stack.empty()){
          while(temp != null){
            list.add(temp.val);
            stack.push(temp);
            temp = temp.left;
          }
          temp = stack.pop();
          temp = temp.right;
        }
        return list;
  }

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
