// LeetCode Binary Tree Inorder Traversal #94
import java.util.*;
public class InorderTraversal{
  public static void main(String[] args) {

  }

  public static List<Integer> inorderTraversal(TreeNode root){
    List<Integer> list = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    if (root == null) {
      return list;
    }
    TreeNode temp = root;
    while(temp != null || !stack.empty()){
      while(temp != null){
        stack.push(temp);
        temp = temp.left;
      }
      temp = stack.pop();
      list.add(temp.val);
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
