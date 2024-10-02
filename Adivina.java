package adivinanza;

import java.util.Random;
import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        // Generar un número aleatorio entre 1 y 100
        int numeroAleatorio = random.nextInt(100) + 1;
        int intento = 0;
        int numeroUsuario = 0;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("He pensado en un número entre 1 y 100. Intenta adivinarlo.");

        // Bucle para que el usuario adivine el número
        while (numeroUsuario != numeroAleatorio) {
            System.out.print("Introduzca un número: ");
            numeroUsuario = sc.nextInt(); // Leer el número del usuario

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es muy bajo. Intenta de nuevo.");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número es muy alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número.");
            }

            intento++;
        }

        System.out.println("Lo lograste en " + intento + " intentos.");
        
        // Cerrar el Scanner
        sc.close();
    }
}

