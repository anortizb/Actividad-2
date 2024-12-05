import java.util.Scanner;

public class cap3_ejercicio_propuesto_18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codigo;
        String nombres;
        int horasTrabajadas;
        double valorHora;
        double porcentajeRetencion;

        System.out.print("Ingrese el código del empleado: ");
        codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese los nombres del empleado: ");
        nombres = scanner.nextLine();

        System.out.print("Ingrese el número de horas trabajadas al mes: ");
        horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el valor por hora trabajada: ");
        valorHora = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de retención en la fuente (en porcentaje): ");
        porcentajeRetencion = scanner.nextDouble();

        double salarioBruto = horasTrabajadas * valorHora;
        double salarioNeto = salarioBruto - (salarioBruto * (porcentajeRetencion / 100));

        System.out.println("Código: " + codigo);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario Bruto: $" + String.format("%.2f", salarioBruto));
        System.out.println("Salario Neto: $" + String.format("%.2f", salarioNeto));

        scanner.close();
    }
}