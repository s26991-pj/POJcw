import javax.swing.text.TabableView;
import java.util.Scanner;
import java.lang.Math.*;
import java.lang.Character;
import java.util.InputMismatchException;


import static java.lang.Character.isDigit;


public class Main {
    public static void main(String[] args) {
       System.out.println("Podaj numer zadania");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        switch (a) {
            case 1:
                zadanie_01();
                System.out.println("Czy chcesz kontynuować? (t/n)");
                String b = scan.next();
                if (b.equals("t")) {
                    main(args);
                } else {
                    System.out.println("Koniec");
                }
                break;
            case 2:
                zadanie_02();
                System.out.println("Czy chcesz kontynuować? (t/n)");
                String c = scan.next();
                if (c.equals("t")) {
                    main(args);
                } else {
                    System.out.println("Koniec");
                }
                break;
            case 3:
                zadanie_03();
                System.out.println("Czy chcesz kontynuować? (t/n)");
                String d = scan.next();
                if (d.equals("t")) {
                    main(args);
                } else {
                    System.out.println("Koniec");
                }
                break;
            case 4:
                zadanie_04();
                System.out.println("Czy chcesz kontynuować? (t/n)");
                String e = scan.next();
                if (e.equals("t")) {
                    main(args);
                } else {
                    System.out.println("Koniec");
                }
                break;
            case 5:
                zadanie_05();
                System.out.println("Czy chcesz kontynuować? (t/n)");
                String f = scan.next();
                if (f.equals("t")) {
                    main(args);
                } else {
                    System.out.println("Koniec");
                }
                break;
            case 6:
                zadanie_06();
                System.out.println("Czy chcesz kontynuować? (t/n)");
                String g = scan.next();
                if (g.equals("t")) {
                    main(args);
                } else {
                    System.out.println("Koniec");
                }
                break;
            case 7:
                zadanie_07();
                System.out.println("Czy chcesz kontynuować? (t/n)");
                String i = scan.next();
                if (i.equals("t")) {
                    main(args);
                } else {
                    System.out.println("Koniec");
                }
                break;
            case 8:
                zadanie_08();
                System.out.println("Czy chcesz kontynuować? (t/n)");
                String j = scan.next();
                if (j.equals("t")) {
                    main(args);
                } else {
                    System.out.println("Koniec");
                }
                break;
            case 9:
                zadanie_09();
                System.out.println("Czy chcesz kontynuować? (t/n)");
                String k = scan.next();
                if (k.equals("t")) {
                    main(args);
                } else {
                    System.out.println("Koniec");
                }
                break;
            case 10:
                zadanie_10();
                System.out.println("Czy chcesz kontynuować? (t/n)");
                String l = scan.next();
                if (l.equals("t")) {
                    main(args);
                } else {
                    System.out.println("Koniec");
                }
                break;
            case 11:
                zadanie_11();
                System.out.println("Czy chcesz kontynuować? (t/n)");
                String m = scan.next();
                if (m.equals("t")) {
                    main(args);
                } else {
                    System.out.println("Koniec");
                }
                break;
            case 12:
                zadanie_12();
                System.out.println("Czy chcesz kontynuować? (t/n)");
                String n = scan.next();
                if (n.equals("t")) {
                    main(args);
                } else {
                    System.out.println("Koniec");
                }
                break;
            case 13:
                zadanie_13();
                System.out.println("Czy chcesz kontynuować? (t/n)");
                String o = scan.next();
                if (o.equals("t")) {
                    main(args);
                } else {
                    System.out.println("Koniec");
                }
                break;
            default:
                System.out.println("Błąd");
                System.out.println("Czy chcesz kontynuować? (t/n)");
                String p = scan.next();
                if (p.equals("t")) {
                    main(args);
                } else {
                    System.out.println("Koniec");
                }
                break;
        }

    }


