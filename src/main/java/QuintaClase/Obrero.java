package QuintaClase;

public class Obrero extends Empleado {

    public Obrero() {
    }

    public Obrero(double sueldo) {
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
        return "Obrero{" +
                "sueldo=" + sueldo +
                '}';
    }
}
