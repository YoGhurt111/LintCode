// LeetCode Permutations #46
import java.util.*;
public class Permutations{


  public static void main(String[] args) {
    int[] nums = {1,2,3};
    System.out.println(permute(nums));
  }

  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) {
          return list;
        }
        permute(nums,0,list);
        return list;
  }

  public static void permute(int[] nums, int position, List<List<Integer>> list){
    if (position == nums.length-1) {
      List<Integer> temp = new ArrayList<>();
      for (int i=0; i<nums.length; i++) {
        temp.add(nums[i]);
      }
      list.add(temp);
      return;
    }
    for (int i = position; i<nums.length; i++) {
      swap(nums, position,i);
      permute(nums,position+1,list);
      swap(nums,position,i);
    }
  }

  public static void swap(int[] nums, int i, int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
