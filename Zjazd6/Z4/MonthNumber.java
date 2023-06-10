import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {

        Map<Integer, String> monthMap = new HashMap<>();
        monthMap.put(1, "Styczen");
        monthMap.put(2, "Luty");
        monthMap.put(3, "Marzec");
        monthMap.put(4, "Kwiecien");
        monthMap.put(5, "Maj");
        monthMap.put(6, "Czerwiec");
        monthMap.put(7, "Lipiec");
        monthMap.put(8, "Sierpien");
        monthMap.put(9, "Wrzesien");
        monthMap.put(10, "Pazdziernik");
        monthMap.put(11, "Listopad");
        monthMap.put(12, "Grudzien");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer miesiaca (1-12): ");
        int monthNumber = scanner.nextInt();


        if (monthNumber >= 1 && monthNumber <= 12) {
            String monthName = monthMap.get(monthNumber);
            System.out.println("Miesiac o numerze " + monthNumber + " to " + monthName + ".");
        } else {
            System.out.println("Podano nieprawidlowy numer .");
        }
    }
}
