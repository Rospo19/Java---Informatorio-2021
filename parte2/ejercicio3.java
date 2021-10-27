package ejercicios.complementarios.parte2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;

public class ejercicio3 {
    public static void main(String[] args){
        ArrayList CartasFrancesas = new ArrayList();
        CartasFrancesas.add("A");
        CartasFrancesas.add("K");
        CartasFrancesas.add("Q");
        CartasFrancesas.add("J");
        CartasFrancesas.add("10");
        CartasFrancesas.add("9");
        CartasFrancesas.add("8");
        CartasFrancesas.add("7");
        CartasFrancesas.add("6");
        CartasFrancesas.add("5");
        CartasFrancesas.add("4");
        CartasFrancesas.add("3");
        CartasFrancesas.add("2");
        System.out.println("Orden");
        for (int i = 0; i < CartasFrancesas.size(); i++){
        System.out.println(CartasFrancesas.get(i));}
        System.out.println("Orden Inverso");
        Collections.reverse(CartasFrancesas);
        for (int a = 0; a < CartasFrancesas.size(); a++){
        System.out.println(CartasFrancesas.get(a));}
        System.out.println("Orden Mezclado");
        Collections.shuffle(CartasFrancesas);
        for (int b = 0; b < CartasFrancesas.size(); b++){
            System.out.println(CartasFrancesas.get(b));}
        }
};



