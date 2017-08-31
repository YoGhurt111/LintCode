// LeetCode 3Sum #15
import java.util.*;
public class ThreeSums{

  private static List<List<Integer>> resList = new ArrayList<List<Integer>>();

  public static void main(String[] args) {
    int[] nums = {0,0,0};
    System.out.println(threeSum(nums).toString());
  }


  public static List<List<Integer>> threeSum(int[] nums){
    if (nums == null || nums.length < 3) {
      return resList;
    }
    Arrays.sort(nums);
    for (int  i=0; i<nums.length-2; i++) {
      // 避免加入重复集合
      if (i > 0 && nums[i] == nums[i-1]) {
        continue;
      }
      twoSum(nums,i+1,nums.length-1,nums[i]);
    }
    return resList;
  }


  public static void twoSum(int[] nums, int begin, int end, int target){
    int i = begin;
    int j = end;
    while(i<j){
      if (nums[i] + nums[j] + target == 0) {
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(target);
        temp.add(nums[i]);
        temp.add(nums[j]);
        resList.add(temp);
        while(i < j && nums[i] == nums[i+1]){
          i++;
        }
        while(i < j && nums[j] == nums[j-1]){
          j--;
        }
        i++;
        j--;
      }
      else if (nums[i] + nums[j] + target < 0){
        i++;
      }
      else{
        j--;
      }
    }
  }
}
