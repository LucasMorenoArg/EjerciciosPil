package Modulo_01.Clase_04;

import Modulo_01.Clase_05.Empleado;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Plantel implements Comparator<Persona> {


       private ArrayList<Persona> personaArrayList = new ArrayList<>();



    public void agregarPersona(Persona persona) {
        personaArrayList.add(persona);
    }



    public Persona personaMayor() {
        Persona personaAux = new Persona(0);
        for(int i=0; i<personaArrayList.size();i++){

            if(personaAux == null|| personaArrayList.get(i).getEdad() > personaAux.getEdad()){
                personaAux=personaArrayList.get(i);
            }
        }

        return personaAux;
    }

    @Override
    public int compare(Persona o1, Persona o2) {
        String nombreCompletoO1 = o1.getNombre() + " " +o1.getApellido();
        String nombreCompletoO2 = o2.getNombre() + " " +o2.getApellido();

        return nombreCompletoO1.compareTo(nombreCompletoO2);
    }

    public List<Persona> ordenarListaPersonas() {
        personaArrayList.sort(this::compare);
        return personaArrayList;
    }
}
