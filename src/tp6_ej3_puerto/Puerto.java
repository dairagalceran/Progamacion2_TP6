package tp6_ej3_puerto; 

public class  Puerto {
    private String nombre;
    private ColaEspera camiones;
    private ColaEspera barcos;

    public Puerto(){
        this.camiones = new ColaEspera();
        this.barcos = new ColaEspera();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ColaEspera getBarcos() {
        return barcos;
    }

    public ColaEspera getCamiones(){
        return camiones;
    }

    public void imprimiBarcos(ColaEspera barcos){
        System.out.println(barcos);  
    }

    public void imprimiCamiones(ColaEspera camiones){
        System.out.println(camiones);  
    }

  
    @Override
    public String toString(){
        return this.getNombre()+ "  "+ this.getBarcos() + "  " + this.getCamiones();
    }
}