    public static void zadanie_01() {
        System.out.println("zadanie 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        double a = scanner.nextDouble();
        System.out.println("Podaj liczbe");
        double b = scanner.nextDouble();
        double pole1 = a * b;

        System.out.println(pole1);
    }

    public static void zadanie_02() {
        System.out.println("zadanie 2");
        double wynik = Math.sqrt(Math.PI);
        System.out.println(roundTo2DecimalPlace(wynik));
    }

    public static double roundTo2DecimalPlace(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public static void zadanie_03() {
        System.out.println("zadanie 3");
        System.out.println("Podaj dwa wyrazy");
        Scanner scan = new Scanner(System.in);

        String tekst1 = scan.next();
        String tekst2 = scan.next();

        System.out.println("\"%" + tekst2 + " " + tekst1 + "%\"");

    }

    public static void zadanie_04() {
        System.out.println("zadanie 4");
        System.out.println("Podaj trzy liczby");
        Scanner scan = new Scanner(System.in);
        Double a = scan.nextDouble();
        Double b = scan.nextDouble();
        Double c = scan.nextDouble();
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        } else {
            System.out.println("BLAD");


        }
    }

    public static void zadanie_05() {
        System.out.println("zadanie 5");
        System.out.println("Podaj numer miesiąca");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        switch (a) {
            case 1:
                System.out.println("Styczeń: 31 dni");
                break;
            case 2:
                System.out.println("Luty: 28 dni");
                break;
            case 3:
                System.out.println("Marzec: 31 dni");
                break;
            case 4:
                System.out.println("Kwiecień: 30 dni");
                break;
            case 5:
                System.out.println("Maj: 31 dni");
                break;
            case 6:
                System.out.println("Czerwiec: 30 dni");
                break;
            case 7:
                System.out.println("Lipiec: 31 dni");
                break;
            case 8:
                System.out.println("Sierpień: 31 dni");
                break;
            case 9:
                System.out.println("Wrzesień: 30 dni");
                break;
            case 10:
                System.out.println("Październik: 31 dni");
                break;
            case 11:
                System.out.println("Listopad: 30 dni");
                break;
            case 12:
                System.out.println("Grudzień: 31 dni");
                break;
            default:
                System.out.println("Błąd");
                break;
        }

    }

    public static void zadanie_06() {
        System.out.println("zadanie 6");
        System.out.println("Podaj tzry liczby ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if ((a > b) && (a > c) && (b > c)) {
            System.out.println(a + " " + b + " " + c);
            System.out.println(c + " " + b + " " + a);
        } else if ((a > b) && (a > c) && (c > b)) {
            System.out.println(a + " " + c + " " + b);
            System.out.println(b + " " + c + " " + a);
        } else if ((b > a) && (b > c) && (a > c)) {
            System.out.println(b + " " + a + " " + c);
            System.out.println(c + " " + a + " " + b);
        } else if ((b > a) && (b > c) && (c > a)) {
            System.out.println(b + " " + c + " " + a);
            System.out.println(a + " " + c + " " + b);
        } else if ((c > a) && (c > b) && (a > b)) {
            System.out.println(c + " " + a + " " + b);
            System.out.println(b + " " + a + " " + c);
        } else if ((c > a) && (c > b) && (b > a)) {
            System.out.println(c + " " + b + " " + a);
            System.out.println(a + " " + b + " " + c);
        }
    }

    public static void zadanie_07() {
        System.out.println("zadanie 7");
        int[] A;
        System.out.println("n i m ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        A = new int[n];
        int[] B;
        B = new int[m];

        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }
        for (int i = 0; i < m; i++) {
            B[i] = scan.nextInt();
        }
        double skalar = 0.0;
        if (n == m) {
            for (int i = 0; i < n; i++)
                skalar += A[i] * B[i];
            System.out.println(skalar);

        } else {
            System.out.println("Błąd");
        }
    }

    public static void zadanie_08() {
        System.out.println("zadanie 8");
        System.out.println("Podaj liczbę");
        int y;
        do {

            Scanner scan = new Scanner(System.in);
            y = scan.nextInt();
            System.out.println();
        } while (y < 0);
        int j = y;
        int x = 0;
        int z = y - 1;
        int w = y - 2;
        int v = 0;

        //1
        for (int i = 0; i < j; i++) {

            for (int k = 0; k <= x; k++) {
                System.out.print("*");
            }
            System.out.println();
            x++;
        }
        for (int i = 0; i < j; i++) {

            for (int k = 0; k < x; k++) {
                System.out.print("*");
            }
            System.out.println();
            x--;
        }
        //2
        for (int i = 0; i < j; i++) {

            for (int k = 1; k <= x; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= z; k++) {
                System.out.print("*");
            }
            System.out.println();
            x++;
            z--;

        }
        for (int i = 0; i < j; i++) {

            for (int k = 0; k <= w; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= v; k++) {
                System.out.print("*");
            }
            System.out.println();
            w--;
            v++;

        }

    }

    public static void zadanie_09() {
        System.out.println("zadanie 9");
        System.out.println("Podaj slowo ");
        char[] palindrom;
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        palindrom = new char[n.length()];
        for (int i = 0; i < n.length(); i++) {
            palindrom[i] = n.charAt(i);
        }
        int x = 0;
        int y = n.length() - 1;
        int z = 0;

        for (int i = 0; i < n.length(); i++) {
            if (palindrom[x] == palindrom[y]) {
                x++;
                y--;
                z++;
            } else {
                System.out.println("NIE");
                break;
            }
        }
        if (z == n.length())
            System.out.println("TAK");

    }

    public static void zadanie_10() {
        System.out.println("zadanie 10");
        System.out.println("Podaj wymiary tablicy");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] transpozycja = new int[n][m];
        int[][] tab = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpozycja[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tab[j][i] = transpozycja[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void zadanie_11() {
        System.out.println("zadanie 11");
        System.out.println("Podaj zdanie ");
        Scanner scan = new Scanner(System.in);

        String pengram = scan.nextLine();

        int[] tab = new int[26];

        for (int i = 0; i < pengram.length(); i++) {
            if (pengram.charAt(i) == 'a' || pengram.charAt(i) == 'A') {
                tab[0]++;
            } else if (pengram.charAt(i) == 'b' || pengram.charAt(i) == 'B') {
                tab[1]++;
            } else if (pengram.charAt(i) == 'c' || pengram.charAt(i) == 'C') {
                tab[2]++;
            } else if (pengram.charAt(i) == 'd' || pengram.charAt(i) == 'D') {
                tab[3]++;
            } else if (pengram.charAt(i) == 'e' || pengram.charAt(i) == 'E') {
                tab[4]++;
            } else if (pengram.charAt(i) == 'f' || pengram.charAt(i) == 'F') {
                tab[5]++;
            } else if (pengram.charAt(i) == 'g' || pengram.charAt(i) == 'G') {
                tab[6]++;
            } else if (pengram.charAt(i) == 'h' || pengram.charAt(i) == 'H') {
                tab[7]++;
            } else if (pengram.charAt(i) == 'i' || pengram.charAt(i) == 'I') {
                tab[8]++;
            } else if (pengram.charAt(i) == 'j' || pengram.charAt(i) == 'J') {
                tab[9]++;
            } else if (pengram.charAt(i) == 'k' || pengram.charAt(i) == 'K') {
                tab[10]++;
            } else if (pengram.charAt(i) == 'l' || pengram.charAt(i) == 'L') {
                tab[11]++;
            } else if (pengram.charAt(i) == 'm' || pengram.charAt(i) == 'M') {
                tab[12]++;
            } else if (pengram.charAt(i) == 'n' || pengram.charAt(i) == 'N') {
                tab[13]++;
            } else if (pengram.charAt(i) == 'o' || pengram.charAt(i) == 'O') {
                tab[14]++;
            } else if (pengram.charAt(i) == 'p' || pengram.charAt(i) == 'P') {
                tab[15]++;
            } else if (pengram.charAt(i) == 'q' || pengram.charAt(i) == 'Q') {
                tab[16]++;
            } else if (pengram.charAt(i) == 'r' || pengram.charAt(i) == 'R') {
                tab[17]++;
            } else if (pengram.charAt(i) == 's' || pengram.charAt(i) == 'S') {
                tab[18]++;
            } else if (pengram.charAt(i) == 't' || pengram.charAt(i) == 'T') {
                tab[19]++;
            } else if (pengram.charAt(i) == 'u' || pengram.charAt(i) == 'U') {
                tab[20]++;
            } else if (pengram.charAt(i) == 'v' || pengram.charAt(i) == 'V') {
                tab[21]++;
            } else if (pengram.charAt(i) == 'w' || pengram.charAt(i) == 'W') {
                tab[22]++;
            } else if (pengram.charAt(i) == 'x' || pengram.charAt(i) == 'X') {
                tab[23]++;
            } else if (pengram.charAt(i) == 'y' || pengram.charAt(i) == 'Y') {
                tab[24]++;
            } else if (pengram.charAt(i) == 'z' || pengram.charAt(i) == 'Z') {
                tab[25]++;
            }
        }

        if (tab[0] == 0 || tab[1] == 0 || tab[2] == 0 || tab[3] == 0 || tab[4] == 0 || tab[5] == 0 || tab[6] == 0 ||
                tab[7] == 0 || tab[8] == 0 || tab[9] == 0 || tab[10] == 0 || tab[11] == 0 || tab[12] == 0 || tab[13]
                == 0 || tab[14] == 0 || tab[15] == 0 || tab[16] == 0 || tab[17] == 0 || tab[18] == 0 || tab[19] == 0
                || tab[20] == 0 || tab[21] == 0 || tab[22] == 0 || tab[23] == 0 || tab[24] == 0 || tab[25] == 0) {
            System.out.println("FALSE");


        } else {
            System.out.println("TRUE");
        }


    }

    public static void zadanie_12() {
        System.out.println("zadanie 12");
        System.out.println("Podaj liczbe sekund:");
        Scanner scan = new Scanner(System.in);
        Double sekundy = scan.nextDouble();
        System.out.println("Podaj planete:");
        Scanner scan2 = new Scanner(System.in);
        String planeta = scan.next();
        System.out.println();
        switch (planeta) {
            case "Merkury":
                System.out.println(sekundy * 0.2408467/31557600);
                break;
            case "Wenus":
                System.out.println(sekundy * 0.61519726/31557600);
                break;
            case "Mars":
                System.out.println(sekundy * 1.8808158/31557600);
                break;
            case "Jowisz":
                System.out.println(sekundy * 11.862615/31557600);
                break;
            case "Saturn":
                System.out.println(sekundy * 29.447498/31557600);
                break;
            case "Uran":
                System.out.println(sekundy * 84.016846/31557600);
                break;
            case "Neptun":
                System.out.println(sekundy * 164.79132/31557600);
                break;
            case "Ziemia":
                System.out.println(sekundy/31557600);
                break;
            default:
                System.out.println("Nie ma takiej planety");
                break;
        }
    }
    public static void zadanie_13() {
        System.out.println("zadanie 13");
        System.out.println("Podaj wymiar tablicy:");
        Scanner scan = new Scanner(System.in);
        int wymiar = scan.nextInt();
        int[]tab = new int[wymiar];
        System.out.println("Podaj liczby do tablicy:");
        for (int i = 0; i < wymiar; i++) {
            tab[i] = scan.nextInt();
        }
        int max = tab[0];
        for (int i = 0; i < wymiar; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        System.out.println("Najwieksza liczba to: " + max);
    }



}