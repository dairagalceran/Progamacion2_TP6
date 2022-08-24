package SistemaAlquiler;
import java.time.LocalDate;


public class Vehiculo extends ProductoAlquilado {
    private String patente;
    private String marca;
    private double kilometros;
    private Alquiler alquilerVigente; 
    

    public Vehiculo(int identificador, String patente, String marca, double  kilometros){
        super(identificador);
        this.patente = patente;
        this.marca = marca;
        this.kilometros = kilometros;
    }

    @Override
    public  Alquiler alquilar(Cliente cl, LocalDate fechaVencimiento){
        if(this.estaDisponible()){
            Alquiler alquilado = new Alquiler(cl, fechaVencimiento, this);
            this.addAlquiler(alquilado);
            System.out.println("this de vehiculo "+this);
            cl.addAlquiler(alquilado);
                return alquilado;
        }else{
            return null;
        }
    }

    @Override
    public boolean estaDisponible(){
        return this.alquilerVigente == null;
    }

    public void addAlquiler(Alquiler alq){ //solo uno no se agrega se cambia valor para verificar
        if(this.estaDisponible()){
            this.alquilerVigente = alq;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getPatente() {
        return patente;
    }

    public double getKilometros() {
        return kilometros;
    }
    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    
       
    public String toString(){
        return "\n\tVehículo: "+this.getMarca()+"\n\tPatente: "+this.getPatente()+"\n\tKilometros: "+ this.getKilometros();
    }
}
