package SistemaAlquiler;
import java.time.LocalDate;

public abstract class ProductoAlquilado {
     
    protected int identificador;


    public ProductoAlquilado(int identificador){
        this.identificador= identificador;
    }


    public abstract boolean estaDisponible();

    public abstract Alquiler alquilar(Cliente cl, LocalDate fechaVencimiento);
    
}
