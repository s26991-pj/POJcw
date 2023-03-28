import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Pomyślałem literę z zakresu od a do z");
        System.out.println("Odgadnij ją: ");

        char wynik = (char) (Math.random() * 26 + 'a');
        char a;
        boolean poprawnosc = false;



        while (!poprawnosc) {
            a = (char) System.in.read();
            while (System.in.available() > 0) {
                System.in.read();
            }

            if (a >= 'a' && a <= 'z') {
                if (a == wynik) {
                    System.out.println("** Brawo! **");
                    poprawnosc = true;
                } else if (a > wynik) {
                    System.out.println("Za dużo!");
                    System.out.println("Spróbuj jeszcze raz: ");
                } else if (a < wynik) {
                    System.out.println("Za mało!");
                    System.out.println("Spróbuj jeszcze raz: ");

                }
            }else {
                System.out.println("Niepoprawny znak");
                System.out.println("Spróbuj jeszcze raz: ");
            }
            System.in.skip(System.in.available());
        }
}
}