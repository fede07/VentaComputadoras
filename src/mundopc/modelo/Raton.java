package mundopc.modelo;

public class Raton extends DispositivoEntrada{

    private final int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoDeEntradaString, String marcaString) {
        super(tipoDeEntradaString, marcaString);
        this.idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton [idRaton=" + idRaton + " [" + super.toString() + "]";
    }

    
    
}
