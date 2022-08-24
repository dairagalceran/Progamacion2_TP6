package fileSystem;

import centroComputos.ElementoComparable;

import java.time.LocalDate;

public class Archivo extends ElementoFS implements Comparable<Archivo>{
    private double tamanio;
    private String extension;

    public Archivo(String nombre, String extension, double tamanio) {
        super(nombre);
        this.extension = extension;
        this.tamanio = tamanio;
    }

    @Override
    public double getTamanio() {
        return tamanio;
    }

    @Override
    public int cantidadArchivos() {
        return 1;
    }

    public String getExtension() {
        return extension;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
        this.setfModificacion(LocalDate.now());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        try {
            Archivo otro = (Archivo) o;
            return this.getNombre().equals(otro.getNombre()) &&
                    this.getExtension().equals(otro.getExtension());
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getNombre()+"."+this.getExtension()+" ("+this.getTamanio()+"Kb)";
    }

    @Override
    public int compareTo(Archivo o) {
        int resultado = this.getExtension().compareTo(o.getExtension());
        if (resultado == 0)
            return (int) this.getTamanio() - (int) o.getTamanio();
        return resultado;
    }
}
