package Modulo_01.Clase_04;

import java.util.ArrayList;
import java.util.List;

public class Plantel {


       private ArrayList<Persona> personaArrayList = new ArrayList<>();



    public void agregarPersona(Persona persona) {
        personaArrayList.add(persona);
    }


    /*public Persona personaMenor(){
        Persona personaMenor = null;
        for (int i=0; i<personaArrayList.size(); i++){

       if(personaArrayList.get(i).getEdad()<100){
            personaMenor = personaArrayList.get(i);}
       }

        return personaMenor;
    }*/

    public Persona personaMayor() {
        Persona personaAux = new Persona(0);
        for(int i=0; i<personaArrayList.size();i++){

            if(personaArrayList.get(i).getEdad() > personaAux.getEdad()){
                personaAux=personaArrayList.get(i);
            }
        }

        return personaAux;
    }

}
