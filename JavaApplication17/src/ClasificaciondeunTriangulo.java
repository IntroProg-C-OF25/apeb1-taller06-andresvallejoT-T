/*Problema-2
Clasificación de un triángulo Dado tres valores que representan las longitudes de
los lados de un triángulo, determinar su tipo. Las reglas son:

Si todos los lados son iguales, mostrar "Triángulo equilátero".
Si dos lados son iguales, mostrar "Triángulo isósceles".
Si todos los lados son diferentes, mostrar "Triángulo escaleno".
Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo".*/
import java.util.Scanner;

public class ClasificaciondeunTriangulo {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double lado1, lado2, lado3;
        System.out.println("Dame los 3 lados: ");
        lado1 = tcl.nextDouble();
        lado2 = tcl.nextDouble();
        lado3 = tcl.nextDouble();

        if ((lado1 == lado2) && (lado2 == lado3) && (lado1 == lado3)) {
            System.out.println("Es un triangulo equilatero");
        }
        if ((lado1 + lado2) <= lado3 || (lado1 + lado3) <= lado2 || (lado2 + lado3) <= lado1) {
            System.out.println("No es un triángulo");
        }
        if ((lado1 == lado2) || (lado2 == lado3) || (lado3 == lado1)) {
            System.out.println("Es un triangulo isoceles");
        }
        if ((lado1 != lado2) && (lado2 != lado3) && (lado3 != lado1)) {
            System.out.println("Es un triangulo escaleno");
        }

    }
}
/*run:
Dame los 3 lados: 
5 5 4
Es un triangulo isoceles
BUILD SUCCESSFUL (total time: 5 seconds)
*/
