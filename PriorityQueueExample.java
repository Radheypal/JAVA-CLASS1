import java.util.*;
public class PriorityQueueExample{
  public static void main(String[] args) {
      PriorityQueue<Integer> pq = new PriorityQueue<>();

      pq.add(30);
      pq.add(20);
      pq.add(10);
      pq.add(40);

      System.out.println(pq);

      System.out.println(pq.offer(25));

      System.out.println(pq.poll());

      System.out.println(pq.remove());

  }
}