package procesadores;

public class Tarea {

	int prio;
	int memoria;
	int cpu;
	public Tarea(int prio, int memoria, int cpu) {
		super();
		this.prio = prio;
		this.memoria = memoria;
		this.cpu = cpu;
	}
	public int getPrio() {
		return prio;
	}
	public void setPrio(int prio) {
		this.prio = prio;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public int getCpu() {
		return cpu;
	}
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	
	public void ejecutar() {
		System.out.println("Se ejecuto " + this.toString());
	}
	
	public String toString() {
		return " Prio:"+prio+ " Memoria:" +memoria +" CPU:" + cpu;
	}
}
