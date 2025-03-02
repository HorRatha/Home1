package Array;

public class ArrayDuplicat {
    public static void main(String[] args) {
        String [] text = {"s","o","t","r","l","p","j","b","s","a","a","L"};
        for (int i = 0; i < text.length; i++) {
            for (int j = i+1; j < text.length; j++) {
                if (text[i].equalsIgnoreCase(text[j])) {
                    System.out.println("Duplicate: " +  text[i]);
                }
            }
        }
    }
}
