package QuintaClase;

public class Vendedor extends Empleado {

    public Vendedor() {
    }

    public Vendedor(double sueldo) {
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
        return "Vendedor{}";
    }
}
