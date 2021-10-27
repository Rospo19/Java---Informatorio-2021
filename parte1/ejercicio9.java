package ejercicios.complementarios.parte1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ejercicio9 {
    public static void main(String[] args){
        String frase;
        Scanner entrada=new Scanner(System.in);
        StringTokenizer cuenta;
        int contador;

        System.out.println("Introduzca la frase: ");
        frase= entrada.nextLine();
        cuenta=new StringTokenizer(frase);
        System.out.println("el numero de palabras son: "+cuenta.countTokens());

    }
}
