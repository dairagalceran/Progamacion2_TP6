package procesadoresDinamicos.procesadores2;

import java.util.ArrayList;

public  class Procesador {

	protected ArrayList<Tarea> ts;
	private Comportamiento cc;

	public Procesador() {
		super();
		cc = new ComportamientoPrio();
		ts = new ArrayList<Tarea>();
	}
	
	
	public void setComportamiento(Comportamiento ccnuevo) {
		cc=ccnuevo;
		//RE ACOMODO
		ArrayList<Tarea> aux = ts;
		ts = new ArrayList<Tarea>();
		for (int i =0; i<aux.size();i++) {
			this.addTarea(aux.get(i));
		}
		
	}
	
	public void ejecutarTarea() {
		if (ts.size()>0) {
			Tarea t1 = ts.get(0);
			t1.ejecutar();
			ts.remove(0);
		}
	}
	
	public boolean tieneMasTareas() {
		return ts.size()>0;
	}
	
	
	public  void addTarea(Tarea nuevaT) {
		boolean encontro = false;
		int i =0;
		while (i<ts.size() && !encontro) {
			Tarea subI = ts.get(i);
			//USA UN METODO ABSTRACTO PROPIO
			if (cc.esMayor(nuevaT, subI)) {//EL HUEQUITO LO DISTINTO
				encontro = true;
			} else {
				i++;
			}	
		}
		if (encontro) {
			ts.add(i, nuevaT);
		}else {
			ts.add(nuevaT);
		}
		
	}
		
		
	
		
//	public abstract boolean esMayor(Tarea nueva, Tarea subI);
	
	/*
	public void cambiar(ColaTareasOrdenada nueva) {	
		ts.copiar(nueva);
		ts=nueva;
	}*/
}
