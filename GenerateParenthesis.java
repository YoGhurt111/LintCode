// LeetCode Generate Parentheses #22
import java.util.*;
public class GenerateParenthesis{
  public static void main(String[] args) {
    for (String s : generateParenthesis(3)) {
      System.out.println(s);
    }
  }

  public static List<String> generateParenthesis(int n) {
    List<String> parenthesesList = new ArrayList<String>();
    backtrack(parenthesesList,0,0,"",n);
    return parenthesesList;
  }

  public static void backtrack(List<String> list, int left, int right, String temp, int n){
    if (temp.length() == n*2) {
      list.add(temp);
      return;
    }
    if (left < n) {
      backtrack(list,left+1,right,temp+"(",n);
    }
    if (right < left) {
      backtrack(list,left,right+1,temp+")",n);
    }
  }
}
