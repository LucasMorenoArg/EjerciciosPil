package A_Pruebas;

public class EmpleadoEjercicio {

  private String primerNombre;
  private String apellidoPaterno;
  private Fecha fechaNacimiento;
  private Fecha fechaContratacion;

    // constructor para inicializar nombre, fecha de nacimiento y fecha de contratación
    public EmpleadoEjercicio( String nombre, String apellido, Fecha fechaDeNacimiento,
                     Fecha fechaDeContratacion )
    {
         primerNombre = nombre;
         apellidoPaterno = apellido;
         fechaNacimiento = fechaDeNacimiento;
         fechaContratacion = fechaDeContratacion;
         } // fin del constructor de Empleado


}// fin de la clase empleado.
