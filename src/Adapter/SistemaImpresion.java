package Adapter;

public class SistemaImpresion implements Impresora {
    private ImpresoraAdapter ImpresoraAdapter; //Colocamos un adaptador en el sistema de pdf

    @Override
    public void imprimir(String tipoArchivo, String archivo) {
        if (tipoArchivo.equals("pdf")) { //El sistema conoce .pdf
            System.out.println("Imprimiendo archivo ."+tipoArchivo+": "+archivo);
        } else {
            ImpresoraAdapter = new ImpresoraAdapter();
            ImpresoraAdapter.imprimir(tipoArchivo, archivo); //Si no es pdf va por el adaptador
        }
    }
}
