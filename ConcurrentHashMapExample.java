import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Add elements to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Retrieve elements from the map
        System.out.println("Value for key 'One': " + map.get("One"));
        System.out.println("Value for key 'Two': " + map.get("Two"));

        // Iterate over the elements in the map
        map.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });

        // Remove an element
        map.remove("Two");

        // Check if the key is present
        if (map.containsKey("Two")) {
            System.out.println("Key 'Two' is still present.");
        } else {
            System.out.println("Key 'Two' has been removed.");
        }

        // Add a new element
        map.put("Four", 4);

        // Iterate over the updated map
        map.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });
    }
}
