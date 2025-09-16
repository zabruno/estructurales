package Decorator;


//Componente concreto
public class Basico implements Plan{
    public String nombre(){
        return "Basico";
    }

    public double precio(){
        return 1000;
    }
}
