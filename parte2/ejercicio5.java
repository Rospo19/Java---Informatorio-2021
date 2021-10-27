package ejercicios.complementarios.parte2;

import java.util.ArrayList;
import java.util.List;

public class ejercicio5 {
    public static void main(String args[]) {
        List<Integer> HorasTrabajadas = new ArrayList<>();
        List<Integer> ValorPorHora = new ArrayList<>();
        List<Integer> Totales = new ArrayList<>();

        HorasTrabajadas.add(6);
        HorasTrabajadas.add(7);
        HorasTrabajadas.add(8);
        HorasTrabajadas.add(4);
        HorasTrabajadas.add(5);
        ValorPorHora.add(350);
        ValorPorHora.add(345);
        ValorPorHora.add(550);
        ValorPorHora.add(600);
        ValorPorHora.add(320);

        for (int i = 0; i < HorasTrabajadas.size(); i++) {
            int hs = HorasTrabajadas.get(i) * ValorPorHora.get(i);
            Totales.add(hs);
        }
        int TotalesHs = 0;
        for (Integer hs : Totales) {
            TotalesHs += hs;
        }
System.out.println(Totales);
        System.out.println("Total Final: $" + TotalesHs);

    }
}