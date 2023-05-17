package Modulo_01.Clase_06.ConjuntoEmpleados;

import Modulo_01.Clase_06.ListaEmpleados.Empleado;

public class ConjObrero extends ConjEmpleado{
    int tipo;
    private int diasTrabajados;

    public ConjObrero(int tipo,int legajo, String nombre, double sueldoBasico, int diasTrabajados) {
        super(tipo ,legajo, nombre, sueldoBasico);
        this.diasTrabajados = diasTrabajados;
    }
    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBasico() / 20 * diasTrabajados;
    }

    @Override
    public String toString() {
        return "ConjObrero{" +
                "diasTrabajados=" + diasTrabajados +
                '}';
    }
}

