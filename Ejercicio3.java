import java.util.ArrayList;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
        Random numeroAleatorio = new Random();

         for (int i = 0 ;  i <= 9 ; i++)
             listaEnteros.add(i, numeroAleatorio.nextInt(100)+1);

        System.out.println("El contenido del ArrayList es: " + listaEnteros);
    }
}
