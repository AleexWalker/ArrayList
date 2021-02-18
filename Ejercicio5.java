import java.util.ArrayList;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<Integer>();

        Random numeroAleatorio = new Random();
        for (int i = 0 ; i <= 9 ; i++)
            listaEnteros.add(i, numeroAleatorio.nextInt(100)+1);

        ArrayList<Integer> copiaListaEnteros = new ArrayList<Integer>(listaEnteros);
        listaEnteros.set(listaEnteros.size()-1, -7);

        System.out.println("El contenido del ArrayList original: " + listaEnteros);
        System.out.println("El contenido del ArrayList copia: " + copiaListaEnteros);
    }
}
