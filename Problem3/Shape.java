package Problem3;
import java.text.DecimalFormat;

abstract class Shape {
    protected String name;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Shape(String name) {
        this.name = name;
    }

    public abstract double computeArea();

    public abstract double computePerimeter();

    @Override
    public String toString() {
        return name + "\n" +
               "Area = " + df.format(computeArea()) + "\n" +
               "Perimeter = " + df.format(computePerimeter());
    }
}
