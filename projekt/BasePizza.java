public abstract class BasePizza implements Pizza {
    //klasa bazowa dla pizzy  - implementuje interfejs Pizza

    private String name;
    private String[] ingredients;
    private int spicinessLevel;
    private double[] prices;

    public BasePizza(String name, String[] ingredients, int spicinessLevel, double[] prices) {
        //konstruktor klasy bazowej
        this.name = name;
        this.ingredients = ingredients;
        this.spicinessLevel = spicinessLevel;
        this.prices = prices;
    }

    @Override
    public String getName() {
        //metoda zwracająca nazwę pizzy
        return name;
    }

    @Override
    public String[] getIngredients() {
        //metoda zwracająca składniki pizzy
        return ingredients;
    }

    @Override
    public int getSpicinessLevel() {
        //metoda zwracająca poziom ostrości pizzy
        return spicinessLevel;
    }

    @Override
    public double getPrice(Size size) {
        //metoda zwracająca cenę pizzy w zależności od rozmiaru
        switch (size) {
            case SMALL:
                return prices[0];
            case MEDIUM:
                return prices[1];
            case LARGE:
                return prices[2];
            default:
                return 0.0;
        }
    }
}