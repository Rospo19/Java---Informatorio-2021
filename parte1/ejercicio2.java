package ejercicios.complementarios.parte1;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.print("Por favor introduzca un numero: ");
        n1 = input.nextInt();
        System.out.print("Por favor introduzca otro numero: ");
        n2 = input.nextInt();
        System.out.print("la suma es: "+ (n1+n2));
        System.out.print("la resta es: "+ (n1-n2));
        System.out.println("la multiplicacion es: "+ (n1*n2));
        System.out.println("la division es: "+ (n1/n2));
        System.out.println("el resto es: "+ (n1%n2));
    }
}
