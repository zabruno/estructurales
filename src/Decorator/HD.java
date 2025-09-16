package Decorator;

public class HD extends BasicoDecorador{
    public HD(Plan plan){
        super(plan);
    }

    public String nombre(){
        return plan.nombre()+" + HD";
    }

    @Override
    public double precio() {
        return plan.precio()+500;
    }
}

