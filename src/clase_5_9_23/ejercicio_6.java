package clase_5_9_23;

import java.util.Scanner;

public class ejercicio_6 {
    /*
    pedir un numero por consola y mostrar la tabla de multiplicar hasta 10
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar un número");

        int nro = sc.nextInt();
        int res = 0;

        for (int i = 1; i <= 10; i++){
            res = i * nro;
            System.out.println(res);
            //System.out.println(nro + " * " + i + " = + res);
        }

    }
}
