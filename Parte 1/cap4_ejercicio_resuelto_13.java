import java.util.Scanner;

public class cap4_ejercicio_resuelto_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        double VALCOMP = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese el color de la bolita (BLANCO, VERDE, AMARILLO, AZUL, ROJO): ");
        String COLOR = scanner.nextLine().toUpperCase();

        double PDES = 0;
        double VALPAG = 0;

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
                return;
        }

        VALPAG = VALCOMP - (PDES * VALCOMP / 100);

        System.out.println("EL CLIENTE DEBE PAGAR: $" + String.format("%.2f", VALPAG));

        scanner.close();
    }
}
