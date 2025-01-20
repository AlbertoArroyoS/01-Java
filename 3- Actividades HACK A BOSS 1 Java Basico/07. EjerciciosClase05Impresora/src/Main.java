import modelo.entidad.Impresora;
import modelo.entidad.ImpresoraCannon;
import modelo.entidad.ImpresoraEpson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/*
Ejercicio Nº 2 - Herencia y Polimorfismo
Crear una clase llamada Impresora con los atributos: modelo, tipo de conexión, fecha de fabricación, hojas disponibles y porcentaje tinta
(con sus métodos y constructores correspondientes). También agregar el método:
“Imprimir” para mostrar un mensaje en pantalla que diga "Imprimiendo en
impresora genérica".
a)     Crear las siguientes clases hijas:
●       Impresora Cannon
●       Impresora Epson
b)     Crear los siguientes métodos (en cada subclase correspondiente):

●       Impresora Cannon: Sobrescribir el
método “Imprimir” para mostrar un mensaje en pantalla que diga "Imprimiendo
en impresora Cannon".

●       Impresora Epson: Sobrescribir el
método “Imprimir” para mostrar un mensaje en pantalla que diga " Imprimiendo
en impresora Epson".

c)     Una vez creadas las clases, crear en el Main un vector de tipo Impresora y almacenar 3 impresoras cannon y 2 impresoras epson (crear un objeto con parámetros para cada uno de ellos).

d)     Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.

PISTA: Todos tendrán el mismo método, con el mismo nombre, pero únicamente cambia el mensaje que muestran. Tener en cuenta para esto la implementación de herencia y sobrescritura de métodos.
 */
public class Main {

    public static void main(String[] args) throws ParseException {

        //Crear las fechas
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date fecha1 = dateFormat.parse("01/01/2023");
        Date fecha2 = dateFormat.parse("15/03/2024");
        Date fecha3 = dateFormat.parse("10/10/2022");
        Date fecha4 = dateFormat.parse("05/05/2023");
        Date fecha5 = dateFormat.parse("20/08/2024");

        // Crear impresoras Cannon con fechas específicas
        ImpresoraCannon iCannon01 = new ImpresoraCannon("Cannon X100", "USB", fecha1, 100, 80);
        ImpresoraCannon iCannon02 = new ImpresoraCannon("Cannon X200", "WiFi", fecha2, 200, 50);
        ImpresoraCannon iCannon03 = new ImpresoraCannon("Cannon X300", "Ethernet", fecha3, 150, 60);

        // Crear impresoras Epson con fechas específicas
        ImpresoraEpson iEpson01 = new ImpresoraEpson("Epson E100", "USB", fecha4, 80, 90);
        ImpresoraEpson iEpson02 = new ImpresoraEpson("Epson E200", "WiFi", fecha5, 120, 70);

        Impresora[] impresoras = {iCannon01, iCannon02, iCannon03,iEpson01, iEpson02};

        // Recorrer el array y llamar a métodos
        System.out.println("*****Array con for each*****");
        for (Impresora impresora : impresoras) {
            System.out.print(impresora+"\n");
            impresora.imprimir();
        }

        System.out.println("*****Array con for normal*****");

        for (int i = 0; i < impresoras.length; i++) {
            System.out.print(impresoras[i] + "\n");
            impresoras[i].imprimir();
        }

        //Lista de impresoras
        List<Impresora> listaImpresoras = new ArrayList<>();
        listaImpresoras.add(iCannon01);
        listaImpresoras.add(iCannon02);
        listaImpresoras.add(iCannon03);
        listaImpresoras.add(iEpson01);
        listaImpresoras.add(iEpson02);

        // Identificar tipos instanceof
        /*
        System.out.println("*****Identificar tipos de impresoras en una List*********");
        for (Impresora impresora : listaImpresoras) {
            if (impresora instanceof ImpresoraCannon) {
                System.out.println("**Impresora Cannon");
                System.out.println(impresora);
                impresora.imprimir();
            } else if (impresora instanceof ImpresoraEpson) {
                System.out.println("**Impresora Epson");
                System.out.println(impresora);
                impresora.imprimir();
            }
        }*/

        System.out.println("*****Listado de impresoras Cannon*****");
        for (Impresora impresora : listaImpresoras) {
            if (impresora instanceof ImpresoraCannon) {
                System.out.println(impresora);
                impresora.imprimir();
            }
        }
        System.out.println("****Listado de impresoras Epson*****");
        for (Impresora impresora : listaImpresoras) {
            if (impresora instanceof ImpresoraEpson) {
                System.out.println(impresora);
                impresora.imprimir();
            }
        }





    }
}