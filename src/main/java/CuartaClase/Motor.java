package CuartaClase;

public class Motor {

    String serie;
    int velocidad;

    public void funcionando(){
        System.out.println("Rotando");
    }

    public void apagado(){
        System.out.println("Terminar rotacion");
    }

    public class motor{
        String serie;
        int velocidad;

        public void funcionando(){
            System.out.println("Rotando");
        }

        public void apagado(){

            System.out.println("Terminar rotación");
        }

        public static class Licuadora{
          String marca;
          Motor objmotor= new Motor();

          public void Licuar(){
              objmotor.funcionando();
              System.out.println("Licuando");
          }

          public void Apagar(){
              objmotor.apagado();
              System.out.println("Terminó de licuar");
          }
        }
    }







}
