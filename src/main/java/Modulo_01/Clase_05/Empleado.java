package Modulo_01.Clase_05;

public abstract class Empleado {

    double diasTrabajados;
    double valorDia;
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
