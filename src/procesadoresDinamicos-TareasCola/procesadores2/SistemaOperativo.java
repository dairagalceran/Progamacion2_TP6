package procesadoresDinamicos.procesadores2;

public class SistemaOperativo {
	
	public static void main(String[] args) {
		
		Tarea t1 = new Tarea(10,10,10);
		Tarea t2 = new Tarea(50,50,60);
		
		Tarea t3 = new Tarea(35,15,80);
		
		Tarea t4 = new Tarea(19,21,190);
		
		Tarea t5 = new Tarea(0,0,0);
		
		Tarea t6 = new Tarea(100,100,100);
		
		Tarea t7 = new Tarea(10,10,11);
		
		Procesador procNuevo = new Procesador();
		
		procNuevo.addTarea(t1);
		procNuevo.addTarea(t2);
		procNuevo.addTarea(t3);
		procNuevo.addTarea(t4);
		procNuevo.addTarea(t5);
		procNuevo.addTarea(t6);
		procNuevo.addTarea(t7);
		
		procNuevo.cambiarColaTareas(new ColaTareasMem());

		
		for (;procNuevo.hayMasTareas();) {
			procNuevo.ejecutarTarea();
		}
		
		
		
		
		
	}
}
