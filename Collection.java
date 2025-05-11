package Raja;
import java.util.*;

public class Collection {
    public static void main(String[] args) {

        // Using ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");  // Duplicates allowed in List
        System.out.println("ArrayList (fruits): " + fruits);

        // Using HashSet
        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Mango");
        uniqueFruits.add("Apple");  // Duplicates not allowed in Set
        System.out.println("HashSet (unique fruits): " + uniqueFruits);

        // Using HashMap
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 100);
        fruitPrices.put("Banana", 40);
        fruitPrices.put("Mango", 60);
        fruitPrices.put("Apple", 120);  // Overwrites previous value
        System.out.println("HashMap (fruit prices): " + fruitPrices);

        // Iterating over ArrayList
        System.out.println("\nIterating ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterating over HashSet
        System.out.println("\nIterating HashSet:");
        for (String fruit : uniqueFruits) {
            System.out.println(fruit);
        }

        // Iterating over HashMap
        System.out.println("\nIterating HashMap:");
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
