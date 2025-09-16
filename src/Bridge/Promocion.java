package Bridge;

public class Promocion extends Notificacion{
    public Promocion(tipoMedio tipomedio){
        super(tipomedio);
    }

    @Override
    public void notificar() {
        System.out.println("Esto es una promocion en un "+ Medio.aplicarMedio());
    }

}
