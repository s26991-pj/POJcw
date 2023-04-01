public class Circle {
    private double radius;
    private String color;

    Circle() {
        radius = 1.0;
        color = "red";
    }

    Circle(double r) {
        radius = r;
        color = "red";
    }
    Circle(double r, String c) {
        radius = r;
        color = c;
    }
    public String getColor() {
        return color;
    }
    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * radius * Math.PI;
    }
    public void setRadius(double r) {
        this.radius = r;
    }
    public void setColor(String c) {
        this.color = c;
    }
    public String toString() {
        return "Circle: radius = " + this.radius + " color = " + this.color;
    }
}