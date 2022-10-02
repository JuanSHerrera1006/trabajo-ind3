package equilTriangle;

public class Triangle {

    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return 3 * side;
    }

    public double getAltura() {
        return side * (Math.sqrt(3) / 2);
    }

    public double getArea() {
        return side * getAltura() / 2;
    }

}
