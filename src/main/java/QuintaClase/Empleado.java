package QuintaClase;

public abstract class Empleado {


    double sueldo;

    public Empleado() {
    }

    public Empleado(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public abstract double calcularSueldo();



    @Override
    public String toString() {
        return "Empleado{" +
                "sueldo=" + sueldo +
                '}';
    }
}
