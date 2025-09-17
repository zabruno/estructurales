import Adapter.*;
import Bridge.*;
import Composite.*;
import Decorator.*;
import Facade.*;
import Flyweight.*;
import Proxy.*;
import java.util.Scanner;


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
        menuTardeLunes.anadirElemento(Plato1);
        menuTardeLunes.anadirElemento(Plato2);

        Menu menuLunes = new Menu("Lunes");
        menuLunes.anadirElemento(menuTardeLunes);  //Menu de la tarde del lunes en el menu del lunes
        menuLunes.anadirElemento(Plato3);

        menuLunes.mostrar(" -");

        System.out.println("------------EJERCICIO 3------------");
        Basico planBasico = new Basico();
        HD hd = new HD(planBasico);
        UltraHD ultrahd = new UltraHD(hd);
        DescargaOffline descargaOffline = new DescargaOffline(ultrahd);
        System.out.println(descargaOffline.nombre()+" cuesta $"+descargaOffline.precio());


        System.out.println("------------EJERCICIO 4------------");
        Scanner scanner = new Scanner(System.in);
        // Crear los objetos base
        Carrito carrito = new Carrito();
        Pago pago = new Pago();       // Suponiendo que tu clase Pago tiene un constructor sin args
        Envio envio = new Envio();    // Igual acá
        // Creamos la fachada
        TiendaFacade tienda = new TiendaFacade(carrito, pago, envio);
        // Flujo de la tienda
        tienda.gestionarProd(scanner);  // 1) Añadir productos
        tienda.procesarPago();          // 2) Procesar el pago
        tienda.coordEntrega();          // 3) Coordinar el envío
        scanner.close();

        System.out.println("------------EJERCICIO 5------------");

        FabricaDeArboles fabrica = new FabricaDeArboles();
        Arbol a1 = fabrica.obtenerArbol("Roble", "Rugosa", "Verde");
        Arbol a4 = fabrica.obtenerArbol("Pino", "Lisa", "VerdeOscuro");
        Arbol a5 = fabrica.obtenerArbol("Pino", "Lisa", "VerdeOscuro");
        //Plantamos 1000 arboles
        /*
        int posy = 0;
        int posx = 0;
        for (int i = 0; i < 1_000_000; i++) {
            // Alterno entre dos tipos
            if (i % 2 == 0) {
                fabrica.obtenerArbol("Roble", "Rugosa", "Verde").plantar(posx, posy);
                posx++;
            } else {
                fabrica.obtenerArbol("Pino", "Lisa", "VerdeOscuro").plantar(posx, posy);
                posy++;
            }
        }
        */

        System.out.println("Hay "+fabrica.cantidadArboles()+" arboles creados");

        System.out.println("------------EJERCICIO 6------------");
        String nombreArchivo = "factura_tienda.txt";
        String[] usuariosAutorizadosInicial = {"Alicia", "Roberto"};
        ArchivoProxy controlAcceso = new ArchivoProxy(nombreArchivo, usuariosAutorizadosInicial);
        controlAcceso.agregarUsuarioAutorizado("Alberto");
        controlAcceso.agregarUsuarioAutorizado("Marta");
        System.out.println("\n=== Sistema de Acceso a Archivos ===");
        controlAcceso.abrir("Sol");   // No autorizado
        controlAcceso.abrir("Marta"); // Autorizado
    }
}

