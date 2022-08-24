package SistemaAlquiler;
import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula  extends ProductoAlquilado{

    private String pelicula;
    private String informacion;
    private int cantidadCopias;
    private ArrayList<Alquiler> alquilerVigente;
    
    public Pelicula(int identificador, String pelicula, int cantidadCopias){
        super(identificador);
        this.pelicula = pelicula;
        this.cantidadCopias = cantidadCopias;
        this.informacion =informacion; 
        alquilerVigente = new ArrayList<>();
    }

    public String getPelicula(){
        return this.pelicula;
    }

    public void setPelicula(String pelicula){
        this.pelicula = pelicula;
    }

    public String getInformacion(){
        return this.informacion;
    }

    public void setInformacion(String informacion){
        this.informacion = informacion;
    }

    public int getCantidadCopias(){
        return this.cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias){
        this.cantidadCopias = cantidadCopias;
    }

    public void addAlquiler(Alquiler alq){
        if(this.estaDisponible()){
            alquilerVigente.add(alq);
        } 
    }

    @Override
    public Alquiler alquilar(Cliente cl , LocalDate fechaVencimiento ){
        if(this.estaDisponible()){
            Alquiler alquilado = new Alquiler(cl, fechaVencimiento, this);
            this.addAlquiler(alquilado);
            cl.addAlquiler(alquilado);
            System.out.println("pelicula..."+cl);
            return alquilado;
        }
        else{
            return null;
        }
    }

    @Override
    public boolean estaDisponible(){
        if(cantidadCopias > alquilerVigente.size()){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "\n\tPelicula: "+getPelicula()+ "\n\tInformacion: "+getInformacion()+"\n\tCopias disponibles: "+ getCantidadCopias();
    }
}
