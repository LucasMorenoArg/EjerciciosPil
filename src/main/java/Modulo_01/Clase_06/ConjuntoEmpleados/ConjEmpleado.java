package Modulo_01.Clase_06.ConjuntoEmpleados;

public abstract class ConjEmpleado {
    int tipo;
    double diasTrabajados;
    double valorDia;
    double sueldoBasico;

    public ConjEmpleado() {
    }

    public ConjEmpleado(double sueldo) {
        this.sueldoBasico = sueldo;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }



    public abstract double calcularSueldo();

    @Override
    public String toString() {
        return "ConjEmpleado{" +
                "tipo=" + tipo +
                ", diasTrabajados=" + diasTrabajados +
                ", valorDia=" + valorDia +
                ", sueldoBasico=" + sueldoBasico +
                '}';
    }
}
