public class PepperoniPizza extends BasePizza {
    // klasa reprezentująca pizzę pepperoni
    public PepperoniPizza() {
        // przekazanie do konstruktora klasy bazowej nazwy pizzy, składników, poziomu ostrości i cen
        super("Pepperoni", new String[]{"salami", "papryka", "sos", "ser"}, 2,
                new double[]{30.0, 35.0, 40.0});
    }
}