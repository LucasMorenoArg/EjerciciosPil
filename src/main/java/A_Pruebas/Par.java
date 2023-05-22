package A_Pruebas;

import java.util.Collections;

public class Par<T extends Comparable> {

    private T c1, c2;

    public Par(T c1, T c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public T getC1() {
        return c1;
    }

    public void setC1(T c1) {
        this.c1 = c1;
    }

    public T getC2() {
        return c2;
    }

    public void setC2(T c2) {
        this.c2 = c2;
    }

    @Override
    public String toString() {
        return "Par{" +
                "c1=" + c1 +
                ", c2=" + c2 +
                '}';
    }

    public boolean iguales (){

        return c1.equals(c2);
    }

    public boolean distintos(){

        return !iguales();
    }

    public boolean ascendentes(){
        return c1.compareTo(c2) <0;
    }

    public boolean descendentes(){
        return c1.compareTo(c2) <0;
    }

    /*public Comparable<Par>(){
        Collections.sort(c1.compareTo(c2));
    }*/

}
