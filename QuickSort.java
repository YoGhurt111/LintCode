// 快速排序
public class QuickSort{
  public static void main(String[] args) {
    int[] array = {6,3,7,4,1};
    sort(array,0,array.length-1);
    for (int i=0; i<array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static int partition(int[] array, int left, int right){
    int key = array[left];
    while(left < right){
      while(array[right] >= key && left < right){
        right--;
      }
      array[left] = array[right];
      while(array[left] <= key && left < right){
        left++;
      }
      array[right] = array[left];
    }
    array[right] = key;
    return right;
  }

  public static void sort(int[] array, int left, int right){
    if (left >= right) {
      return;
    }
    int index = partition(array, left, right);
    sort(array,left,index-1);
    sort(array,index+1,right);
  }
}
