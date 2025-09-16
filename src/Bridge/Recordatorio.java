package Bridge;

public class Recordatorio extends Notificacion {
    public Recordatorio(tipoMedio tipomedio){
        super(tipomedio);
    }

    @Override
    public void notificar() {
        System.out.println("Esto es un recordatorio en un "+ Medio.aplicarMedio());
    }
}
