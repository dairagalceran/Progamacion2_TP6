package tp6_ej3_puerto; 
import java.util.ArrayList;

public class ColaEspera {

    private ArrayList<ElementoComparable> elementos;

    public ColaEspera(){
        this.elementos = new ArrayList<>();
    }

    public boolean tieneElementos(){
        return elementos.size()>0;
    }

    public void addElemento(ElementoComparable nuevoEl){
        int i =0;
        while(i<elementos.size() &&
                elementos.get(i).comparadoCon(nuevoEl)){
                    i++;
                }
                if(i < elementos.size()){
                    elementos.add(i , nuevoEl);
                }else{
                    elementos.add(nuevoEl);
                }
    }

    public ElementoComparable getPrimero(){
        if(tieneElementos()){
            return this.elementos.get(0);
        }else{
            return null;
        }
    }

    @Override
    public String toString(){
        return elementos.toString();
    }
}
