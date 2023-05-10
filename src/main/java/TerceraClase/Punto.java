package TerceraClase;

public class Punto {

    private double x;
    private double y;

    // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {

        return "(" + x + ", " + y + ")";
    }

    public double distanciaAlOrigen() {

        return Math.sqrt(x * x + y * y);
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public double calcularDistancia(Punto otroPunto) {
        double x1 = x - otroPunto.getX();
        double y1 = y - otroPunto.getY();
        return Math.sqrt(x1 * x1 + y1 * y1);
    }


    public int calcularCuadrante() {
        if (x > 0.0 && y > 0.0) {
            return 1;
        } else if (x < 0.0 && y > 0.0) {
            return 2;
        } else if (x < 0.0 && y < 0.0) {
            return 3;
        } else if (x > 0.0 && y < 0.0) {
            return 4;
        } else {
            // (x==0.0 || y==0.0)
            return 0;
        }
    }


    }

