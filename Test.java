import java.util.ArrayList;
public class Test{
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    test(list);
    System.out.println(list.get(0));
  }

  public static void test(ArrayList list){
    list.add(1);
  }
}
