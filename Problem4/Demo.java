package Problem4;
public class Demo {
    // Static method to scale and display Scalable objects
    public static void scaleAll(Scalable[] objects, double factor) {
        int counter = 1; // To track object numbers
        for (Scalable obj : objects) {
            System.out.println("Object " + counter + " - " + obj.getClass().getSimpleName());
            System.out.println("-------------------------");
            System.out.println("Before Scaling: " + obj.toString());
    
            obj.scale(factor); // Scale the object
    
            System.out.println("After Scaling: " + obj.toString());
            System.out.println(); // Add a blank line for better spacing
            counter++;
        }
    }
    

    public static void main(String[] args) {
        // Create array of different shapes
        Scalable[] shapes = {
            new Circle(7.0),
            new Ellipse(5.0, 3.0),
            new Triangle(10.0, 4.0),
            new EquilateralTriangle(7.0)
        };

        // Scale all shapes by a factor of 2
        scaleAll(shapes, 2.0);
    }
}
