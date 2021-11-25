package ejercicios.complementarios.parte3;

import java.util.ArrayList;
import java.util.List;

public class ejercicio2 {
    public static void main(String[] args) {
        List<Long> Numeros = List.of(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L);
        List<Long> potenciados = new ArrayList<>();

        // version enhanced for loop
        for (Long num : Numeros) {
            potenciados.add(num * num);
        }
        System.out.println(potenciados);
    }
}

