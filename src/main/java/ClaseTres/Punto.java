package ClaseTres;

public class Punto {

    public int x,y;

    public Punto() {
        setX(0);
        setY(0);
    }
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x){
        if(x<0){
            this.x=0;
        } else this.x=x;
    }
    public void setY(int y) {
        if(y<0){
            this.y=0;
        } else this.y=y;
    }

}







