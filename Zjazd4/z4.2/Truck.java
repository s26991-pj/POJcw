public class Truck extends Car implements Purchase {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() * 0.9;
        } else {
            return super.getSalePrice();
        }
    }

    @Override
    public String getPurchaseInfo() {
        return "TRUCK: ";
    }
}

