import java.util.LinkedList;

public class LinkedListExample{
  public static void main(String[] args) {
      // create LinkedList of employees
      LinkedList<String> employess = new LinkedList<>();

      employess.add("John");
      employess.add("Radhey");
      employess.add("Rohan");
      employess.add("Sneh");

      System.out.println(employess);

      System.out.println("");

      System.out.println("Get First: "+employess.getFirst());
      System.out.println("Get Last: "+employess.getLast());
      System.out.println("Get index 2: "+employess.get(2));

      for(String s:employess){
        System.out.print(s+" ");
      }

      employess.set(2,"Upwan");

      employess.remove();
      employess.remove("John");
      employess.remove(1);
      employess.removeFirst();
      employess.removeLast();

  }
}