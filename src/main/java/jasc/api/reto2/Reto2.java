package jasc.api.reto2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reto2 {

    /*
     * Escribe un programa que reciba un texto y transforme lenguaje natural a
     * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
     *  se caracteriza por sustituir caracteres alfanuméricos.
     * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
     *   con el alfabeto y los números en "leet".
     *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
     */
    public static void main(String[] args) {
        // Crear el diccionario leet
        Map<Character, String> leet = new HashMap<>();
        leet.put('A', "4");
        leet.put('B', "13");
        leet.put('C', "(");
        leet.put('D', "|>");
        leet.put('E', "3");
        leet.put('F', "|=");
        leet.put('G', "6");
        leet.put('H', "|-|");
        leet.put('I', "1");
        leet.put('J', "_|");
        leet.put('K', "|<");
        leet.put('L', "|_");
        leet.put('M', "/\\/\\");
        leet.put('N', "|\\|");
        leet.put('O', "0");
        leet.put('P', "|D");
        leet.put('Q', "(,)");
        leet.put('R', "|2");
        leet.put('S', "5");
        leet.put('T', "7");
        leet.put('U', "|_|");
        leet.put('V', "\\/");
        leet.put('W', "\\/\\/");
        leet.put('X', "><");
        leet.put('Y', "'/");
        leet.put('Z', "2");

        // Leer el texto de entrada del usuario
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el texto a traducir: ");
        String texto = sc.nextLine();

        // Traducir el texto a "lenguaje hacker" (leet)
        StringBuilder resultado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            String letraLeet = leet.get(Character.toUpperCase(c));
            if (letraLeet != null) {
                resultado.append(letraLeet);
            } else {
                resultado.append(c);
            }
        }


        System.out.println("Texto traducido a leet: " + resultado);
    }
}
