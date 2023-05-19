package A_Pruebas;

import java.util.Comparator;

public class PersonaComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }




}
