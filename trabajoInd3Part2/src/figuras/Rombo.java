package figuras;
public class Rombo extends Figura {

    private double dMayor;
    private double dMenor;

    public Rombo(double dMayor, double dMenor) {
        super();
        this.dMayor = dMayor;
        this.dMenor = dMenor;
    }

    public double getdMayor() {
        return dMayor;
    }

    public double getdMenor() {
        return dMenor;
    }

    public void setdMayor(double dMayor) {
        this.dMayor = dMayor;
    }

    public void setdMenor(double dMenor) {
        this.dMenor = dMenor;
    }

    @Override
    public double calcularArea() {
        return dMayor * dMenor / 2;
    }

    @Override
    public double calcularPerimetro() {
        double lado = Math.sqrt(Math.pow((dMayor / 2), 2) + Math.pow((dMenor / 2), 2));
        return 4 * lado;
    }

}
