
/**
 * Problema-5
 * Determinar el tipo de operación matemática. Dado un número del 1 al 4 que
 * representa una operación matemática básica (suma, resta, multiplicación,
 * división), muestra el nombre de la operación correspondiente. Por ejemplo,
 * si el usuario ingresa 1, debe mostrar "Suma"; si ingresa 2, debe mostrar "Resta",
 * y así sucesivamente. */
import java.util.Scanner;

public class TipodeOperador {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num;
        System.out.println("Dame un numero: ");
        num=tcl.nextInt();
        switch (num) {
            case 1:
                System.out.println("Suma");
                break;
            case 2:
                System.out.println("Resta");
                break;
            case 3:
                System.out.println("Multiplicacion");
                break;
            case 4:
                System.out.println("Division");
                break;
            default:
                System.out.println("Error");
        }
    }
}
/*run:
Dame un numero: 
3
Multiplicacion
BUILD SUCCESSFUL (total time: 1 second)
*/