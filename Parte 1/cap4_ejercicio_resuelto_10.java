import java.util.Scanner;

public class cap4_ejercicio_resuelto_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de inscripción: ");
        int numeroInscripcion = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Ingrese los nombres del estudiante: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese el patrimonio del estudiante: ");
        double patrimonio = scanner.nextDouble();

        System.out.print("Ingrese el estrato social del estudiante: ");
        int estrato = scanner.nextInt();

        double pagoMatricula = 50000;

        if (patrimonio > 2000000 && estrato > 3) {
            pagoMatricula += 0.03 * patrimonio;
        }

        System.out.println("\nEL ESTUDIANTE CON NUMERO DE INSCRIPCION " + numeroInscripcion +
                " Y NOMBRE " + nombres + " DEBE PAGAR: $" + String.format("%.2f", pagoMatricula));

        scanner.close();
    }
}