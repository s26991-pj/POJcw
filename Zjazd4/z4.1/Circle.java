public class Circle {
    private double radious;
    private String color;
    public Circle() {
        radious = 1.0;
        color = "blue";
    }

    public Circle(double r) {
        radious = r;
        color = "blue";
    }

    public double getRadious() {  // A public method for retrieving the radious
        return radious;
    }

    public double getArea() {
        return radious * radious * Math.PI;
    }

    public String getColor() {
        return color;
    }

    public void setRadious(double r) {
        radious = r;
    }

    public void setColor(String c) {
        color = c;
    }

    public String toString() {
        return "Circle[radius=" + radious + ",color=" + color + "]";
    }


}
