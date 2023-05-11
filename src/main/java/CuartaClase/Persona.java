package CuartaClase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Persona {

    long dni;
    String nombre;
    String apellido;
    int edad;

    double promedio;
    ArrayList<Persona> pers = new ArrayList<>();
    Scanner sc;

    {
        try {
            sc = new Scanner(new File("personas2.txt"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Persona() {
    }
    public Persona(int edad) {
        this.edad = edad;
    }

    public Persona(long dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    public ArrayList<Persona> arrayt() {
        sc.useDelimiter("[\\n\\r;]+");
        while (sc.hasNextLine()) {
            String dni = sc.next();
            Long longDni = Long.parseLong(dni);
            String nombre = sc.next();
            String apellido = sc.next();
            String edad = sc.next();
            int intEdad = Integer.parseInt(edad);
            Persona persona = null;
            persona = new Persona(longDni, nombre, apellido, intEdad);
            pers.add(persona);
        }
        return pers;
    }

    public double promedioEdad(){

        double acum=0;

        return promedio ;
    }
}
