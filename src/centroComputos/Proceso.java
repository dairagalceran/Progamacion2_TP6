package centroComputos;

public class Proceso extends ElementoComparable{
    private String nombre;
    private int reqMemoria;

    public Proceso(String nombre, int reqMemoria) {
        this.nombre = nombre;
        this.reqMemoria = reqMemoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getReqMemoria() {
        return reqMemoria;
    }



    @Override
    public String toString() {
        return "Proceso{" +
                "nombre='" + nombre + '\'' +
                ", reqMemoria=" + reqMemoria +
                '}';
    }

    @Override
    public boolean esMayor(ElementoComparable otroElemento) {
        return this.getReqMemoria() > ((Proceso) otroElemento).getReqMemoria();
    }
}
