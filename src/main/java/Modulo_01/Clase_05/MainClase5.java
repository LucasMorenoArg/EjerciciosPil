package Modulo_01.Clase_05;

public class MainClase5 {

    public static void main(String[] args) {

        Empleado obrero = new Obrero();
        Empleado administrativo = new Administrativo();
        Empleado vendedor = new Vendedor();

        ((Administrativo) administrativo).setDiasTrabajados(20);
        ((Administrativo) administrativo).setValorDia(4000);
        ((Administrativo) administrativo).setPresentismo(true);
        System.out.println("Sueldo total de Administrativo en pesos es igual a $" + administrativo.calcularSueldo());


        ((Obrero) obrero).setDiasTrabajados(20);
        ((Obrero) obrero).setValorDia(4000);
        System.out.println("Sueldo total de obrero en pesos es igual a $" + obrero.calcularSueldo());

        ((Vendedor) vendedor).setDiasTrabajados(20);
        ((Vendedor) vendedor).setValorDia(4000);
        ((Vendedor) vendedor).setVentas(10000);

        System.out.println("Sueldo total de obrero en pesos es igual a $" + vendedor.getSueldo());




    }

}
