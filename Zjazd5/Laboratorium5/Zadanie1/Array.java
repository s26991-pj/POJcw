package Zadanie1;
import java.util.ArrayList;
import java.util.List;

public class Array{
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        List<Integer> evenNumbers = new ArrayList<>();
        int count = 0;
        int number = 2;

        while (count < 50) {
            evenNumbers.add(number);
            count++;
            number += 2;
        }

        for (int i = 0; i < evenNumbers.size(); i++) {
            System.out.println("Index: " + i + ", Number: " + evenNumbers.get(i));
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time: " + totalTime + " milliseconds");
    }
}
