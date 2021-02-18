import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> listaEntero = new ArrayList<Integer>();

        for (int i = 0; i <= 9 ; i++)
            listaEntero.add(i,  -211);
        for (int i = 0; i <= listaEntero.size() ; i++)
            System.out.println("La posición " + i + " contiene un " + listaEntero.get(i));
    }
}
