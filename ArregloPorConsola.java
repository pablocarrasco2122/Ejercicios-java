package prueba1;

import java.util.Scanner;

public class ArregloPorConsola {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Mensaje al usuario
        System.out.println("introduzca el tamaño del arreglo");
        String mitecla = sc.nextLine();

        // Pregunta al usuario el tamaño del arreglo
        System.out.println("Ahora introduzca los numeros que van a ser almacenados:");
        int size = Integer.parseInt(mitecla);

        // Crear el arreglo con el tamaño especificado
        String[] tecla1 = new String[size];

        // Llenar el arreglo con entradas del usuario
        for (int i = 0; i < size; i++) {
            System.out.print("Introduce un valor para la posición " + i + ": ");
            tecla1[i] = sc.nextLine();  // Usar 'i' como índice, no '1'
        }

        // Mostrar los valores del arreglo
        System.out.println("Valores del arreglo:");
        for (String tecla : tecla1) {
            System.out.println(tecla);
        }

      sc.close();
    }
}	
