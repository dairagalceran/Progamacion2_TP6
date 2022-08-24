package procesadoresDinamicos.procesadores2;

public class ColaTareasMem extends ColaTareas {

	
	
	
 @Override
	public boolean esMenor(Tarea ta, Tarea tb) {
		return ta.getMem()<tb.getMem();
	}
}
