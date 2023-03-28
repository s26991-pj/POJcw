import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        class Osoba {
            public String Imie;
            public String Nazwisko;
            public int grupa;
            public String kierunek;
        }
        Osoba osoba = new Osoba();
        System.out.println("Podaj imie: ");
        Scanner scanner = new Scanner(System.in);
        osoba.Imie = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        osoba.Nazwisko = scanner.nextLine();
        System.out.println("Podaj numer grupy: ");
        osoba.grupa = scanner.nextInt();
        System.out.println("Podaj kierunek: ");
        Scanner scanner2 = new Scanner(System.in);
        osoba.kierunek = scanner2.nextLine();
        System.out.println(" ");

        System.out.println("Imie: " + osoba.Imie);
        System.out.println("Nazwisko: " + osoba.Nazwisko);
        System.out.println("Grupa: " + osoba.grupa);
        System.out.println("Kierunek: " + osoba.kierunek);
    }
}