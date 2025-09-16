package Decorator;


//Decorador del componente concreto
abstract class BasicoDecorador implements Plan {
    public Plan plan;

    public BasicoDecorador(Plan plan) {
        this.plan = plan;
    }

    public String nombre() {
        return plan.nombre();
    }

    public double precio() {
        return plan.precio();
    }
}
