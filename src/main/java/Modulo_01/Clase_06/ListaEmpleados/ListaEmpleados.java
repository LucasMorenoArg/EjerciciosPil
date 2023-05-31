package Modulo_01.Clase_06.ListaEmpleados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaEmpleados implements Comparator<Empleado>{

    private ArrayList<Empleado> listadoEmpleados;

    public ListaEmpleados() {
        listadoEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        listadoEmpleados.add(e);

    }
    //https://xmind.app/m/te7XjH/
    public Double sueldoTotal() {
        double sueldoObrero = 0;
        double sueldoAdmin = 0;
        double sueldoVendedor = 0;


        for (int i = 0; i < listadoEmpleados.size(); i++) {

            if (listadoEmpleados.get(i) instanceof Obrero) {
                sueldoObrero += listadoEmpleados.get(i).calcularSueldo();

            }

            if (listadoEmpleados.get(i) instanceof Administrativo) {
                sueldoAdmin += listadoEmpleados.get(i).calcularSueldo();

            }

            if (listadoEmpleados.get(i) instanceof Vendedor) {
                sueldoVendedor += listadoEmpleados.get(i).calcularSueldo();

            }

        }

        return sueldoObrero + sueldoAdmin + sueldoVendedor;
    }


    public int presentAdministradores() {
        int presentismo = 0;
        for (int i = 0; i < listadoEmpleados.size(); i++) {

            if (listadoEmpleados.get(i) instanceof Administrativo){
                if (((Administrativo) listadoEmpleados.get(i)).isPresentismo()){
                    presentismo++;
                }
            }

        }return presentismo;
    }

    public String cantEmplTipo(){
        int obrero=0;
        int admin=0;
        int vendedor=0;
        for (int i=0; i<listadoEmpleados.size(); i++){
            if (listadoEmpleados.get(i) instanceof Obrero){
               obrero++;
            }
            if (listadoEmpleados.get(i) instanceof Administrativo){
                admin++;
            }
            if (listadoEmpleados.get(i) instanceof Vendedor){
                vendedor++;
            }
        }
        return "Total obreros= "+obrero +" \n" +
                "Total administradores= "+ admin +" \n"+
                "Total vendedores= "+ vendedor ;
    }

    public String empleados200M(){
        int contador =0;
        for (int i=0; i<listadoEmpleados.size(); i++){
            if (listadoEmpleados.get(i).calcularSueldo()>=150000){
                contador++;
            }
        }
        return "Total 200M" + contador;
    }


    public Empleado sueldoMenor(){
        Empleado sueldoBajo= null;
        for (int i =0; i < listadoEmpleados.size(); i++) {
              if ( sueldoBajo == null || listadoEmpleados.get(i).calcularSueldo() < sueldoBajo.calcularSueldo() ){
                  sueldoBajo = listadoEmpleados.get(i);
              }
            } return sueldoBajo;
        }


        public double promedioObreros(){
        Empleado obrero = null;
        double promedio=0;
        double acum =0;

        for( int i=0; i < listadoEmpleados.size(); i++){
            if (listadoEmpleados.get(i) instanceof Obrero){
               promedio += listadoEmpleados.get(i).calcularSueldo();
               acum++;

            }
        }
        double total=promedio/acum;

        return total;
        }

    /*@Override
    public int compare(ListaEmpleados o1, ListaEmpleados o2) {

        for (:
             ) {
            
        }
        return 0;
    }*/



    @Override
    public int compare(Empleado o1, Empleado o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }


    public List<Empleado> ordenarEmpleados() {
        listadoEmpleados.sort((emp1, emp2) -> (int) (emp1.calcularSueldo() - emp2.calcularSueldo()));


        return listadoEmpleados;
    }
}




