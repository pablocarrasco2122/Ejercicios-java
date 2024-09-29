package maquina;

import java.util.Scanner;

public class ArrayConSwitchCase {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Mostrar las opciones al usuario
        System.out.println("Introduzca un número de opción para seleccionar un refresco:");
        System.out.println("1. Cocacola");
        System.out.println("2. Pepsi");
        System.out.println("3. Sprite");
        System.out.println("4. Fanta");

        // Leer la opción seleccionada
        int opcionSeleccionada = sc.nextInt();
        
        // Array de opciones (refrescos)
        String[] opciones = {"Cocacola", "Pepsi", "Sprite", "Fanta"};
        
        // Usar switch-case para verificar la opción seleccionada
        switch (opcionSeleccionada) {
            case 1:
                System.out.println("Seleccionaste: " + opciones[0]); // Coca-Cola
                break;
            case 2:
                System.out.println("Seleccionaste: " + opciones[1]); // Pepsi
                break;
            case 3:
                System.out.println("Seleccionaste: " + opciones[2]); // Sprite
                break;
            case 4:
                System.out.println("Seleccionaste: " + opciones[3]); // Fanta
                break;
            default:
                // Si la opción no está entre 1 y 4
                System.out.println("Opción no válida. Debes seleccionar un número entre 1 y 4.");
                break;
        }
        
        sc.close();  // Cerrar el Scanner
    }
}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  


