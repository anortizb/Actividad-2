import java.util.Scanner;

public class cap4_ejercicio_resuelto_13 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitar el valor de la compra
        System.out.print("Ingrese el valor de la compra: ");
        double VALCOMP = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        // Solicitar el color de la bolita
        System.out.print("Ingrese el color de la bolita (BLANCO, VERDE, AMARILLO, AZUL, ROJO): ");
        String COLOR = scanner.nextLine().toUpperCase();

        // Declarar las variables necesarias
        double PDES = 0; // Porcentaje de descuento
        double VALPAG = 0; // Valor a pagar

        // Determinar el porcentaje de descuento según el color de la bolita
        switch (COLOR) {
            case "BLANCO":
                PDES = 0;
                break;
            case "VERDE":
                PDES = 10;
                break;
            case "AMARILLO":
                PDES = 25;
                break;
            case "AZUL":
                PDES = 50;
                break;
            case "ROJO":
                PDES = 100;
                break;
            default:
                System.out.println("Color inválido. Por favor, introduzca un color válido.");
                scanner.close();
                return; // Finalizar el programa si el color es inválido
        }

        // Calcular el valor a pagar
        VALPAG = VALCOMP - (PDES * VALCOMP / 100);

        // Mostrar el resultado
        System.out.println("EL CLIENTE DEBE PAGAR: $" + String.format("%.2f", VALPAG));

        scanner.close();
    }
}
