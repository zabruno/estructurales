package Facade;

public class Pago {
    public void realizarPago(Carrito carrito) {
        System.out.println("Pago de $" + carrito.calcularTotal() + " realizado para el carrito " + carrito.getClass().getSimpleName());
    }
}
