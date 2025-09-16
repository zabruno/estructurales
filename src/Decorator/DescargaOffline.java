package Decorator;

public class DescargaOffline extends BasicoDecorador{
    public DescargaOffline(Plan plan) {
        super(plan);
    }

    public String nombre(){
        return plan.nombre()+" + Descarga Offline";
    }

    @Override
    public double precio() {
        return plan.precio()+700;
    }
}
