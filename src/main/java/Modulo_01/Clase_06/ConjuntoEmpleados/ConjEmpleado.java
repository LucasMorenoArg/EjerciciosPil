package Modulo_01.Clase_06.ConjuntoEmpleados;

public abstract class ConjEmpleado {
    double diasTrabajados;
    double valorDia;
    double sueldo;

    public ConjEmpleado() {
    }

    public ConjEmpleado(double sueldo) {
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
