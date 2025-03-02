package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        Map<Integer, String> map
                = new HashMap<>();
        // add element to map
        map.put(1,"Apple");
        map.put(2,"Water");
        map.put(3, "Drink");
        map.put(4, null);
        map.put(null, null);
        //
        for(Map.Entry<Integer, String> obj: map.entrySet()){
            System.out.println("Key: " + obj.getKey());
            System.out.println("Value: " + obj.getValue());
        }
        // remove element in map by using key of map
        map.remove(4);
//        map.remove(4,null); remove by using both key and value
//        map.clear();// clear all element inside map
        String getElementUsingKey
                = map.get(3);
        System.out.println("All element after deleted: ");
        for(Map.Entry<Integer, String> obj: map.entrySet()){
            System.out.println(obj);
        }


    }
}
