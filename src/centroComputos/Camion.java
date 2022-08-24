package centroComputos;

import java.time.LocalDate;

public class Camion extends ElementoComparable{
    private LocalDate fechaCarga;

    public Camion(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    @Override
    public boolean esMayor(ElementoComparable otroElemento) {
        return this.getFechaCarga().isBefore( ((Camion)otroElemento).getFechaCarga());
    }

    @Override
    public String toString() {
        return "Camion{" +
                "fechaCarga=" + fechaCarga +
                '}';
    }
}
