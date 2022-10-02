package figuras;
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(radio, 2) * Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * radio * 2;
    }

}
