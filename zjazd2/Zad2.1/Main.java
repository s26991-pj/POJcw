public class Main {
    public static void main(String[] args) {
         class Osoba {
            public String Imie;
            public String Nazwisko;
            public int grupa;
            public String kierunek;
        }
        Osoba osoba = new Osoba();
        osoba.Imie = "Kamil";
        osoba.Nazwisko = "Nowakowski";
        osoba.grupa = 25;
        osoba.kierunek = "Informatyka";

        System.out.println("Imie: " + osoba.Imie);
        System.out.println("Nazwisko: " + osoba.Nazwisko);
        System.out.println("Grupa: " + osoba.grupa);
        System.out.println("Kierunek: " + osoba.kierunek);
    }
}