package clase_12_9_23;

import java.util.Scanner;

public class Ejercicio7  {
    /*
        Pide una cadena por consola y muestra sus caracteres uno por uno
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sc.useDelimiter("\n");

        System.out.println("ingresa una palabra");
        String palabra = sc.next();

        char c;
        for (int i = 0; i < palabra.length(); i++) {
            c = palabra.charAt(i);
        }
    }
}
