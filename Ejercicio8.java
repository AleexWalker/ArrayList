import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
        Scanner teclado = new Scanner(System.in);
        Random numeroAleatorio = new Random();
        boolean encontrado = false;

        for (int i = 0; i <= 9; i++)
            listaEnteros.add(i, numeroAleatorio.nextInt(50) + 1);
        System.out.println("El contenido del ArrayList original es: " + listaEnteros);
        System.out.print("Valor a encontrar: ");
        int entrada = teclado.nextInt();

        for (int i = 0; i <= listaEnteros.size() - 1; i++)
            if (listaEnteros.get(i) == entrada) {
                System.out.println(entrada + " se encuentra en la posición " + i );
                encontrado = true;

            }
        if (!encontrado)
            System.out.println(entrada + " no se encuentra en el ArrayList");
    }
}
