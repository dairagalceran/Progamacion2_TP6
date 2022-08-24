package fileSystem;

import centroComputos.ElementoComparable;

import javax.swing.text.Element;
import java.time.LocalDate;
import java.util.Objects;

public abstract class ElementoFS {
    private final LocalDate fCreacion;
    private String nombre;
    private LocalDate fModificacion;

    public ElementoFS(String nombre) {
        this.nombre = nombre;
        fCreacion = LocalDate.now();
        fModificacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.setfModificacion(LocalDate.now());
    }

    public LocalDate getfModificacion() {
        return fModificacion;
    }
    protected void setfModificacion(LocalDate fModificacion) {
        this.fModificacion = fModificacion;
    }

    public abstract double getTamanio();
    public abstract int cantidadArchivos();
}
