package ejercicios.complementarios.parte3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos =
                List.of(
                        new Alumno("Senor1", "Misterioso1", LocalDate.of(1934, 11, 1)),
                        new Alumno("Senor2", "Misterioso2", LocalDate.of(1980, 2, 20)),
                        new Alumno("Senor3", "Misterioso3", LocalDate.of(1924, 9, 1)));

        Map<String, Integer> edades = new HashMap<>();

        for (Alumno alumno : alumnos) {
            edades.put(
                    alumno.getApellido() + " " + alumno.getNombre(),
                    alumno.getNacimiento().until(LocalDate.now()).getYears());
        }

        System.out.println(edades);
    }
}

