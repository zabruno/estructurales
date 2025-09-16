import Adapter.*;
import Bridge.*;
import Composite.*;
import Decorator.*;


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

        System.out.println("------------EJERCICIO 7------------");
        ElementoMenu Plato1 = new Plato("Fideos");
        ElementoMenu Plato2 = new Plato("Asado");
        ElementoMenu Plato3 = new Plato("Arroz");

        Menu menuTardeLunes = new Menu("Lunes Tarde");
        menuTardeLunes.añadirElemento(Plato1);
        menuTardeLunes.añadirElemento(Plato2);

        Menu menuLunes = new Menu("Lunes");
        menuLunes.añadirElemento(menuTardeLunes);  //Menu de la tarde del lunes en el menu del lunes
        menuLunes.añadirElemento(Plato3);

        menuLunes.mostrar(" -");

        System.out.println("------------EJERCICIO 3------------");
        Basico planBasico = new Basico();
        HD hd = new HD(planBasico);
        UltraHD ultrahd = new UltraHD(hd);
        DescargaOffline descargaOffline = new DescargaOffline(ultrahd);
        System.out.println(descargaOffline.nombre()+" cuesta $"+descargaOffline.precio());


        System.out.println("------------EJERCICIO 4------------");

    }
}

