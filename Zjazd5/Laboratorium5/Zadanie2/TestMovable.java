package Zadanie2;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0);
        System.out.println(point);

        point.moveUp();
        point.moveRight();
        System.out.println(point);

        point.moveDown();
        point.moveLeft();
        System.out.println(point);
    }
}