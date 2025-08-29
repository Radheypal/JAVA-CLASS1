
import java.util.ArrayList;

public class array{


  public static class Arraylist{
    int[] arr = new int[5];
    int Size = 0;

    public void add(int ele){
      Size++;
      arr[Size] = ele;
    }
    public int size(){
      return Size;
    }
  }
  public static void main(String[] args) {
      ArrayList arr = new ArrayList();
      arr.add(2);
      arr.add(2);

      System.out.println(arr.size());
  }
}