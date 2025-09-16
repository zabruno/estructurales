package Bridge;

public class Alerta extends Notificacion{

    public Alerta(tipoMedio tipomedio){
        super(tipomedio);
    }

    @Override
    public void notificar() {
        System.out.println("Esto es una alerta en un "+ Medio.aplicarMedio());
    }
}
