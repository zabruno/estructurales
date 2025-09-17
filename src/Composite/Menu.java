package Composite;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter

//Clase hoja

public class Menu implements ElementoMenu {
    private String nombre;
    private List<ElementoMenu> elementos = new ArrayList<>();

    public Menu(String nombre) {
        this.nombre = nombre;
    }

    public void anadirElemento(ElementoMenu elemento){
        elementos.add(elemento);
    }

    public void mostrar(String indent){
        System.out.print(indent + "menu: "+ nombre +" contiene: "+ "\n");
        for(ElementoMenu elemento : elementos){
            elemento.mostrar(indent+"  ");
        };
    }
}
