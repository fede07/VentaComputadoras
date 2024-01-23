package mundopc.modelo;

public class Monitor {
    private final int idMonitor;
    private String marcaString;
    private double tam;
    private static int contadorMonitores;

    private Monitor(){
        idMonitor = ++contadorMonitores;
    }

    public Monitor(String marcaString, double tam) {
        this();
        this.marcaString = marcaString;
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "Monitor [idMonitor=" + idMonitor + ", marcaString=" + marcaString + ", tam=" + tam + "]";
    }

    
}
