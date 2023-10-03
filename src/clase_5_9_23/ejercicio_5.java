package clase_5_9_23;

import com.sun.source.tree.WhileLoopTree;

public class ejercicio_5 {
    /*
    Mostrar los números pares que hay entre el 1 y el 10
     */
    public static void main(String[] args) {
        //While y for-> son bucles(estructuras repetitivas)
        //While
        System.out.println("While");
        System.out.println("------");

        int i = 1;
        while (1 <= 10) {          //declaración
            if (i % 2 == 0) {      //condición
                System.out.println(i);
            }
            i++;                     //paso: no olvidar de implementar
        }
    }
}

