package A_Pruebas;

import Modulo_01.Clase_04.PersonaService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main_Pruebas {

    public static void main(String[] args) {


        ArrayList<Person> personas = new ArrayList<>();


        personas.add(new Person(12345,"A","BBB",1.78));
        personas.add(new Person(12333,"Abd","BBB",1.78));
        personas.add(new Person(12111,"Ad","BBB",1.78));
        personas.add(new Person(12000,"Abc","BBB",1.78));

       //Collections.sort(personas, new Comparator<PersonaComparable>());
        Collections.sort(personas,new PersonaComparator());
        for (Person p : personas) {
            System.out.println(p);
        }



    }
}
