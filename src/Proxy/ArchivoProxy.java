package Proxy;

import lombok.Getter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArchivoProxy implements Archivo{
    @Getter
    private final String nombreArchivo;
    private final Set<String> usuariosAutorizados;
    private ArchivoReal archivoReal;

    public ArchivoProxy(String nombreArchivo, String[] usuariosAutorizados) {
        this.nombreArchivo = nombreArchivo;
        this.usuariosAutorizados = new HashSet<>(Arrays.asList(usuariosAutorizados));
        this.archivoReal = null; // Inicialización explícita (lazy)
    }

    public void agregarUsuarioAutorizado(String nuevoUsuario) {
        if (nuevoUsuario != null) {
            usuariosAutorizados.add(nuevoUsuario);
            System.out.println("Usuario " + nuevoUsuario + " agregado a los autorizados para " + nombreArchivo);
        }
    }

    public void removerUsuarioAutorizado(String usuario) {
        if (usuario != null) {
            usuariosAutorizados.remove(usuario);
            System.out.println("Usuario " + usuario + " eliminado de los autorizados para " + nombreArchivo);
        }
    }

    public boolean tienePermiso(String usuario) {
        return usuario != null && usuariosAutorizados.contains(usuario);
    }

    @Override
    public void abrir(String usuario) {
        if (tienePermiso(usuario)) {
            if (archivoReal == null) {
                archivoReal = new ArchivoReal(nombreArchivo); // Lazy initialization
            }
            archivoReal.abrir(usuario);
        } else {
            System.out.println("Acceso denegado para el usuario " + (usuario != null ? usuario : "desconocido") + " al archivo " + nombreArchivo);
        }
    }

    @Override
    public String leer(String usuario) {
        if (tienePermiso(usuario)) {
            if (archivoReal == null) {
                archivoReal = new ArchivoReal(nombreArchivo); // Lazy initialization
            }
            return archivoReal.leer(usuario);
        } else {
            return "Acceso denegado para el usuario " + (usuario != null ? usuario : "desconocido") + " al archivo " + nombreArchivo;
        }
    }
}
