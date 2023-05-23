package Modulo_02.Clase_07;

public class Admin extends Empl {

    private boolean presentismo;

    public Admin(int legajo, String nombre, double sueldoBasico, boolean presentismo) {
        super(legajo, nombre, sueldoBasico);
        this.presentismo = presentismo;
    }

    public boolean isPresentismo() {
        return presentismo;
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Empl o) {
        return super.compareTo(o);
    }
}
