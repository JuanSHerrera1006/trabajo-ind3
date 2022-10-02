package quadraticEc;

public class QuadraticEcuation {

    private double a;
    private double b;
    private double c;
    private final double d;

    public QuadraticEcuation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = Math.pow(b, 2) - 4 * a * c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public boolean isImaginary() {
        return d < 0;

    }

    public String getX1() {
        return String.valueOf((-b / 2 * a) + (Math.sqrt(d) / 2 * a));
    }

    public String getX2() {
        return String.valueOf((-b / 2 * a) - (Math.sqrt(d) / 2 * a));
    }
}
