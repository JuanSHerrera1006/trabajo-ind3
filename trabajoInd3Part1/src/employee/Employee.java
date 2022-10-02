package employee;

public class Employee {

    public String id;
    public String name;
    public int hoursPerMonth;
    public double hourValue;
    public double percentageRetention;

    public Employee(String id, String name, int hoursPerMonth, double hourValue, double percentageRetention) {
        this.id = id;
        this.name = name;
        this.hoursPerMonth = hoursPerMonth;
        this.hourValue = hourValue;
        this.percentageRetention = percentageRetention / 100;
    }

    public double getGrossSalary() {
        return hoursPerMonth * hourValue;
    }

    public double getnetSalary() {
        return ((hoursPerMonth * hourValue) - (hoursPerMonth * hourValue) * percentageRetention);
    }

    @Override
    public String toString() {
        return "El empleado tiene las siguiente caracteristicas:"
                + "\nid: " + id
                + "\nNombres: " + name
                + "\nNumero de horas trabajadas por mes: " + hoursPerMonth
                + "\nValor hora trabajada: " + hourValue
                + "\nPorcentaje de retencion: " + percentageRetention + '%';
    }

}
