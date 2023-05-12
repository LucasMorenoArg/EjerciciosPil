package QuintaClase;

public class Administrativo extends Empleado{

    public Administrativo() {
    }

    public Administrativo(double sueldo) {
        super(sueldo);
    }

    @Override
    public double getSueldo() {
        return super.getSueldo();
    }

    @Override
    public void setSueldo(double sueldo) {
        super.setSueldo(sueldo);
    }

    @Override
    public String toString() {
        return "Administrativo{}";
    }
}
