package Modulo_01.Clase_06.ConjuntoEmpleados;

import Modulo_01.Clase_06.ListaEmpleados.Administrativo;
import Modulo_01.Clase_06.ListaEmpleados.Obrero;
import Modulo_01.Clase_06.ListaEmpleados.Vendedor;

import java.util.ArrayList;

public class ConjuntoEmpleados {

    private ArrayList<ConjEmpleado> conjuntoEmpleados;

    public ConjuntoEmpleados() {
        conjuntoEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(ConjEmpleado e) {
        conjuntoEmpleados.add(e);

    }

    public Double sueldoTotal() {
        double sueldoObrero = 0;
        double sueldoAdmin = 0;
        double sueldoVendedor = 0;


        for (int i = 0; i < conjuntoEmpleados.size(); i++) {

            if (conjuntoEmpleados.get(i) instanceof ConjObrero) {
                sueldoObrero += conjuntoEmpleados.get(i).calcularSueldo();

            }

            if (conjuntoEmpleados.get(i) instanceof ConjAdministrativo) {
                sueldoAdmin += conjuntoEmpleados.get(i).calcularSueldo();

            }

            if (conjuntoEmpleados.get(i) instanceof ConjVendedor) {
                sueldoVendedor += conjuntoEmpleados.get(i).calcularSueldo();

            }

        }

        return sueldoObrero + sueldoAdmin + sueldoVendedor;
    }

    public String cantEmplTipo() {
        int obrero = 0;
        int admin = 0;
        int vendedor = 0;

        for (int i = 0; i < conjuntoEmpleados.size(); i++) {
            if (conjuntoEmpleados.get(i) instanceof Obrero) {
                obrero++;
            }
            if (conjuntoEmpleados.get(i) instanceof Administrativo) {
                admin++;
            }
            if (conjuntoEmpleados.get(i) instanceof Vendedor) {
                vendedor++;
            }
        }
        int total = obrero + admin + vendedor;
        return "Total obreros= " + obrero + " \n" +
                "Total administradores= " + admin + " \n" +
                "Total vendedores= " + vendedor + " \n" +
                "Total empleados " + total;
    }

    public void sueldoMenor() {
        ConjObrero o =null;
        ConjVendedor v =null;
        ConjAdministrativo a =null;

        for (int i = 0; i < conjuntoEmpleados.size(); i++) {

                if (conjuntoEmpleados.get(i) instanceof ConjObrero){
                if (o ==null || conjuntoEmpleados.get(i).calcularSueldo() < o.calcularSueldo()){
                    o = (ConjObrero) conjuntoEmpleados.get(i);
                }}
                if (conjuntoEmpleados.get(i) instanceof ConjVendedor){
                if (v ==null || conjuntoEmpleados.get(i).calcularSueldo() < v.calcularSueldo()) {
                    v = (ConjVendedor) conjuntoEmpleados.get(i);
                }}
                if (conjuntoEmpleados.get(i) instanceof ConjAdministrativo){
                if (a ==null || conjuntoEmpleados.get(i).calcularSueldo() < a.calcularSueldo()){
                    a = (ConjAdministrativo) conjuntoEmpleados.get(i);
                }}
            }


        System.out.println(o);
        System.out.println(v);
        System.out.println(a);



    }

}


