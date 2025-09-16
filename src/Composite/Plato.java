package Composite;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

//Clase compuesta

public class Plato implements ElementoMenu {
    private String nombre;

    public Plato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrar(String indent) {
        System.out.println(indent+"El plato es "+nombre);
    }
}
