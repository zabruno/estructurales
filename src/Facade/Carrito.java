package Facade;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
        private List<Producto> productos = new ArrayList<>();;


        // Getters y Setters
        public List<Producto> getProductos() {
            return productos;
        }

        public void setProductos(List<Producto> productos) {
            this.productos = productos != null ? productos : new ArrayList<>();
        }

        public void cargarProducto(Producto producto) {
            if (producto != null) {
                productos.add(producto);
                System.out.println("El producto " + producto.getNombre() + " fue agregado correctamente");
            }
        }

        public double calcularTotal() {
            double total = 0;
            for (Producto p : productos) {
                total += p.getPrecio();
            }
            return total;
        }
}

