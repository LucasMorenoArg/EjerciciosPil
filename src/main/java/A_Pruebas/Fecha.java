package A_Pruebas;

public class Fecha {

    private int mes;
    private int dia;
    private int anio;

    public Fecha(int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.anio = año;
    }

/*
    private int comprobarMes( int mesPrueba )
    {
        if ( mesPrueba > 0 && mesPrueba <= 12 ) // valida el mes
            return mesPrueba;
        else // mes es inválido
        {
            System.out.printf(
                    "Mes invalido (%d) se establecio en 1.", mesPrueba );
            return 1; // mantiene el objeto en estado consistente
        } // fin de else
    } // fin del método comprobarMes
    // método utilitario para confirmar el valor apropiado del día, con base en el mes y el año

    private int comprobarDia( int diaPrueba )
    {
        int diasPorMes[] =
                { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        // comprueba si el día está dentro del rango para el mes
        if ( diaPrueba > 0 && diaPrueba <= diasPorMes[ mes ] )
            return diaPrueba;
        // comprueba si es año bisiesto
        if ( mes == 2 && diaPrueba == 29 && ( anio % 400 == 0 ||
                ( anio % 4 == 0 && anio % 100 != 0 ) ) )
            return diaPrueba;
        System.out.printf( "Dia invalido (%d) se establecio en 1.", diaPrueba );
        return 1;  // mantiene el objeto en estado consistente
    } // fin del método comprobarDia*/
    // devuelve un objeto String de la forma mes/dia/anio
    public String toString()
    {
        return String.format( "%d/%d/%d", mes, dia, anio );
    } // fin del método toString




    }//fin de la clase Fecha



