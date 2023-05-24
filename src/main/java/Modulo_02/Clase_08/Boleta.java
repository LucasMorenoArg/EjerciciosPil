package Modulo_02.Clase_08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Boleta {

    private HashSet<Integer> numeros = new HashSet<>();

    public HashSet<Integer> getNumeros() {
        return numeros;
    }

    public void agregarNumero(int num){
        numeros.add(num);
    }

}


