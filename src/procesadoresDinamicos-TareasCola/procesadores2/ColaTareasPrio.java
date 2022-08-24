package procesadoresDinamicos.procesadores2;

public class ColaTareasPrio extends ColaTareas {
	
 @Override
	public boolean esMenor(Tarea ta, Tarea tb) {
		return ta.getPrio()<tb.getPrio();
	}
	
}
