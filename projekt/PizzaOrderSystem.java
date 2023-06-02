import java.util.Scanner;
public class PizzaOrderSystem {
    //klasa główna
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Wybór pizzy
            System.out.println("Dostępne pizze:");
            Pizza vegetarianPizza = new VegetarianPizza();
            System.out.println("1.   Składniki: " + String.join(", ", vegetarianPizza.getIngredients()));
            System.out.println("   Ostrość: " + vegetarianPizza.getSpicinessLevel());

            System.out.println("2. Pepperoni");
            Pizza pepperoniPizza = new PepperoniPizza();
            System.out.println("   Składniki: " + String.join(", ", pepperoniPizza.getIngredients()));
            System.out.println("   Ostrość: " + pepperoniPizza.getSpicinessLevel());

            System.out.println("3. Capriciosa");
            Pizza capriciosaPizza = new CapriciosaPizza();
            System.out.println("   Składniki: " + String.join(", ", capriciosaPizza.getIngredients()));
            System.out.println("   Ostrość: " + capriciosaPizza.getSpicinessLevel());
            System.out.print("Wybierz numer pizzy: ");
            int pizzaChoice = scanner.nextInt();
            scanner.nextLine(); // Pobranie znaku nowej linii po wprowadzeniu liczby

            Pizza pizza;
            switch (pizzaChoice) {
                case 1:
                    pizza = new VegetarianPizza();
                    break;
                case 2:
                    pizza = new PepperoniPizza();
                    break;
                case 3:
                    pizza = new CapriciosaPizza();
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Wybrano domyślnie pizzę wegetariańską.");
                    pizza = new VegetarianPizza();
            }

            // Wybór rozmiaru
            System.out.println("Dostępne rozmiary:");
            System.out.println("1. Mała");
            System.out.println("2. Średnia");
            System.out.println("3. Duża");
            System.out.print("Wybierz numer rozmiaru: ");
            int sizeChoice = scanner.nextInt();
            scanner.nextLine();

            Size size;
            switch (sizeChoice) {
                case 1:
                    size = Size.SMALL;
                    break;
                case 2:
                    size = Size.MEDIUM;
                    break;
                case 3:
                    size = Size.LARGE;
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Wybrano domyślnie średni rozmiar.");
                    size = Size.MEDIUM;
            }

            // Wybór ilości
            System.out.print("Podaj ilość zamawianych pizz: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            // Wybór dostawy
            System.out.print("Czy zamówienie ma być dostarczone (T/N)? ");
            String deliveryChoice = scanner.nextLine();
            boolean delivery = deliveryChoice.equalsIgnoreCase("T");

            // Tworzenie instancji zamówienia
            PizzaOrder pizzaOrder = new PizzaOrder(pizza, quantity, size, delivery);

            // Wyświetlanie informacji o zamówieniu
            System.out.println("Zamówienie:");
            System.out.println("Pizza: " + pizzaOrder.getPizza().getName());
            System.out.println("Rozmiar: " + pizzaOrder.getSize());
            System.out.println("Ilość: " + pizzaOrder.getQuantity());
            System.out.println("Dostawa: " + (pizzaOrder.isDelivery() ? "Tak" : "Nie"));
            System.out.println("Cena całkowita: " + pizzaOrder.getTotalPrice() + " zł");

            scanner.close();
        }
    }
