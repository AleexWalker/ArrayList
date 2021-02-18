import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String tipo;
        String nombreArchivo;
        int generacion;
        int velocidad;
        boolean validezBucle = true;

        ClasePokemon añadirPokemonUno = new ClasePokemon("Sceptile", "Planta", 3, 24);
        ClasePokemon añadirPokemonDos = new ClasePokemon("Glaceon", "Hielo", 4, 18);
        ClasePokemon añadirPokemonTres = new ClasePokemon("Necrozma", "Psiquico", 7, 35);
        ClasePokemon añadirPokemonCuatro = new ClasePokemon("Dragonite", "Dragon", 1, 47);

        System.out.print("Dime el nombre que le quieres poner al archivo: ");
        nombreArchivo = teclado.next();

        FileOutputStream fichero = new FileOutputStream(nombreArchivo);
        ObjectOutputStream objetoEscritura = new ObjectOutputStream(fichero);
                //File fichero = new File(nombreArchivo);

        objetoEscritura.writeObject(añadirPokemonUno);
        objetoEscritura.writeObject(añadirPokemonDos);
        objetoEscritura.writeObject(añadirPokemonTres);
        objetoEscritura.writeObject(añadirPokemonCuatro);

        objetoEscritura.close();

                //ArrayList<Object> listaPokemon = new ArrayList<Object>(Files.readAllLines(Paths.get(nombreArchivo)));
        ArrayList<Object> listaPokemon = new ArrayList<Object>();

        FileInputStream ficheroLectura = new FileInputStream(nombreArchivo);
        ObjectInputStream objetoLectura = new ObjectInputStream(ficheroLectura);

        ClasePokemon auxiliar = (ClasePokemon) objetoLectura.readObject();
        try {
            while (auxiliar != null) {
                listaPokemon.add(auxiliar);
                auxiliar = (ClasePokemon) objetoLectura.readObject();
            }

            //listaPokemon.add((añadirPokemon));
        } catch (EOFException e){

        }
        System.out.println(listaPokemon);
        //Collections.sort(listaPokemon);
    }
}
