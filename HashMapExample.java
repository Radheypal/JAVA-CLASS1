import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Mango");
        map.put(5, "Orange");

        System.out.println("HashMap: " + map);

        System.out.println("Get key 3: " + map.get(3));
        System.out.println("Contains key 2: " + map.containsKey(2));
        System.out.println("Contains value 'Mango': " + map.containsValue("Mango"));
        System.out.println("Size: " + map.size());
        System.out.println("Is Empty: " + map.isEmpty());

        map.remove(4);
        System.out.println("After removing key 4: " + map);

        map.replace(5, "Grapes");
        System.out.println("After replacing key 5: " + map);

        System.out.println("Key Set: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entry Set: " + map.entrySet());

        map.clear();
        System.out.println("After clear: " + map);

        HashMap<Integer, String> newMap = new HashMap<>();
        newMap.put(10, "Red");
        newMap.put(20, "Blue");
        newMap.put(30, "Green");
        newMap.put(40, "Yellow");

        System.out.println("\nUsing Iterator:");
        Iterator<Map.Entry<Integer, String>> iterator = newMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}