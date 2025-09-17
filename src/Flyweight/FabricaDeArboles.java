package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeArboles {
    private Map<String,Arbol> arboles = new HashMap<>();

    public Arbol obtenerArbol(String tipo, String textura, String color) {
        String clave = tipo+"-"+textura+"-"+color;

        Arbol arbol = arboles.get(clave);
        if (arbol == null) {
            arbol = new ArbolConcreto(tipo,textura,color);
            arboles.put(clave,arbol);
        }
        return arbol;
    }

    public int cantidadArboles() {
        return arboles.size();
    }

}
