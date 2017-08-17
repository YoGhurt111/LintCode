import java.util.Stack;

// 《剑指Offer》栈的压入，弹出序列
public class PushOrPopQueue{
    private static Stack<Integer> stack = new Stack<Integer>();

  public static void main(String[] args) {
    int[] pushA = {1,2,3,4,5};
    int[] popA = {4,5,3,2,1};
    // int[] popA = {4,3,5,1,2};
    System.out.println(IsPopOrder(pushA, popA));

  }

  public static boolean IsPopOrder(int[] pushA, int[] popA){
    if (pushA.length == 0 || popA.length == 0 || pushA.length != popA.length) {
      return false;
    }
    int j = 0;
    for (int i = 0; i < popA.length; i++) {
      while(j < pushA.length && (stack.empty() || popA[i] != stack.peek())){
        stack.push(pushA[j]);
        j++;
      }
      if (popA[i] == stack.peek()) {
        stack.pop();
      }

    }
    if (stack.empty()) {
      return true;
    }else{
      return false;
    }
  }
}
