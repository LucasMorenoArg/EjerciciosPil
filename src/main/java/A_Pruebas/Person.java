package A_Pruebas;

public class Person {

    private int dni;
    private String nombre;
    private String apellido;
    private double estaturaEnM;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getEstaturaEnM() {
        return estaturaEnM;
    }

    public void setEstaturaEnM(double estaturaEnM) {
        this.estaturaEnM = estaturaEnM;
    }

    public Person(int dni, String nombre, String apellido, double estaturaEnM) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estaturaEnM = estaturaEnM;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", estaturaEnM=" + estaturaEnM +
                '}';
    }
}
