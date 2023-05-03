public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadious() + " and area of " + c1.getArea()+ " and color of " + c1.getColor());
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadious() + " and area of " + c2.getArea()+ " and color of " + c2.getColor());
        Cylinder cy1 = new Cylinder();
        System.out.println("The cylinder has radius of " + cy1.getRadious() + " and area of " + cy1.getArea() + " and height of " + cy1.getHeight()+ " and color of " + cy1.getColor());
        Cylinder cy2 = new Cylinder(2.0, 3.0);
        System.out.println("The cylinder has radius of " + cy2.getRadious() + " and area of " + cy2.getArea() + " and height of " + cy2.getHeight()+ " and color of " + cy2.getColor());

    }

}