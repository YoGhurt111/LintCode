import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

// 《剑指Offer》从上到下打印二叉树
public class PrintTreeTopToBottom{

  private static ArrayList<Integer> list = new ArrayList<Integer>();


  public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);
    while(queue.peek() != null){
      TreeNode temp = queue.poll();
      list.add(temp.val);
      if (temp.left != null) {
        queue.add(temp.left);
      }
      if (temp.right != null) {
        queue.add(temp.right);
      }
    }
    return list;
  }

  class TreeNode{
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
  }
}
