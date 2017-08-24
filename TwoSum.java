// LeetCode Two Sum #1

import java.util.Map;
import java.util.HashMap;

public class TwoSum{
  public static void main(String[] args) {
    int[] a = {3,3};
    System.out.println(twoSum(a,6)[0]);
  }

  // public static int[] twoSum(int[] nums, int target){
  //   int[] res = new int[2];
  //   for (int i=0; i<nums.length; i++) {
  //     for (int j=i+1; j<nums.length; j++) {
  //       if (nums[i] + nums[j] == target) {
  //         res[0] = i;
  //         res[1] = j;
  //       }
  //     }
  //   }
  //   return res;
  // }

  /** 时间复杂度O(n)的做法 **/
  public static int[] twoSum(int[] nums, int target){
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    for (int i=0; i<nums.length; i++) {
      int temp = target - nums[i];
      if (map.containsKey(temp)) {
        return new int[]{map.get(temp), i};
      }
      map.put(nums[i],i);
    }
    return new int[]{};
  }
}
