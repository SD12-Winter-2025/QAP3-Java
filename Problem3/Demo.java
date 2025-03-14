package Problem3;
public class Demo {
    public static void main(String[] args) {
        // Create multiple examples of each shape
        Shape[] shapes = new Shape[] {
            new Circle(5.0),              // Example 1: Circle
            new Circle(3.2),              // Example 2: Circle

            new Ellipse(7.0, 4.0),        // Example 1: Ellipse
            new Ellipse(10.0, 5.0),       // Example 2: Ellipse

            new Triangle(3.0, 4.0, 5.0),  // Example 1: Triangle
            new Triangle(6.0, 8.0, 10.0), // Example 2: Triangle

            new EquilateralTriangle(6.0), // Example 1: Equilateral Triangle
            new EquilateralTriangle(4.5)  // Example 2: Equilateral Triangle
        };

        // Display shapes with formatted details
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1));
            System.out.println("=====");
            System.out.println(shapes[i]);
            System.out.println();
        }
    }
}
