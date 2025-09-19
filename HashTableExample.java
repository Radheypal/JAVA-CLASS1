import java.util.HashMap;

public class HashTableExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "abc");
        map.put(4, "xyz");
        map.put(3, null); // ✅ Allowed in HashMap

        System.out.println("Our HashMap is : " + map);

        // use map instead of table
        System.out.println(map.putIfAbsent(4, "Radhey")); 
    }
}
