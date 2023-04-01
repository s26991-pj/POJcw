public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle c1 has radius of " + c1.getRadius() + " and area of " + c1.getArea() + " and color of " + c1.getColor());
        System.out.println(c1.toString());
        Circle c2 = new Circle(2.0);
        System.out.println("The circle c2 has radius of " + c2.getRadius() + " and area of " + c2.getArea()+ " and color of " + c2.getColor());
        System.out.println(c2.toString());        Circle c3 = new Circle(4.0, "blue");
        System.out.println("The circle c3 has radius of " + c3.getRadius() + " and area of " + c3.getArea()+ " and color of " + c3.getColor());
        System.out.println(c3.toString());        Circle c4 = new Circle(7.0, "green");
        System.out.println("The circle c4 has radius of " + c4.getRadius() + " and area of " + c4.getArea()+ " and color of " + c4.getColor());
        System.out.println(c4.toString());

    }



}