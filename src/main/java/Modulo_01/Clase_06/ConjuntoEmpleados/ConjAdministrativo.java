package Modulo_01.Clase_06.ConjuntoEmpleados;

import Modulo_01.Clase_06.ListaEmpleados.Empleado;

public class ConjAdministrativo extends Empleado {

    private boolean presentismo;

    public ConjAdministrativo(int legajo, String nombre, double sueldoBasico, boolean presentismo) {
        super(legajo, nombre, sueldoBasico);
        this.presentismo = presentismo;
    }

    public boolean isPresentismo() {
        return presentismo;
    }

    public void setPresentismo(boolean presentismo) {
        this.presentismo = presentismo;
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBasico() * (presentismo ? 1.13 : 1);
    }
}
