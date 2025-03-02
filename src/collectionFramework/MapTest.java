package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map
                = new HashMap<>();
        // add element to map
        map.put(1,"Apple");
        map.put(2,"Water");
        map.put(3, "Drink");
        System.out.println(map);
        Set<Integer> keys = map.keySet();
        System.out.println("All keys: "  +  keys);
        Collection<String> values = ( map.values());
        System.out.println("All value in map: " + values);

    }
}
