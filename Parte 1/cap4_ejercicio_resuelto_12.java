import java.util.Scanner;

public class cap4_ejercicio_resuelto_12 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos del trabajador
        System.out.print("Ingrese el nombre del trabajador: ");
        String NOM = scanner.nextLine();

        System.out.print("Ingrese el número de horas trabajadas en la semana (NHT): ");
        int NHT = scanner.nextInt();

        System.out.print("Ingrese el valor recibido por una hora normal de trabajo (VHN): ");
        double VHN = scanner.nextDouble();

        // Declarar variables necesarias
        int HET = 0;  // Horas extras trabajadas
        int HEE8 = 0; // Horas extras que exceden de 8
        double SALARIO = 0; // Salario total

        // Calcular el salario
        if (NHT > 40) {
            HET = NHT - 40; // Calcular horas extras
            if (HET > 8) {
                HEE8 = HET - 8; // Calcular horas extras que exceden de 8
                SALARIO = (40 * VHN) + (8 * 2 * VHN) + (HEE8 * 3 * VHN); // Salario con horas extra al triple
            } else {
                SALARIO = (40 * VHN) + (HET * 2 * VHN); // Salario con horas extra al doble
            }
        } else {
            SALARIO = NHT * VHN; // Salario sin horas extra
        }

        // Mostrar el resultado
        System.out.println("EL TRABAJADOR " + NOM + " DEVENGO: $" + String.format("%.2f", SALARIO));

        scanner.close();
    }
}
