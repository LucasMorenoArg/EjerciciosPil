package Modulo_02.Clase_07;

import java.util.Comparator;

public class Empleado implements Comparable<Empleado> {


    private int legajo;
    private String nombre;
    private double sueldoBasico;

    @Override
    public int compareTo(Empleado o) {
        return 0;
    }

}
