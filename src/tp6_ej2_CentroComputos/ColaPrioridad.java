package tp6_ej2_CentroComputos;

import java.util.ArrayList;

public class ColaPrioridad {
    
    private ArrayList<ElementoComparable> elementos;

    public ColaPrioridad(){
        elementos = new ArrayList<>();
    }

    public boolean tieneElementos(){
        return elementos.size()>0;
    }

    public void  addElemento(ElementoComparable elNuevo){
        int i = 0;
        while(i < elementos.size()&&
                elementos.get(i).esMayor(elNuevo)){
                    i++;
                }
                if( i< elementos.size())
                    elementos.add(i , elNuevo);
                else
                    elementos.add(elNuevo);
    }

    public ElementoComparable obtenerPrimero(){
        if (tieneElementos())
            return elementos.get(0);
        else
            return null;
    }

    
    public ElementoComparable eliminarPrimero(){
        if (tieneElementos())
            return elementos.remove(0);
        else
            return null;
    }

    @Override
    public String toString(){
        return elementos.toString();
    }
}
