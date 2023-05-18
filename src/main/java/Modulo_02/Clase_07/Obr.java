package Modulo_02.Clase_07;

public class Obr extends Empl {


    private int diasTrabajados;


    public Obr(int legajo, String nombre, double sueldoBasico, int diasTrabajados) {
        super(legajo, nombre, sueldoBasico);
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
