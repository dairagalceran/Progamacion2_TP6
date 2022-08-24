package SistemaAlquiler;
import java.time.LocalDate;

public class MainVideoClub {

    public static void main(String[] args) {

        SistemaAlquiler s = new SistemaAlquiler();

        Cliente cl1 = new Cliente("daia");
        Cliente cl2 = new Cliente("mau");

        Vehiculo  auto = new Vehiculo(21, "DE232ES", "ford", 34533.0);
        Pelicula p2 = new Pelicula(12, "La era del hielo", 10);
        Pelicula p1 = new Pelicula(23, "Antes de medianoche", 2);

        System.out.println(p1);
        System.out.println();
        System.out.println(auto);

        Alquiler alq1 = new Alquiler(cl1, LocalDate.of(2022,05,26), p1);
        Alquiler alq2 = new Alquiler(cl1, LocalDate.of(2022,05,25), p1);
        Alquiler alq3 = new Alquiler(cl1, LocalDate.of(2022,05,31), auto);
        Alquiler alq4 = new Alquiler(cl1, LocalDate.of(2022,05,30), auto);
        System.out.println("-------- print alq4-----------");
        System.out.println(alq4);
        System.out.println("------------");


        s.addPelicula(p1);
        s.addPelicula(p2);
        s.addAlquiler(alq1); 
        s.addAlquiler(alq2); 
        s.addAlquiler(alq3); 
        System.out.println("auto "+ auto.estaDisponible());
        s.addAlquiler(alq4);
        System.out.println("auto "+ auto.estaDisponible());
        Alquiler alq5 = new Alquiler(cl2, LocalDate.of(2022,05,29), p1);
System.out.println(s);
        s.addAlquiler(alq5);
        System.out.println();
        System.out.println(p1.estaDisponible());
       
        
        System.out.println("eee");
        System.out.println("peli 1 "+p1.estaDisponible());

    

        cl1.addAlquiler(alq1);
        cl1.addAlquiler(alq2);
        cl1.addAlquiler(alq3);
        s.clientesConAlquileresVencidos();
        System.out.println("-------- print alq cl1-----------");
        System.out.println(cl1);
        System.out.println("------------");
    }
    
}
