package procesadoresDinamicos.procesadores2;

public class Tarea {

	double cpu;
	double mem;
	double prio;
	
	public Tarea(double cpu, double mem, double prio) {
		this.cpu = cpu;
		this.mem = mem;
		this.prio = prio;
	}
	public double getCpu() {
		return cpu;
	}
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}
	public double getMem() {
		return mem;
	}
	public void setMem(double mem) {
		this.mem = mem;
	}
	public double getPrio() {
		return prio;
	}
	public void setPrio(double prio) {
		this.prio = prio;
	}
	
	public void ejecutarTarea() {
		System.out.println("Se ejecuto " + this);
	}
	
 @Override
	public String toString() {
		return "memoria:"+mem + "-cpu:" +cpu +"-prio:"+prio;
	}
	
	
}
