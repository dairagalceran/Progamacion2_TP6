
package tp6_ej3_puerto; 

public class Barco extends ElementoComparable {

    private String id;
    private int capacidad;

    public Barco(String id, int capacidad){
        this.id = id;
        this.capacidad = capacidad;
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean comparadoCon(ElementoComparable el){
        return this.getCapacidad() > ((Barco)el).getCapacidad();
    }

    @Override
    public String toString(){
        return "[ Barco: "+ getId() +
                " | Capacidad: "+ getCapacidad() +
                " ];\n";
    }
}
