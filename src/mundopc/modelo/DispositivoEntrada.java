package mundopc.modelo;

public class DispositivoEntrada {
    private String tipoDeEntradaString;
    private String marcaString;

    public DispositivoEntrada(String tipoDeEntradaString, String marcaString) {
        this.tipoDeEntradaString = tipoDeEntradaString;
        this.marcaString = marcaString;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada [tipoDeEntradaString=" + tipoDeEntradaString + ", marcaString=" + marcaString + "]";
    }
    
    
}
