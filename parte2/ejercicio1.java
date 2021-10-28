package ejercicios.complementarios.parte2;

import java.util.ArrayList;
import java.util.*;

public class ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String>ciudades = new ArrayList<String>();
        ciudades.add("Mar del Plata"); ciudades.add("Catamarca"); ciudades.add("Salta");
        int count = 0;
        for (String city : ciudades) {
            count++;
            System.out.println("#" + count + " - " + city);
        }
    }
}
