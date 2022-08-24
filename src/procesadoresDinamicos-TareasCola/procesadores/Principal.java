package procesadores;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Procesador p1 = new Procesador();
		Procesador compu = p1;
		
		p1.addTarea(new Tarea(10,10,40));
		p1.addTarea(new Tarea(20,100,30));
		p1.addTarea(new Tarea(30,1,20));
		p1.addTarea(new Tarea(40,1000,10));
		
		Comportamiento ccNuevo = new ComportamientoMemoria(); 
		//p1.setComportamiento(ccNuevo);
		
		
		compu.addTarea(new Tarea(100,1000,100));
		
		while(p1.tieneMasTareas()) {
			p1.ejecutarTarea();
		}
		
	}

}
