package comparacionObjetos;

import centroComputosInterface.Camion;
import fileSystem.Archivo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class PruebasComparacion {
    public static void main(String[] args) {
        ArrayList<Camion> camiones = new ArrayList<>();
        Camion c1 = new Camion(LocalDate.of(2022, 11, 5));
        Camion c2 = new Camion(LocalDate.of(2022, 10, 5));
        Camion c3 = new Camion(LocalDate.of(2021, 12, 5));
        camiones.add(c1);
        camiones.add(c2);
        camiones.add(c3);

        System.out.println("Camiones antes de ordenar");
        System.out.println(camiones);
        Collections.sort(camiones);
        System.out.println("Camiones despues de ordenar");
        System.out.println(camiones);

        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("hola");
        palabras.add("chau");
        palabras.add("me fui a estudiar para mañana");
        palabras.add("chau");

        Collections.sort(palabras);
        System.out.println(palabras);

        Archivo parcial = new Archivo("parcial", "doc", 1000.5);
        Archivo recuperatorio = new Archivo("recu", "txt", 5000.5);
        Archivo prefi = new Archivo("prefi", "doc", 500.0);

        ArrayList<Archivo> archivos = new ArrayList<>();
        archivos.add(parcial);
        archivos.add(recuperatorio);
        archivos.add(prefi);

        //Ordena la lista que pasamos como parametro, si los objetos guardados son
        //Comparable, usando el criterio definido en el método compareTo
        Collections.sort(archivos);
        System.out.println(archivos);
        System.out.println("------1------");
        
        ComparadorNombre cnombre = new ComparadorNombre();
        System.out.println(cnombre.compare(parcial, recuperatorio));

        /**
         * Ordena la lista que paso como primer parámetro, usando el criterio de
         * comparación que indica el segundo parámetro (Comparator)
         */
        System.out.println("------2------");
        Collections.sort(archivos, cnombre);
        System.out.println(archivos);

        System.out.println("------3------");
        Collections.sort(archivos, new ComparadorTamanio());
        System.out.println(archivos);

        /**
         * Ordena la lista que paso como primer parámetro siguiendo
         * el orden reverso a como está implementado el compareTo del objeto de lista
         */
        System.out.println("------4------");
        Collections.sort(archivos, Collections.reverseOrder());

        /**
         * Ordena la lista que paso como primer parámetro siguiendo
         * el orden reverso a como está implementado el compare del Comparator
         * que paso como parametro al método reverseOrder
         */
        System.out.println("------5------");
        Collections.sort(archivos, Collections.reverseOrder(cnombre));

    }

}
