package ejercicios.complementarios.parte3;

import java.util.List;

public class ejercicio3 {
    private static final String LETRA_INICIO = "b";

    public static void main(String[] args) {
        List<String> palabras =
                List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "Brainiac");


        long count = 0;
        for (String pal : palabras) {
            if (filtrarPorInicio(pal)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean filtrarPorInicio(String s) {
        return s != null && !s.isEmpty() && LETRA_INICIO.equalsIgnoreCase(s.substring(0, 1));
    }
}


