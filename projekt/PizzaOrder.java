public class PizzaOrder {
    //klasa PizzaOrder przechowująca informacje o zamówieniu
    private Pizza pizza;
    private int quantity;
    private Size size;
    private boolean delivery;

    public PizzaOrder(Pizza pizza, int quantity, Size size, boolean delivery) {
        //konstruktor klasy PizzaOrder
        this.pizza = pizza;
        this.quantity = quantity;
        this.size = size;
        this.delivery = delivery;
    }

    public double getTotalPrice() {
        //metoda getTotalPrice
        double pizzaPrice = pizza.getPrice(size);
        double totalPrice = pizzaPrice * quantity;
        if (delivery) {
            totalPrice += calculateDeliveryFee();
        }
        return totalPrice;
    }

    private double calculateDeliveryFee() {
        // Logika obliczania opłaty za dostawę

        double deliveryFee = 5.0;
        return deliveryFee;
    }

    // Gettery i settery

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }
}