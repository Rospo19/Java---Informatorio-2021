package ejercicios.complementarios.parte1;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre y apellido: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad");
        String edad = sc.nextLine();
        System.out.println("Ingrese su direccion");
        String direccion = sc.nextLine();
        System.out.println("Ingrese su ciudad");
        String ciudad= sc.nextLine();

        System.out.println(ciudad + " - "+ direccion + " - "+ edad + " - "+ nombre);
    }
}
