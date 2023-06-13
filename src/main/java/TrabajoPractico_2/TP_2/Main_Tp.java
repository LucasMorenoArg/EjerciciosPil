package TrabajoPractico_2.TP_2;
//carlos lopez;3;100
//carlos lopez;6
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Tp {


    public static void main(String[] args) throws FileNotFoundException {
        List<PlanPago> listaPLanes = new ArrayList<>();
        ContenedorPlanPago cont = new ContenedorPlanPago(listaPLanes);
        Scanner sc= new Scanner(new File("contribuyente.txt"));
        Scanner scp = new Scanner(new File("pagos.txt"));

        sc.useDelimiter("[\\n\\r;]+");
        while (sc.hasNextLine()){
            String nombre = sc.next();
            int cantCuotas = sc.nextInt();
            double importe = sc.nextDouble();
            cont.agregarPlandePago(nombre,cantCuotas,importe);
        }
        scp.useDelimiter("[\\n\\r;]+");
        while (scp.hasNextLine()){
            String nombre = scp.next();
            int demora = scp.nextInt();
            cont.registraPago(nombre,demora);
        }

        cont.pagosTotal();


    }
}
