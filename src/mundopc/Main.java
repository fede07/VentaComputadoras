package mundopc;

import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;
import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;

public class Main {

    public static void main(String[] args) {
        Raton ratonL = new Raton("usb", "Lenovion");
        //System.out.println(ratonL);

        Teclado tecladoL = new Teclado("bluetooth", "Lenovion");
        //System.out.println(tecladoL);

        Monitor monitorL = new Monitor("Lenovion", 27);
        //System.out.println(monitorL);

        Computadora computadoraL = new Computadora("Computadora Lenovion", monitorL, tecladoL, ratonL);
        //System.out.println(computadoraL);

        Monitor monitorD = new Monitor("Doll", 15);
        Teclado tecladoD = new Teclado("usb", "Doll");
        Raton ratonD = new Raton("usb", "Doll");
        Computadora computadoraD = new Computadora("Doll", monitorD, tecladoD, ratonD);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraL);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraD);
        orden2.agregarComputadora(computadoraL);
        orden2.mostrarOrden();
        
    }
}