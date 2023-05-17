package Modulo_01.Clase_06.ConjuntoEmpleados;

public class ConjAdministrativo extends ConjEmpleado {
    int tipo;
    private boolean presentismo;

    /*public ConjAdministrativo(int tipo,int legajo, String nombre, double sueldoBasico, boolean presentismo) {
        super(tipo,legajo, nombre, sueldoBasico);
        this.presentismo = presentismo;
    }*/

    public ConjAdministrativo(int tipo, boolean presentismo) {
        this.tipo = tipo;
        this.presentismo = presentismo;
    }

    public ConjAdministrativo(double sueldo, int tipo, boolean presentismo) {
        super(sueldo);
        this.tipo = tipo;
        this.presentismo = presentismo;
    }

    public boolean isPresentismo() {
        return presentismo;
    }

    public void setPresentismo(boolean presentismo) {
        this.presentismo = presentismo;
    }

    /*@Override
    public double calcularSueldo() {
        return getSueldoBasico() * (presentismo ? 1.13 : 1);
    }*/

    @Override
    public double calcularSueldo() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
