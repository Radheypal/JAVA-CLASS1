import java.util.Vector;
public class VectorExample{
  public static void main(String[] args) {
      Vector<String> vc = new Vector<>(4,1);
      System.out.println(vc.capacity());

      vc.add("1");
      vc.add("2");
      vc.add("3");
      vc.add("4");

      System.out.println(vc.capacity());
      vc.add("5");

      System.out.println(vc.capacity());

      Vector<String> v2 = new Vector<>();
      v2.add("a");
      v2.add("b");
      v2.add("c");

      System.out.println(v2);

      vc.addAll(v2);

      System.out.println(vc);

      System.out.println(vc.firstElement());
      System.out.println(vc.lastElement());
    
      v2.clear();
      System.out.println("Values inside the vector is : "+v2);
  }
}