package mundopc.modelo;

public class Computadora {
    private int idComputadora;
    private String nombreString;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    private Computadora(){
        idComputadora = ++contadorComputadoras;
    }

    public Computadora(String nombreString, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombreString = nombreString;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{\n [idComputadora=" + idComputadora + ", nombreString=" + nombreString + ", monitor=" + monitor
                + ", teclado=" + teclado + ", raton=" + raton + "]}";
    }
    
}
