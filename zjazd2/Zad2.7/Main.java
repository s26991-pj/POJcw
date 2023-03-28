import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj promien walca: ");
        Scanner scanner = new Scanner(System.in);
        double promien = scanner.nextDouble();
        System.out.println("Podaj wysokosc walca: ");
        double wysokosc = scanner.nextDouble();
        double objetosc = Math.PI * promien * promien * wysokosc;
        System.out.println("Objetosc walca wynosi " + objetosc);


    }
}