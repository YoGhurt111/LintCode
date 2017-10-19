// LeetCode Kth Largest Element in an Array #215
import java.util.*;
public class FindKthLargest{
  public static void main(String[] args) {
    int[] arr = {8,3,4,1,9,7,6,10};
    int k = 3;
    System.out.println(findKthLargest(arr,k));
  }

  public static int findKthLargest(int[]a, int k){
    quickSelect(a,k,0,a.length-1);
    return a[k-1];
  }

/** 解决方法1：分治法。通过类比于快速排序的做法，每次把一个元素交换到正确的位置，再看看这个位置
*** 是否为k-1,如果小于k-1，则从该位置的右边求第k大的数，大于k-1，则求左边的数，等于k-1，则返回
*** 平均时间复杂度为O（n）
**/
  public static void quickSelect(int[] a, int k, int left, int right){
    if(left >= right) return;
    int index = partition(a, left, right);
    if (index < k-1) {
      quickSelect(a,k,index+1,right);
    }else if (index > k-1) {
      quickSelect(a,k,left,index-1);
    }else return;
  }

  public static int partition(int[] array, int left, int right){
    int key = array[left];
    while(left < right){
      while(array[right] <= key && left < right){
        right--;
      }
      array[left] = array[right];
      while(array[left] >= key && left < right){
        left++;
      }
      array[right] = array[left];
    }
    array[right] = key;
    return right;
  }


  /** 解决方法2：维持一个只有k个数的最小堆，每次插入都进行调整，最后返回k个树中最小的树，也就是第k大的数
  *** 如果是构建最大堆的话需要重载比较器，方法如下
  *** Comparator<Integer> cmp = new Comparator<Integer>(){
  ***   public int compare(Integer e1, Integer e2){return e2-e1;}
  *** };
  *** PriorityQueue<Integer> pq = new PriorityQueue<Integer>(cmp);
  *** 平均时间复杂度O(N*logk)
  **/
//   public static int findKthLargest(int[] nums, int k) {
//
//     PriorityQueue<Integer> pq = new PriorityQueue<>();
//     for(int val : nums) {
//         pq.offer(val);
//
//         if(pq.size() > k) {
//             pq.poll();
//         }
//     }
//     return pq.peek();
// }
}
