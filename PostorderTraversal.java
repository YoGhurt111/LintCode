// LeetCode Binary Tree Postorder Traversal #145
import java.util.*;
 public class PostorderTraversal{
   public static void main(String[] args) {

   }

   public static List<Integer> postorderTraversal(TreeNode root) {
     LinkedList<Integer>list = new LinkedList<Integer>();
     Stack<TreeNode> stack = new Stack<TreeNode>();
     TreeNode temp = root;
     while(!stack.empty() || temp != null) {
        if(temp != null) {
            stack.push(temp);
            list.addFirst(temp.val);  // Reverse the process of preorder
            temp = temp.right;             // Reverse the process of preorder
        } else {
            temp = stack.pop();
            temp = temp.left;           // Reverse the process of preorder
        }
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
