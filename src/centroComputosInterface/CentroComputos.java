package centroComputosInterface;

import java.util.ArrayList;

public class CentroComputos {

    private ColaPrioridad procesos;
    private ColaPrioridad computadorasLibres;

    private ArrayList<Computadora> computadorasOcupadas;

    
    public CentroComputos() {

        procesos = new ColaPrioridad();
        computadorasLibres = new ColaPrioridad();

        computadorasOcupadas = new ArrayList<>();
    }

    public void agregarComputadora(Computadora nueva){
        if (procesos.tieneElementos()){
            Proceso aEjecutar = (Proceso) procesos.obtenerPrimero();
            nueva.asignarProceso(aEjecutar);
            computadorasOcupadas.add(nueva);
        }
        else {
            computadorasLibres.agregarElemento(nueva);
        }
    }

    public void recibirProceso(Proceso nuevo){
        if (computadorasLibres.tieneElementos()){
            Computadora libre = (Computadora) computadorasLibres.obtenerPrimero();
            libre.asignarProceso(nuevo);
            computadorasOcupadas.add(libre);
        }
        else {
            procesos.agregarElemento(nuevo);
        }

    }

    public void imprimirComputadoras(){
        System.out.println(computadorasLibres);
    }

    public void imprimirProcesos(){
        System.out.println(procesos);
    }

    public static void main(String[] args) {
        CentroComputos olavarria = new CentroComputos();

        Computadora c1 = new Computadora("C1", 200.0);
        Computadora c2 = new Computadora("C2", 500.5);
        Computadora c3 = new Computadora("C3", 100.4);

        olavarria.agregarComputadora(c1);
        olavarria.agregarComputadora(c2);
        olavarria.agregarComputadora(c3);

        olavarria.imprimirComputadoras();

        Proceso proc1 = new Proceso("Proceso 1", 56);
        Proceso proc2 = new Proceso("Proceso 2", 15);
        Proceso proc3 = new Proceso("Proceso 3", 560);
        Proceso proc4 = new Proceso("Proceso 4", 60);
        Proceso proc5 = new Proceso("Proceso 5", 150);
        Proceso proc6 = new Proceso("Proceso 6", 35);

        olavarria.recibirProceso(proc1);
        olavarria.recibirProceso(proc2);
        olavarria.recibirProceso(proc3);
        olavarria.recibirProceso(proc4);
        olavarria.recibirProceso(proc5);
        olavarria.recibirProceso(proc6);

        olavarria.imprimirProcesos();
        olavarria.imprimirComputadoras();
    }
}
