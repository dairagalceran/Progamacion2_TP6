package procesadoresDinamicos.procesadores2;

public class ColaTareasLlegada extends ColaTareas{

	public void addTarea(Tarea nueva) {
		tareas.add(nueva);
	}
	
 @Override
	public boolean esMenor(Tarea t1, Tarea tJuan) {
		return true;
	}
}
