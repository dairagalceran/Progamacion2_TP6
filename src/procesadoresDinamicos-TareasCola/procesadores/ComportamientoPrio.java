package procesadores;

public class ComportamientoPrio extends Comportamiento{

	
 @Override
	public boolean esMayor(Tarea t1, Tarea t2) {
		
		return t1.getPrio()>t2.getPrio();
	}
	

}
