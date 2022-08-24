package centroComputosInterface;

import java.util.ArrayList;

public class ColaPrioridad {
    private ArrayList<ElementoComparable> elementos;

    public ColaPrioridad(){
        elementos = new ArrayList<>();
    }

    public ElementoComparable obtenerPrimero(){
        if (tieneElementos())
            return elementos.remove(0);
        else
            return null;
    }

    public ElementoComparable verPrimero(){
        if (tieneElementos())
            return elementos.get(0);
        else
            return null;
    }

    public boolean tieneElementos(){
        return elementos.size()>0; //o equivalente !elementos.isEmpty();
    }

    public void agregarElemento(ElementoComparable nuevo){
        int i = 0;
        while (i < elementos.size() &&
                elementos.get(i).esMayor(nuevo) ) {
            i++;
        }
        if (i < elementos.size())
            elementos.add(i, nuevo);
        else
            elementos.add(nuevo);
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}
