package Proxy;

import lombok.Getter;

@Getter
class ArchivoReal implements Archivo {
    private final String nombreArchivo;

    public ArchivoReal(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        cargarArchivo();
    }

    private void cargarArchivo() {
        System.out.println("Cargando archivo desde el sistema: " + nombreArchivo);
        try {
            Thread.sleep(1000); // Simula operación costosa
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Error al cargar archivo: " + e.getMessage());
        }
    }

    @Override
    public void abrir(String usuario) {
        System.out.println("Abriendo archivo: " + nombreArchivo + " para el usuario " + usuario);
    }

    @Override
    public String leer(String usuario) {
        return "Contenido del archivo " + nombreArchivo + " leído por el usuario " + usuario;
    }
}