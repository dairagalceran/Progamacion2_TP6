package procesadoresDinamicos.procesadores2;

import java.util.ArrayList;


public abstract class ColaTareas {

	ArrayList<Tarea>   tareas ;
	
	public ColaTareas() {
		tareas = new ArrayList<Tarea>();
	}
	
	public int tamanio() {
		 return tareas.size();
	};
	
	public Tarea getPrimera() {
		if(tareas.size()>0)
		 return tareas.get(0);
		else
		  return null;
	}
	
	public void borrarPrimera() {
		tareas.remove(0);
	};
	
	
	public void agregarTarea(Tarea tnueva) {
		// INSERTAR ORDENADO
		int pos = 0;
		
		while((pos<tareas.size())&&(this.esMenor(tnueva,tareas.get(pos)))) {
			pos++;
		}
		
		tareas.add(pos, tnueva);
		
	}
	
	public abstract boolean esMenor(Tarea t1, Tarea t2);
}
