package ejercicios.complementarios.parte1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ejercicio9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String texto = scan.nextLine();
        System.out.println("Introduzca la letra a buscar: ");
        String caracteraEncontrar = scan.nextLine();
        System.out.println("La cantidad de "+ " '" + caracteraEncontrar + "'"+ " encontradas en la frase");
        System.out.println(texto.split(caracteraEncontrar, -1).length-1);
        scan.close();

    }
}
