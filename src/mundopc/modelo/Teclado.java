package mundopc.modelo;

public class Teclado extends DispositivoEntrada {
    private final int idTeclado;
    private static int contadorTeclado;
    
    public Teclado(String tipoDeEntradaString, String marcaString) {
        super(tipoDeEntradaString, marcaString);
        idTeclado = ++contadorTeclado;
    }

    @Override
    public String toString() {
        return "Teclado [idTeclado=" + idTeclado + " [" + super.toString() + "]";
    }

}
