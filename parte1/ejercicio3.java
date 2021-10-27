package ejercicios.complementarios.parte1;

public class ejercicio3 {
    public static void main(String[] args) {
        int incremento = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < i + 2; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}