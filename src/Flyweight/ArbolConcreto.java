package Flyweight;

public class ArbolConcreto implements Arbol {
    //ESTADO INTRINSECO; atributos
    private final String tipo;
    private final String textura;
    private final String color;

    public ArbolConcreto(String tipo, String textura, String color) {
        this.tipo = tipo;
        this.textura = textura;
        this.color = color;
        System.out.println("Arbol creado con "+tipo+" ,"+textura+" ,"+color);
    }

    @Override
    public void plantar (int x,int y) {
        System.out.println("Plantando "+ tipo +" en "+"(" +x + ","+ y+ ")");
    }
}
