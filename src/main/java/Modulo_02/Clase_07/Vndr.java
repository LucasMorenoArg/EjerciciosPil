package Modulo_02.Clase_07;

public class Vndr extends Empl {

    private double totalVentas;

    public Vndr(int legajo, String nombre, double sueldoBasico, double totalVentas) {
        super(legajo, nombre, sueldoBasico);
        this.totalVentas = totalVentas;
    }


    public double getTotalVentas() {
        return totalVentas;
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
