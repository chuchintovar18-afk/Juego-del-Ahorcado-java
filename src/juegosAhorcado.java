import java.util.Scanner;

public class juegosAhorcado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabraSecreta = "inteligente";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // EStructura de control: interactiva (buble)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }
        
        // EStructura de control: interactiva (buble)
        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("palabras a divinadas: " + String.valueOf(letrasAdivinadas));
            System.out.println("Introduce un letra, por favor");

            // Usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(sc.next().charAt(0));

            boolean letraCorrecta = false;

            // EStructura de control: interactiva (buble)
            for (int j = 0; j < letrasAdivinadas.length; j++) {
                // Estructura de control; condicional
                if (palabraSecreta.charAt(j) == letra) {
                    letrasAdivinadas[j] = letra;
                    letraCorrecta = true;

                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos) + "intentos.");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades, ha adivinado la palabra secreta: " + palabraSecreta);
            }
        }
        if (!palabraAdivinada) {
            System.out.println("¡Que pena t has quedado sin intentos! GAME OVER");
        }
        sc.close();

    }
}
