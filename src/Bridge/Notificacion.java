package Bridge;


//Creamos la clase abstracta para que sea el prototipo de los tipos de notificacion. Nos dice que hace
//La implementacion del como lo hace se pone en los tipos de notificaciòn
public abstract class Notificacion {
    protected tipoMedio Medio;

    public Notificacion(tipoMedio Medio) {
        this.Medio = Medio;
    }

    public abstract void notificar()   ;
}
