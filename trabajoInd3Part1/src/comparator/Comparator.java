package comparator;

public class Comparator {

    private double num1;
    private double num2;

    public Comparator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String doComparation() {
        if (num1 == num2) {
            return num1 + " es igual que " + num2;
        } else if (num1 > num2) {
            return num1 + " es mayor que " + num2;
        } else {
            return num1 + " es menor que " + num2;
        }

    }
}
