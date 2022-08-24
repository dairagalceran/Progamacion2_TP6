package SistemaAlquiler;

import java.util.ArrayList;

public class Cliente {
    
    private String nombre;
    private ArrayList<Alquiler> alquileresCliente;

    public Cliente(String nombre){
        this.nombre = nombre;
        this.alquileresCliente = new ArrayList<Alquiler>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public ArrayList<Alquiler> getAlquileresCliente() {
        return alquileresCliente;
    }

    public void addAlquiler(Alquiler al){      
        this.alquileresCliente.add(al);
    }

@Override
public String toString(){
    return "Cliente "+this.getNombre()+
        " Alquiler realizado "+ this.getAlquileresCliente();
}

}




