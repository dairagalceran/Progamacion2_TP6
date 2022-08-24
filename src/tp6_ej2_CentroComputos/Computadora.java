package tp6_ej2_CentroComputos;


public class Computadora extends ElementoComparable {
    
    private String id;
    private double velocidad;
    private Proceso proceso;

    public Computadora(String id, double velocidad){
        this.id = id;
        this.velocidad = velocidad;
        this.proceso = null;
    }

    public String getId() {
        return id;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void liberarProceso(){
        this.proceso = null;
    }

    public void asignarProceso(Proceso pNuevo){
        if(!ocupada()){
            this.proceso = pNuevo;
        }
    }

    public boolean ocupada(){
        return proceso != null;
    }

    @Override
    public String toString(){
        return  "Computadora{" +
        "nombre='" + id + '\'' +
        ", velocidad=" + velocidad +
        "}\n";
    }

    @Override
    public boolean esMayor(ElementoComparable c2){
        return  this.getVelocidad() > ((Computadora)c2).getVelocidad();
    }
}
