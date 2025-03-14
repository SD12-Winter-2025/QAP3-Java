package Problem4;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, Math.sqrt(3) / 2 * side); // Height = √3/2 * side
    }

    @Override
    public String toString() {
        return "Equilateral Triangle with side: " + getBase();
    }
}
