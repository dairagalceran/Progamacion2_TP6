package tp6_ej3_puerto;
import java.time.LocalDate;

public class MainPuerto {
    public static void main(String[] args) {

        Puerto cachari = new Puerto();
        ColaEspera camiones = new ColaEspera();
        ColaEspera barcos = new ColaEspera();

        Barco b1 = new Barco("b01", 233333);
        Barco b2 = new Barco("b2",  80000);
        Barco b3 = new Barco("b03", 33333);
        Barco b4 = new Barco("b4",  90000);
        barcos.addElemento(b1);
        barcos.addElemento(b2);
        barcos.addElemento(b4);
        barcos.addElemento(b3);
        System.out.println(barcos);
        cachari.imprimiBarcos(barcos);
 
        Camion c1 = new Camion("c0",  LocalDate.of(2022, 06, 5));
        Camion c2 = new Camion("c02", LocalDate.of(2022, 05, 5));
        Camion c3 = new Camion("c03", LocalDate.of(2022, 03, 5));
        Camion c4 = new Camion("c04", LocalDate.of(2022,05,30));

        camiones.addElemento(c1);
        camiones.addElemento(c2);
        camiones.addElemento(c3);
        camiones.addElemento(c4);

        System.out.println(camiones);
    }
}
