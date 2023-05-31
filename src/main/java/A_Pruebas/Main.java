package A_Pruebas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Córdoba");
        lista.add("Neuquén");

        lista.forEach(list -> System.out.println("Provincias: " + lista));
        listaProv(lista);
    }


    public static void listaProv(List<String> listado) {
        for (String l: listado) {
            System.out.println(l);
        }
    }

}