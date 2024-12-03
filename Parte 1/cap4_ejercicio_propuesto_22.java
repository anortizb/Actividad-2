import java.util.Scanner;

public class cap4_ejercicio_propuesto_22 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        String nombreEmpleado;
        double salarioPorHora;
        int horasTrabajadas;
        double salarioMensual;

        // Leer los datos de entrada
        System.out.print("Ingrese el nombre del empleado: ");
        nombreEmpleado = scanner.nextLine();
        System.out.print("Ingrese el salario básico por hora: ");
        salarioPorHora = scanner.nextDouble();
        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        horasTrabajadas = scanner.nextInt();

        // Calcular el salario mensual
        salarioMensual = salarioPorHora * horasTrabajadas;

        // Determinar si el salario mensual es mayor o no a $450,000
        if (salarioMensual > 450000) {
            System.out.println("Empleado: " + nombreEmpleado);
            System.out.println("Salario mensual: $" + salarioMensual);
        } else {
            System.out.println("Empleado: " + nombreEmpleado);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
