import Adapter.*;
import Bridge.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("------------EJERCICIO 1------------");
        SistemaImpresion impresora = new SistemaImpresion();      //Probamos el adaptador
        impresora.imprimir("pdf","TP2");        //Reconoce PDF
        impresora.imprimir("txt","TP1");        //Adapta TXT
        impresora.imprimir("doc","TP3");        //Rechaza DOC


        System.out.println("------------EJERCICIO 2------------");
        //Creamos las distintas clases con los distintos tipos
        Notificacion AlertaEmail = new Alerta (new Email());
        Notificacion AlertaSMS = new Alerta (new SMS());
        Notificacion PromocionEmail = new Promocion (new Email());
        Notificacion RecordatorioEmail = new Recordatorio (new Email());
        //Verificamos el funcionamiento de las clases
        AlertaEmail.notificar();
        AlertaSMS.notificar();
        PromocionEmail.notificar();
        RecordatorioEmail.notificar();

        System.out.println("------------EJERCICIO 3------------");

    }
}

