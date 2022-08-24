package tp6_ej2_CentroComputos;

public class Proceso  extends ElementoComparable{
    
    private String id;
    private double reqMemoria;

    public Proceso (String id, int reqMemoria){
        this.id = id;
        this.reqMemoria = reqMemoria;
    }

    public double getReqMemoria() {
        return reqMemoria;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return " Proceso: "+ id +" Requerimiento memoria: "+ reqMemoria;
    }

    @Override
    public boolean esMayor(ElementoComparable p2){
        return this.getReqMemoria() > ((Proceso)p2).getReqMemoria(); //castear CondicionDeMayor x
    }                                                                //para poder tomar el metodo getReqMemoria()

}

