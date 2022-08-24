package SistemaAlquiler;
import java.time.LocalDate;

public class Alquiler {
    private Cliente cliente;
    private LocalDate fechaInicio , fechaVencimiento;
    private ProductoAlquilado productoAlquilado;

    public Alquiler (Cliente cliente, LocalDate fechaVencimiento, ProductoAlquilado productoAlquilado){
        this.cliente = cliente;
        this.productoAlquilado = productoAlquilado;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaInicio = LocalDate.now();
    }

    public Cliente getCliente(){
        Cliente cl = this.cliente;
        return cl;
    }
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    public ProductoAlquilado getProductoAlquilado() {
        return productoAlquilado;
    }

    
    public boolean estaVencido(){
        LocalDate hoy =  LocalDate.now();
        if(hoy.isAfter(fechaVencimiento)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "\nAlquiler: Producto alquilado. "+this.getProductoAlquilado()+
            "Fecha vencimiento: "+this.getFechaVencimiento();
    }
    
    
}
