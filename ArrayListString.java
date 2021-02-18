import java.util.ArrayList;
import java.util.Collections;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> listaDePalabras = new ArrayList<String>();

        listaDePalabras.add("un");
        listaDePalabras.add("animal");
        listaDePalabras.add("va");
        listaDePalabras.add("caminando");
        listaDePalabras.add("de");
        listaDePalabras.add("qué");
        listaDePalabras.add("animal");
        listaDePalabras.add("se");
        listaDePalabras.add("trata");

        System.out.println("El ArrayList original es: " + listaDePalabras);
        Collections.sort(listaDePalabras);
        System.out.println("El ArrayList ordenado es: " + listaDePalabras);



    }
}
