package ejercicios.complementarios.parte2;

import java.util.ArrayList;
import java.util.List;

public class ejercicio4 {
    public static void main(String[] args) {
        List<String> estudiante = new ArrayList<>();
        estudiante.add("Sol");
        estudiante.add("Julian");
        estudiante.add("Meli");
        estudiante.add("Chas");
        estudiante.add("Yisus");
        estudiante.add("Boga");
        estudiante.add("Franco");
        estudiante.add("Jose");
        estudiante.add("Bettiana");
        estudiante.add("Erick");
        estudiante.add("Dario");
        estudiante.add("Scarlett");

        List<String> curso1 = estudiante.subList(0, 4);
        List<String> curso2 = estudiante.subList(4, 8);
        List<String> curso3 = estudiante.subList(8, 12);
        System.out.println("curso1:");
        for (String cs1 : curso1) {
            System.out.println(cs1);
        }
        System.out.println("curso2:");
        for (String cs2 : curso2) {
            System.out.println(cs2);
        }
        System.out.println("curso3:");
        for (String cs3 : curso3){
            System.out.println(cs3);
        }
    }
}



