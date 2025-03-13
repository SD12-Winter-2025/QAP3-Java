package Problem2;

public class Demo {
    public static void main(String[] args) {
        System.out.println("=== Demonstration of Point and MovablePoint Classes ===");

        // Point 1
        System.out.println("\n--- Point 1 ---");
        Point point1 = new Point(); 
        System.out.println("Initial State: " + point1);
        point1.setX(3.0f);
        point1.setY(4.0f);
        System.out.println("After Setting Coordinates: " + point1);

        // Point 2
        System.out.println("\n--- Point 2 ---");
        Point point2 = new Point(6.0f, 8.0f);
        System.out.println("Initial State: " + point2);
        point2.setXY(9.0f, 12.0f);
        System.out.println("After Setting Coordinates: " + point2);

        // MovablePoint 1
        System.out.println("\n--- MovablePoint 1 ---");
        MovablePoint movable1 = new MovablePoint(); 
        System.out.println("Initial State: " + movable1);
        movable1.setSpeed(1.0f, 1.0f);
        System.out.println("After Setting Speed: " + movable1);
        movable1.move();
        System.out.println("After Move: " + movable1);

        // MovablePoint 2
        System.out.println("\n--- MovablePoint 2 ---");
        MovablePoint movable2 = new MovablePoint(2.0f, 3.0f);
        System.out.println("Initial State: " + movable2);
        movable2.setSpeed(0.5f, 0.75f);
        System.out.println("After Setting Speed: " + movable2);
        movable2.move();
        System.out.println("After Move: " + movable2);

        // MovablePoint 3
        System.out.println("\n--- MovablePoint 3 ---");
        MovablePoint movable3 = new MovablePoint(4.0f, 5.0f, 1.0f, 1.5f);
        System.out.println("Initial State: " + movable3);
        movable3.move();
        System.out.println("After First Move: " + movable3);
        movable3.move();
        System.out.println("After Second Move: " + movable3);
    }
}
