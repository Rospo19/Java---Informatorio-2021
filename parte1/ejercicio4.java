package ejercicios.complementarios.parte1;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero = 0;
        int factorial = 1;
        System.out.println("Ingrese el numero a calcular su factorial: ");
        numero = leer.nextInt();
        int numero1 = numero;

        while (numero != 0) {
            factorial *= numero;
            numero--;
        }
        System.out.println("el factorial del numero es " + numero1 + " es " + factorial);


    }
}
