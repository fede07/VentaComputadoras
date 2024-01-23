package mundopc;

import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;

public class Main {

    public static void main(String[] args) {
        Raton ratonL = new Raton("usb", "Lenovion");
        System.out.println(ratonL);

        Teclado tecladoL = new Teclado("bluetooth", "Lenovion");
        System.out.println(tecladoL);

        Monitor monitorL = new Monitor("Lenovion", 27);
        System.out.println(monitorL);

        Computadora computadoraL = new Computadora("Computadora Lenovion", monitorL, tecladoL, ratonL);
        System.out.println(computadoraL);
    }
}