/*problema 1>
Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador de 
Sistemas Informáticos para programar su sistema de compras online, el cual calcule el 
precio total de la compra para un cliente. Para ello, se necesita utilizar estructuras
secuenciales y de selección (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.
Requisitos:
La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos variantes.
Al costo total de la factura, se debe incluir los gastos por concepto de transporte/envío
del paquete, del cual no se aplican ningún tipo de descuentos o impuestos dada la excepción 
descrita en el punto 3.b.
El objetivo es presentar al usuario los detalles de su compra: costos, impuestos, descuentos,
monto final dadas las siguientes condiciones: a. Si el subtotal de la compra (sin descuentos 
o gastos de envío), supera los $1000, se le otorga un 20% de descuento; y si es al menos los 
$1000 el descuento es como mínimo 5%. b. Adicional, si la compra es mayor a $5000, el envío 
será gratuito. c. El IVA del 10% se debe aplicar a todos los artículos antes de agregar 
cualquier tipo de descuesto o promoción.*/
import java.util.Scanner;

public class Facturacion2Productos {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double pdt1, pdt2, trans, iva, subt, desc, desc1, total;
        System.out.print("Dame los precios de ambos productos: ");
        pdt1 = tcl.nextDouble();
        pdt2 = tcl.nextDouble();
        System.out.print("Dame el costo del transporte: ");
        trans = tcl.nextDouble();
        iva = (pdt1 + pdt2) * 0.1;
        subt = iva + (pdt1 + pdt2);
        if (subt < 1000) {
            total = subt + trans;
            System.out.println("Su total es: " + total + " sin ningun descuento");
        }
        if (subt == 1000) {
            desc = -(subt * 5 / 100) + subt;
            total = desc + trans;
            System.out.println("Su total es de: " + total + " con un descuento del 5% ");
        }
        if (subt > 1000) {
            desc = -(subt * 20 / 100) + subt;
            total = desc + trans;
            System.out.println("Su total es: " + total + " Con un descuento del 20%");

        }
        if (subt > 5000) {
            System.out.println("Su total es: " + subt + " Sin costo adicional por el transporte");
        }

    }
}
/*run:
Dame los precios de ambos productos: 500 2500
Dame el costo del transporte: 72
Su total es: 2712.0 Con un descuento del 20%
BUILD SUCCESSFUL (total time: 27 seconds)*/
