package ejercicios.complementarios.parte2;

import java.util.ArrayList;

public class ejercicio2 {
    public static void main(String[] args){
        ArrayList numeroEntero = new ArrayList();
        numeroEntero.add(4);
        numeroEntero.add(2);
        numeroEntero.add(7);
        numeroEntero.add(3);
        numeroEntero.add(8);
        for (int i = 0; i < numeroEntero.size(); i++) {
            System.out.println("lista de numeros: "+numeroEntero.get(i));
        }
        System.out.println("Cantidad de numeros antes de agregar dos: "+numeroEntero.size());
        numeroEntero.add(0,9);
        numeroEntero.add(6);
        for (int i = 0; i < numeroEntero.size(); i++) {
            System.out.println("lista de numeros: "+numeroEntero.get(i));
        }
        System.out.println("Cantidad de numeros luego de agregar dos: "+numeroEntero.size());
    }
}
