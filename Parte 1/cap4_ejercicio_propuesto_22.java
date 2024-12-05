import java.util.Scanner;

public class cap4_ejercicio_propuesto_22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombreEmpleado;
        double salarioPorHora;
        int horasTrabajadas;
        double salarioMensual;

        System.out.print("Ingrese el nombre del empleado: ");
        nombreEmpleado = scanner.nextLine();
        System.out.print("Ingrese el salario básico por hora: ");
        salarioPorHora = scanner.nextDouble();
        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        horasTrabajadas = scanner.nextInt();

        salarioMensual = salarioPorHora * horasTrabajadas;

        if (salarioMensual > 450000) {
            System.out.println("Empleado: " + nombreEmpleado);
            System.out.println("Salario mensual: $" + salarioMensual);
        } else {
            System.out.println("Empleado: " + nombreEmpleado);
        }

        scanner.close();
    }
}
