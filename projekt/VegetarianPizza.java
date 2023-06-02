public class VegetarianPizza extends BasePizza {
    // klasa reprezentująca pizzę wegetariańską
    public VegetarianPizza() {
        //przekazanie do konstruktora klasy bazowej nazwy pizzy, składników, poziomu ostrości i cen
        super("Wegetariańska", new String[]{"szpinak", "pomidor", "sos", "ser"}, 0,
                new double[]{25.0, 30.0, 35.0});
    }
}
