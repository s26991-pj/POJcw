package Zadanie4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class TestKsiazka {
    public static void main(String[] args) {
        List<Ksiazka> listaKsiazek = new ArrayList<>();

        listaKsiazek.add(new Ksiazka("Ogniem i Mieczem", "Henryk Sienkiewicz", 800));
        listaKsiazek.add(new Ebook("Potop", "Henryk Sienkiewicz", 500, 1024, "PDF"));
        listaKsiazek.add(new KsiazkaPapierowa("Pan Tadeusz", "Adam Mickiewicz", 600, 1834));
        listaKsiazek.add(new Ebook("Dziady", "Adam Mickiewicz", 300, 512, "EPUB"));
        listaKsiazek.add(new KsiazkaPapierowa("Lalka", "Bolesław Prus", 700, 1890));

        System.out.println("Lista książek przed sortowaniem:");
        for (Ksiazka ksiazka : listaKsiazek) {
            System.out.println(ksiazka);
        }

        listaKsiazek.sort(Comparator.comparing(Ksiazka::getTytul));

        System.out.println("\nLista książek po sortowaniu:");
        listaKsiazek.forEach(System.out::println);
    }
}
