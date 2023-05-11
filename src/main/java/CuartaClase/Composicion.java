package CuartaClase;

import java.util.StringTokenizer;

public class Composicion {


    public static void main(String[] args) {
        String shirts=" Blue Shirt, Red Shirt, Black Shirt";

        StringTokenizer st =new StringTokenizer(shirts, ",");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
