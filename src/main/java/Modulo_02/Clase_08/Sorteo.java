package Modulo_02.Clase_08;

import java.util.ArrayList;
import java.util.Random;

public class Sorteo {

    Boleta boleta = new Boleta();
    ArrayList<Boleta> numerosCliente = new ArrayList<>();

    public void comparador(){
        ArrayList<Integer> a = generarSorteo();
        ArrayList<Integer> b = boleta.jugadas();
        System.out.println(a);
        System.out.println(b);
        for (int i=0; i<a.size(); i++){
            for(int j=0; j < b.size(); j++ ){

            }
            System.out.println(a.get(i));
        }


    }
    public ArrayList<Integer> generarSorteo(){
        Random r =new Random();
        ArrayList<Integer> num=new ArrayList<>();
        Integer x;
        for (int i=0; i< 6; i++){
            x=r.nextInt(0,6);
            num.add(x);
        }
       return num;
    }
}
