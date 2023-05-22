package A_Pruebas;

public class MainPruebaEmpleado {

    public static void main(String[] args) {


                Fecha nacimiento = new Fecha( 7, 24, 1949 );
                Fecha contratación = new Fecha( 3, 12, 1988 );
                EmpleadoEjercicio empleado = new EmpleadoEjercicio( "Bob", "Blue", nacimiento, contratación );
                System.out.println( empleado );
            } // fin de main
        } // fin de la clase PruebaEmpleado


