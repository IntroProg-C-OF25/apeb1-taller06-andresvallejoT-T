/*
 Problema-3
Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas según
la región y el peso del paquete. Si el peso es menor de 5 kg y la región es "local",
el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de $10 para la región "nacional". 
Para cualquier otro caso, el costo es de $15.
 */

import java.util.Scanner;

public class CostoEnvioPaquete {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String local;
        double peso;
        System.out.println("Escriba la localizacion (local)o(nacional) y su peso");
        local = tcl.next();
        peso = tcl.nextDouble();
        if ((peso < 5) && (local.equals("local"))) {
            System.out.println("el costo es de 5$");
        } else if ((peso >= 5) && (peso <= 10) && (local.equals("nacional"))) {
            System.out.println("El costo total es 10$");
        } else {
            System.out.println("El costo total es 15$");
        }
    }
}
/*run:
Escriba la localizacion (local)o(nacional) y su peso
local 3
el costo es de 5$
BUILD SUCCESSFUL (total time: 12 seconds)*/
