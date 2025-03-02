package collectionFramework;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Search {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Somnang");
        names.add("Visal".toLowerCase(Locale.ROOT));
        names.add("Ratha");
//        Search Element
       for (String name : names) {
           if (name.equals("VISAL".toLowerCase())) {
               System.out.println(name + "Exit");
           }
       }
       names.remove("Visal");
    }
}
