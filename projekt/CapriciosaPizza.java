public class CapriciosaPizza extends BasePizza {
    // klasa reprezentująca pizzę capriciosa
    public CapriciosaPizza() {
        //przekazanie do konstruktora klasy bazowej nazwy pizzy, składników, poziomu ostrości i cen
        super("Capriciosa", new String[]{"pieczarki", "szynka", "sos", "ser"}, 1,
                new double[]{28.0, 33.0, 38.0});
    }
}