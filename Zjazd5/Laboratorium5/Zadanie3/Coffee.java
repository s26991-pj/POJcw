package Zadanie3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Coffee {
    public static void main(String[] args) {
        List<String> coffeeList = new ArrayList<>();

        coffeeList.add("espresso");
        coffeeList.add("latte");
        coffeeList.add("cappuccino");
        coffeeList.add("mocha");
        coffeeList.add("auLait");
        coffeeList.add("macchiato");

        System.out.println("Lista :");
        for (String coffee : coffeeList) {
            System.out.println(coffee);
        }

        System.out.println("\nIterator:");
        Iterator<String> iterator = coffeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nforeach: ");
        for (String coffee : coffeeList) {
            System.out.println(coffee.toUpperCase());
        }

        System.out.println("\nPierwsze 4 litery:");
        for (String coffee : coffeeList) {
            if (coffee.length() >= 4) {
                System.out.println(coffee.substring(0, 4));
            }
        }
    }
}
