package Decorator;

public class UltraHD extends BasicoDecorador {
    public UltraHD(Plan plan){
        super(plan);
    }

    public String nombre(){
        return plan.nombre()+" + Ultra HD";
    }

    @Override
    public double precio() {
        return plan.precio()+1000;
    }
}
