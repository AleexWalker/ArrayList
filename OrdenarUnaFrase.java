import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarUnaFrase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Pon una frase: ");
        String fraseUsuario = teclado.nextLine();
        fraseUsuario.substring(1);

        ArrayList<String> listaDePalabras = new ArrayList<String>(Arrays.asList(fraseUsuario.split(" ")));
        Collections.sort(listaDePalabras);
        System.out.println("Frase ordenada: " + listaDePalabras);




    }
}
