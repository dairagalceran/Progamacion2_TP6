package procesadoresDinamicos.procesadores2;

public class ColaTareasCpu extends ColaTareas {

	//SI NO HAGO NADA ESTO ME HACE POR DEFECTO JAVA POR ESO NO HACE FALTA PONER ESTE CONSTRUCTOR
	public ColaTareasCpu() {
		super();
	}
	
	
 	@Override
	public boolean esMenor(Tarea ta, Tarea tb) {
		return ta.getCpu()<tb.getCpu();
	}
	
	
}
