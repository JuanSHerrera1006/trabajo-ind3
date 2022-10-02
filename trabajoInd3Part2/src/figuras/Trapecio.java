package figuras;
public class Trapecio extends Figura {

    private double bMenor;
    private double bMayor;
    private double altura;

    public Trapecio(double bMenor, double bMayor, double altura) {
        super();
        this.bMenor = bMenor;
        this.bMayor = bMayor;
        this.altura = altura;
    }

    public double getbMenor() {
        return bMenor;
    }

    public double getbMayor() {
        return bMayor;
    }

    public double getAltura() {
        return altura;
    }

    public void setbMenor(double bMenor) {
        this.bMenor = bMenor;
    }

    public void setbMayor(double bMayor) {
        this.bMayor = bMayor;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (bMayor + bMenor) / 2 * altura;
    }

    @Override
    public double calcularPerimetro() {
        double diagonal = Math.sqrt(Math.pow((bMayor - bMenor), 2) + Math.pow(altura, 2));
        return 2 * diagonal + bMayor + bMenor;
    }

}
