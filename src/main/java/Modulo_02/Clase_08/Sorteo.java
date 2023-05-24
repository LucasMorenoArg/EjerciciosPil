package Modulo_02.Clase_08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Sorteo {

    HashSet<Integer> resultado = new HashSet<>();

    public HashSet<Integer> getResultado() {
        return resultado;
    }

    public void agregarNumero(int numSorteo){
        resultado.add(numSorteo);
    }

}
