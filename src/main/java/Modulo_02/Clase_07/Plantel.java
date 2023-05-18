package Modulo_02.Clase_07;

import java.util.ArrayList;

public class Plantel {

    private ArrayList<Empl> listaEmpleados;

    public Plantel() {
        listaEmpleados= new ArrayList<>();
    }

    public void agregarEmpleado(Empl e){
        listaEmpleados.add(e);
    }


}
