import java.util.Stack;

// 《剑指Offer》 包含min函数的栈
public class StackIncludeMin{
  private static Stack<Integer> mainStack = new Stack<Integer>();
  private static Stack<Integer> minStack = new Stack<Integer>();

  public static void main(String[] args) {
    StackIncludeMin sim = new StackIncludeMin();
    sim.push(3);
    System.out.println(sim.min());
    sim.push(4);
    System.out.println(sim.min());
    sim.push(2);
    System.out.println(sim.min());
    sim.push(3);
    System.out.println(sim.min());
    sim.pop();
    System.out.println(sim.min());
    sim.pop();
    System.out.println(sim.min());
    sim.pop();
    System.out.println(sim.min());
    sim.push(0);
    System.out.println(sim.min());
  }

  public void push(int node) {
        mainStack.push(node);
        if (minStack.empty() || node <= minStack.peek()) {
          minStack.push(node);
        }else{
          minStack.push(minStack.peek());
        }
    }

    public void pop() {
        mainStack.pop();
        minStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
