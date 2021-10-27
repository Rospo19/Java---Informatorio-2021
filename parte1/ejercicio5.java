package ejercicios.complementarios.parte1;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int suma = 0;
        System.out.println("ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.println("ingrese el segundo numero: ");
        int b = sc.nextInt();
        for (int i = 1; i <= b; i++);{
            suma=suma + a;
        }
        System.out.println("el resultado del producto es: "+ a * b );

    }
}
