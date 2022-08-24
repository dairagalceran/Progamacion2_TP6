package centroComputosInterface;

import java.time.LocalDate;

public class Camion implements ElementoComparable, Comparable<Camion>{
    private String conductor;
    private LocalDate fechaCarga;

    public Camion(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    @Override
    public boolean esMayor(ElementoComparable otroElemento) {
        return this.getFechaCarga().isAfter( ((Camion)otroElemento).getFechaCarga());
    }

    @Override
    public String toString() {
        return "Camion{" +
                "fechaCarga=" + fechaCarga +
                '}';
    }

    public String getConductor() {
        return conductor;
    }

    @Override
    public int compareTo(Camion otro) {
        /*if (this.getFechaCarga().isAfter( otro.getFechaCarga()))
            return 1000;
        else if (this.getFechaCarga().isBefore( otro.getFechaCarga()))
            return -1;
        return 0;*/
        return this.getFechaCarga().compareTo(otro.getFechaCarga());

        //Si quiero comparar usando el conductor
        //return this.getConductor().compareTo(otro.getConductor());

    }
}
