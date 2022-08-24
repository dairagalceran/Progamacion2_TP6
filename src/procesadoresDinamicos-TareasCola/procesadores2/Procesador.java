package procesadoresDinamicos.procesadores2;


public class Procesador {
	
	// VA A ESTAR ORDENADO Y SOLO TIENE TAREAS
	ColaTareas tareas ;
    
	
	public Procesador() {
		super();
		tareas = new ColaTareasMem();
	}
	
	
	public void ejecutarTarea() {
	
	  if (tareas.tamanio()>0)	{
		Tarea aEjecutar = tareas.getPrimera();
		aEjecutar.ejecutarTarea();
		tareas.borrarPrimera();
	  }	
	}
	
	
	public void addTarea(Tarea taskNew) {
        tareas.agregarTarea(taskNew);
	}

	public boolean hayMasTareas() {
		//return ! tareas.isEmpty();
		return tareas.tamanio()>0;
	}
	
	public int cantiadaTareas() {
		//return ! tareas.isEmpty();
		return tareas.tamanio();
	}
	
	public void cambiarColaTareas(ColaTareas cp) {
	//Copiamos las viejas
		while(tareas.tamanio()>0) {
			cp.agregarTarea(tareas.getPrimera());
			tareas.borrarPrimera();
			
		}
	//ahora que tareas apuntre a la nueva cola	
		tareas = cp;
	
	}

	


	
}
