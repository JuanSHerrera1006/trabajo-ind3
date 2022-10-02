package figuras;

public class Triangulo extends Figura {

    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        super();
        this.altura = altura;
        this.base = base;
    }

    public double calcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }

    public String determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
                == calcularHipotenusa())) {
            return "Triángulo equilátero";
        } else if ((base != altura) && (base != calcularHipotenusa())
                && (altura != calcularHipotenusa())) {
            return "Triángulo escaleno";
        } else {
            return "Triángulo isósceles";
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double calcularArea() {
        return (base * altura / 2);
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }

}
