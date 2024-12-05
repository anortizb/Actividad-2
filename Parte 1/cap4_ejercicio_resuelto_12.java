import java.util.Scanner;

public class cap4_ejercicio_resuelto_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del trabajador: ");
        String NOM = scanner.nextLine();

        System.out.print("Ingrese el número de horas trabajadas en la semana (NHT): ");
        int NHT = scanner.nextInt();

        System.out.print("Ingrese el valor recibido por una hora normal de trabajo (VHN): ");
        double VHN = scanner.nextDouble();

        int HET = 0;
        int HEE8 = 0;
        double SALARIO = 0;

        if (NHT > 40) {
            HET = NHT - 40;
            if (HET > 8) {
                HEE8 = HET - 8;
                SALARIO = (40 * VHN) + (8 * 2 * VHN) + (HEE8 * 3 * VHN);
            } else {
                SALARIO = (40 * VHN) + (HET * 2 * VHN);
            }
        } else {
            SALARIO = NHT * VHN;
        }

        System.out.println("EL TRABAJADOR " + NOM + " DEVENGO: $" 
                            + String.format("%.2f", SALARIO));

        scanner.close();
    }
}
