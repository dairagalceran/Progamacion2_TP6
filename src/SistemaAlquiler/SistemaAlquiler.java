package SistemaAlquiler;
import java.util.ArrayList;

public class SistemaAlquiler {

    private ArrayList<Pelicula> peliculas;
    private ArrayList<Vehiculo> autos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Alquiler> alquileres;

    public SistemaAlquiler(){
        this.alquileres = new ArrayList<>();
        this.peliculas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.autos = new ArrayList<>();
    }

    public void addPelicula(Pelicula pel){
        if(!peliculas.contains(pel)){
            peliculas.add(pel);
        }
    }

    public void addAlquiler(Alquiler alq){
        if(!alquileres.contains(alq)){
            alquileres.add(alq);
        }
    }

    public ArrayList<Cliente>  clientesConAlquileresVencidos(){
        ArrayList<Cliente> aux = new ArrayList<Cliente>();
        for (int i =0; i < alquileres.size(); i ++){
            if(alquileres.get(i).estaVencido()){                     //if(alquileres.get(i).estaVencido()){
                aux.add(alquileres.get(i).getCliente());
                System.out.println("dentro de vencidos "+ ((Alquiler)alquileres.get(i)).estaVencido()+" "+((Alquiler)alquileres.get(i)).getCliente().getNombre()+" ");     // aux.add(alquileres.get(i).getCliente())
            }
            return aux;
        }
        return null;
    }  

}
    
