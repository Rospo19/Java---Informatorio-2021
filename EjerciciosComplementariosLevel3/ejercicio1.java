package ejercicios.complementarios.parte3;

import java.util.ArrayList;
import java.util.List;

public class ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("hola");
        palabras.add("");
        palabras.add(null);
        palabras.add("informatorio");

        List<String> endPalabras = new ArrayList<>();
        for (String s : palabras) {
            if (s != null && !s.isEmpty()) {
                endPalabras.add(s);
            }
        }
        System.out.println(endPalabras);
    }
}

