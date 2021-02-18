import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NumeroMaxArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
        Scanner teclado = new Scanner(System.in);
        Random numeroAleatorio = new Random();
        int maximo = 1;

        for (int i = 0; i <= 9; i++) {
            listaEnteros.add(i, numeroAleatorio.nextInt(100) + 1);
            if (listaEnteros.get(i) >= maximo)
                maximo = listaEnteros.get(i);
        }

        System.out.println("El contenido del ArrayList original es: " + listaEnteros);
        System.out.println("El número más alto dentro del ArrayList es: " + maximo);
    }
}
