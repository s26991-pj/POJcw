public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        super();
        height = 4.0;
    }

    public Cylinder(double r, double h) {
        super(r);
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public String toString() {
        return "Cylinder[height=" + height + "," + super.toString() + "]";
    }

}
