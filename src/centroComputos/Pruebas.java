package centroComputos;

import fileSystem.Archivo;

import java.time.LocalDate;

public class Pruebas {
    public static void main(String[] args) {
        ColaPrioridad camiones = new ColaPrioridad();
        Camion c1 = new Camion(LocalDate.of(2022, 11, 5));
        Camion c2 = new Camion(LocalDate.of(2022, 10, 5));
        Camion c3 = new Camion(LocalDate.of(2021, 12, 5));

        camiones.agregarElemento(c1);
        camiones.agregarElemento(c2);
        camiones.agregarElemento(c3);

        System.out.println(camiones);


        Archivo parcial = new Archivo("parcial", "doc", 1000.5);
        Archivo recuperatorio = new Archivo("recu", "doc", 5000.5);
        Archivo prefi = new Archivo("prefi", "doc", 500.0);


        

    }
}
