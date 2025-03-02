package collectionFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Start1 {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Somnang");
        names.add("Visal");
        names.add("Ratha");
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
