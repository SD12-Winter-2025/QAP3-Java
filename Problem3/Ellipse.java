package Problem3;
public class Ellipse extends Shape {
    private double a, b;

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    @Override
    public double computeArea() {
        return Math.PI * a * b;
    }

    @Override
    public double computePerimeter() {
        return Math.PI * Math.sqrt(2 * (a * a + b * b) - ((a - b) * (a - b)) / 2);
    }
}
