import java.util.Scanner;

public class cap4_ejercicio_resuelto_10 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos del estudiante
        System.out.print("Ingrese el número de inscripción: ");
        int numeroInscripcion = scanner.nextInt();

        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese los nombres del estudiante: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese el patrimonio del estudiante: ");
        double patrimonio = scanner.nextDouble();

        System.out.print("Ingrese el estrato social del estudiante: ");
        int estrato = scanner.nextInt();

        // Inicializar el pago de matrícula con el valor constante
        double pagoMatricula = 50000;

        // Verificar si se aplica el incremento del 3% sobre el patrimonio
        if (patrimonio > 2000000 && estrato > 3) {
            pagoMatricula += 0.03 * patrimonio;
        }

        // Mostrar los resultados
        System.out.println("\nEL ESTUDIANTE CON NUMERO DE INSCRIPCION " + numeroInscripcion +
                " Y NOMBRE " + nombres + " DEBE PAGAR: $" + String.format("%.2f", pagoMatricula));

        scanner.close();
    }
}