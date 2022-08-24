package centroComputosInterface;

import java.time.LocalDate;

public class Pruebas {
    public static void main(String[] args) {
        ColaPrioridad camiones = new ColaPrioridad();
        Camion c1 = new Camion(LocalDate.of(2022, 11, 5));
        Camion c2 = new Camion(LocalDate.of(2022, 10, 5));
        Camion c3 = new Camion(LocalDate.of(2021, 12, 5));

        //Con interfaces, se aplican las mismas reglas de tipos/polimorfismo
        //que con las clases
        ElementoComparable compu = new Computadora("Compu", 100);

        //La linea siguiente compila, pero va a saltar ClassCastException
        //en tiempo de ejecución porque estoy comparando un camión con una computadora
        //System.out.println(c3.esMayor(compu));

        camiones.agregarElemento(c1);
        camiones.agregarElemento(c2);
        camiones.agregarElemento(c3);
        System.out.println();
        System.out.println(camiones);
        System.out.println(c1.compareTo(c2));

        System.out.println(c1.compareTo(c1));






        

    }
}
