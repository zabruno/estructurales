package Adapter;

//Adaptador de .txt para el sistema

public class ImpresoraAdapter implements Impresora {
    private ImpresoraTexto impresoraTexto;

    public ImpresoraAdapter() {
        impresoraTexto = new ImpresoraTexto();
    }

    public void imprimir (String tipoArchivo, String archivo) {
        if(tipoArchivo.equals("txt")) {                 //Si es un texto plano utiliza el metodo de impresoraTexto
            impresoraTexto.imprimirTexto(archivo);
        } else {
            System.out.println("Error: Tipo de archivo invalido"); //Si no reconoce el archivo da error
        }
    }
}
