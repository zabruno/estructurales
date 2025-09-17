package Facade;

import java.util.Scanner;

public class TiendaFacade {
    private Carrito carrito;
    private Pago pago;
    private Envio envio;
    private Producto producto;

    public TiendaFacade(Carrito carrito, Pago pago, Envio envio) {
        this.carrito = carrito;
        this.pago = pago;
        this.envio = envio;
    }

    public void gestionarProd(Scanner scanner ){
        System.out.println("Añadiendo productos...");
        while (true){
            System.out.println("Nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.println("Precio: ");
            double precio = Double.parseDouble(scanner.nextLine());

            carrito.cargarProducto(new Producto(nombre, precio));
            System.out.println("Otro producto? (S/N)");
            //usamos toLowerCase para ignorar si es mayuscula o minuscula
            String rta = scanner.nextLine().toLowerCase();
            if (rta.equals("n")) {
                System.out.println("Carrito listo!");
                break;   // ← rompe el bucle
            }
        }
    }

    public void procesarPago(){
        pago.realizarPago(carrito);
    }
    public void coordEntrega(){
        envio.realizarEnvio();
    }
}