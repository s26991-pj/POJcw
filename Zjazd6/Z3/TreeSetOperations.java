import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {

        TreeSet<String> tree1 = new TreeSet<>();
        tree1.add("Red");
        tree1.add("Green");
        tree1.add("Blue");
        tree1.add("Yellow");
        tree1.add("Orange");


        System.out.println("Elementy w drzewie1:");
        Iterator<String> iterator1 = tree1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }


        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("Purple");
        tree2.add("White");
        tree2.add("Black");


        System.out.println("Elementy w drzewie2:");
        Iterator<String> iterator2 = tree2.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }


        tree1.addAll(tree2);


        System.out.println("Elementy z drzewa1 po dodaniu elementow z drzewa2:");
        Iterator<String> iterator3 = tree1.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }


        System.out.println("Elementy z drzewa1 w odwrotnej kolejnosci:");
        Iterator<String> descendingIterator = tree1.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }


        System.out.println("First element in tree1: " + tree1.first());
        System.out.println("Ostatni element z drzewa1 " + tree1.last());


        TreeSet<String> tree3 = (TreeSet<String>) tree1.clone();


        System.out.println("Liczba elementów w drzewie1 " + tree1.size());


        boolean isEqual = tree1.equals(tree2);
        System.out.println("Czy elemeny są takie same:  " + isEqual);
    }
}
