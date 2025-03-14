package Problem4;
public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public void scale(double factor) {
        majorAxis *= factor;
        minorAxis *= factor; // Scale both axes
    }

    @Override
    public String toString() {
        return "Ellipse with major axis: " + majorAxis + " and minor axis: " + minorAxis;
    }
}

