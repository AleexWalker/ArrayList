import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;


public class OrdenarArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
        Random numeroAleatorio = new Random();

        for (int i = 0; i <= 9; i++)
            listaEnteros.add(i, numeroAleatorio.nextInt(89) + 10);
        System.out.println("El contenido del ArrayList original es: " + listaEnteros);
        Collections.sort(listaEnteros);
        System.out.println("El contenido del ArrayList ordenado es: " + listaEnteros);
    }
}
