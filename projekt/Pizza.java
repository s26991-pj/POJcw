public interface Pizza {
    //interfejs pozwalający na wybór pizzy
    String getName();
    String[] getIngredients();
    int getSpicinessLevel();
    double getPrice(Size size);
}
