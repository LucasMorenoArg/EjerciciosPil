package Modulo_02.Clase_08;

import Modulo_02.Clase_07.Empl;

import java.util.ArrayList;
import java.util.Random;

public class Carton {

    private Integer num1;
    private Integer num2;
    private Integer num3;
    private Integer num4;
    private Integer num5;
    private Integer num6;

    private ArrayList<Integer> carton = new ArrayList<>();



    public Carton(Integer num1, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.num6 = num6;
    }
    public Carton() {
        carton= new ArrayList<>();
    }

    public void agregarEmpleado(Integer e){
        carton.add(e);
    }







    public void jugadas(){
            Random r =new Random();
            ArrayList<Integer> num=new ArrayList<>();
            Integer x;
            for (int i=0; i< 6; i++){
                x=r.nextInt(0,6);
                num.add(x);
            }
            System.out.println(num);
        }
 }

