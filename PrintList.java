import java.util.ArrayList;
import java.util.Stack;
  class ListNode {
        int val;
        ListNode next = null;

       ListNode(int val) {
            this.val = val;
       }
   }


public class PrintList {
    public static void main(String[] args){
        ListNode a = new ListNode(67);
        ListNode b = new ListNode(0);
        ListNode c = new ListNode(24);
        ListNode d = new ListNode(58);
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(printListFromTailToHead(a));
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        int temp;
        while(listNode != null){
            stack.push(listNode.val);
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.empty()){
            temp = stack.pop();
            list.add(temp);
        }
        return list;

    }
}
