package tp6_ej2_CentroComputos;
import java.util.ArrayList;

public class CentroComputos {
    
    private ColaPrioridad computadorasLibres;
    private ColaPrioridad procesos;
    private ArrayList<Computadora> computadorasOcupadas;

    //constructor

    public CentroComputos(){
        computadorasLibres = new ColaPrioridad();
        procesos = new ColaPrioridad();
        this.computadorasOcupadas = new ArrayList<>();
    }


    public void  agregarComputadora(Computadora compuNueva){
        if(procesos.tieneElementos()){
            Proceso procAEjecutar = (Proceso)procesos.obtenerPrimero();
            compuNueva.asignarProceso(procAEjecutar);
            computadorasOcupadas.add(compuNueva);
            procesos.eliminarPrimero();
        }
        else{
            computadorasLibres.addElemento(compuNueva);
        }
    }

    public void recibirProceso(Proceso procNuevo){
        if(computadorasLibres.tieneElementos()){
            Computadora compuLibre = (Computadora)computadorasLibres.obtenerPrimero();
            compuLibre.asignarProceso(procNuevo);
            computadorasOcupadas.add(compuLibre);
            computadorasLibres.eliminarPrimero();
        }
        else{
            procesos.addElemento(procNuevo);
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
        Computadora c4 = new Computadora("C4", 300.5);

        olavarria.agregarComputadora(c1);
        olavarria.agregarComputadora(c2);
        olavarria.agregarComputadora(c3);
        olavarria.agregarComputadora(c4);

        olavarria.imprimirComputadoras();

        Proceso proc1 = new Proceso("Proceso 1", 56);
        Proceso proc2 = new Proceso("Proceso 2", 15);
        Proceso proc3 = new Proceso("Proceso 3", 560);
        Proceso proc4 = new Proceso("Proceso 4", 670);
        Proceso proc5 = new Proceso("Proceso 5", 150);
        Proceso proc6 = new Proceso("Proceso 6", 35);
       

        olavarria.recibirProceso(proc1);
        olavarria.recibirProceso(proc2);
        olavarria.recibirProceso(proc3);
        olavarria.recibirProceso(proc4);
        olavarria.recibirProceso(proc5);
        olavarria.recibirProceso(proc6);
        olavarria.imprimirProcesos();

        Proceso proc7 = new Proceso("Proceso 7", 630);
        Proceso proc8 = new Proceso("Proceso 8", 50);
        Proceso proc9 = new Proceso("Proceso 9", 315);
        olavarria.recibirProceso(proc7);
        olavarria.recibirProceso(proc8);
        olavarria.recibirProceso(proc9);

        olavarria.imprimirProcesos();

    }
    
}