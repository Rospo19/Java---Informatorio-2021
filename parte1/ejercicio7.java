package ejercicios.complementarios.parte1;

import java.util.Locale;

public class ejercicio7 {
    static String MinaMayus(String s) {
        String result = "";
        char ch = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                ch = (char)(s.charAt(i) - 32);
            }
            else {
                ch = (char)(s.charAt(i));
            }

            result += ch;
        }
        return result;
    }
    public static void main(String[] args){
    System.out.println(MinaMayus("informatorio"));
    }



    }


