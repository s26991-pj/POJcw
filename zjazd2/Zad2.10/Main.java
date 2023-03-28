public class Main {
    public static void main(String[] args) {
        int potega = 0;
        int wynik = 1;
        int podstawa = 2;
        int wykladnik = 14;
        System.out.println("2 do potęgi " + 0 + " wynosi " + wynik);
                while (potega < wykladnik) {
            wynik = wynik * podstawa;
            potega++;
            System.out.println("2 do potęgi " + potega + " wynosi " + wynik);
        }

    }
}