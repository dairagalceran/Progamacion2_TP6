package procesadores;

public class ProcCpu extends Procesador{

	public boolean esMayor(Tarea nueva, Tarea subI) {
		return nueva.getCpu()>subI.getCpu();
	}
}
