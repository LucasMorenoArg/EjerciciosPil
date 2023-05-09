package ClaseTres;

    public class Linea extends Coordenada{
        private double p1;
        private double p2;



        public Linea (double x, double y,double p1,double p2){
            super(x,y);
            this.p1=p1;
            this.p2=p2;
        }

        public double moverLineaDerecha (double valor){
            return x+valor;
        }

        public double moverLineaIzquierda(double valor){
            return x-valor;
        }

        public double moverLineaSubir(double valor){
            return y+valor;
        }

        public double moverLineaBajar(double valor){
            return y-valor;
        }

        public double getP1(){
            return p1;
        }

        public double getP2(){
            return p2;
        }

        public void setP1(double p1){
            this.p1=p1;
        }

        public void setP2(double p2){
            this.p2=p2;
        }
    }

