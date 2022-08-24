package centroComputosInterface;

public class Computadora implements ElementoComparable, Comparable<Computadora>{
    private String nombre;
    private double velocidad;
    private Proceso proceso;

    public Computadora(String nombre, double velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.proceso = null;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void liberarProceso(){
        this.proceso = null;
    }

    public void asignarProceso(Proceso nuevo){
        if (!ocupada())
            proceso = nuevo;
    }

    public boolean ocupada(){
        return proceso!=null;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "nombre='" + nombre + '\'' +
                ", velocidad=" + velocidad +
                "}\n";
    }

    @Override
    public boolean esMayor(ElementoComparable otro) {
        return this.getVelocidad() > ((Computadora) otro).getVelocidad();
    }

    @Override
    public int compareTo(Computadora o) {
        double dif = this.getVelocidad() - o.getVelocidad();
        if (dif>0)
            return 1;
        else if (dif<0)
            return -1;
        else
            return 0;
    }
}
