import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Orane");
        hashSet.add("Blue");
        hashSet.add("Black");
        hashSet.add("Red");


        System.out.println("HashSet: " + hashSet);


        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);


        System.out.println("Array: ");
        for (String value : array) {
            System.out.println(value);
        }
    }
}
