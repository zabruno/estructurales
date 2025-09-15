import Adapter.*;


public class Main {
    public static void main(String[] args) {
        SistemaImpresion impresora = new SistemaImpresion();      //Probamos el adaptador
        impresora.imprimir("pdf","TP2");        //Reconoce PDF
        impresora.imprimir("txt","TP1");        //Adapta TXT
        impresora.imprimir("doc","TP3");        //Rechaza DOC
    }
}

