package tp6_ej3_puerto; 
import java.time.LocalDate;

public class  Camion extends ElementoComparable {
    private String id;
    private LocalDate fechaCarga;
    
    public Camion(String id, LocalDate fechaCarga){
        this.id = id;
        this.fechaCarga = fechaCarga;
    }

    public String getId() {
        return id;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(LocalDate fechaCarga){
        this.fechaCarga = fechaCarga;
    }

    @Override
    public boolean comparadoCon(ElementoComparable el){
        return this.getFechaCarga().isBefore(((Camion)el).getFechaCarga());
    }

    @Override
    public String toString(){
        return "Camiones : [ identificador: "+
            getId() + "| fecha de carga: "+
            getFechaCarga()+
            " ];\n ";
    }


}

