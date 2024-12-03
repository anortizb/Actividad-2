import java.util.Scanner;

public class cap4_ejercicio_resuelto_14 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos de entrada
        System.out.print("Ingrese las ventas del departamento 1: ");
        double VD1 = scanner.nextDouble();

        System.out.print("Ingrese las ventas del departamento 2: ");
        double VD2 = scanner.nextDouble();

        System.out.print("Ingrese las ventas del departamento 3: ");
        double VD3 = scanner.nextDouble();

        System.out.print("Ingrese el salario de los vendedores de cada departamento: ");
        double SALAR = scanner.nextDouble();

        // Calcular el total de ventas en la empresa
        double TOTVEN = VD1 + VD2 + VD3;

        // Calcular el 33% de las ventas totales
        double PORVEN = 0.33 * TOTVEN;

        // Inicializar las variables para los salarios de los departamentos
        double SALAR1, SALAR2, SALAR3;

        // Calcular el salario para el departamento 1
        if (VD1 > PORVEN) {
            SALAR1 = SALAR + 0.2 * SALAR;
        } else {
            SALAR1 = SALAR;
        }

        // Calcular el salario para el departamento 2
        if (VD2 > PORVEN) {
            SALAR2 = SALAR + 0.2 * SALAR;
        } else {
            SALAR2 = SALAR;
        }

        // Calcular el salario para el departamento 3
        if (VD3 > PORVEN) {
            SALAR3 = SALAR + 0.2 * SALAR;
        } else {
            SALAR3 = SALAR;
        }

        // Mostrar el resultado
        System.out.println("SALARIO VENDEDORES DEPTO. 1: $" + SALAR1);
        System.out.println("SALARIO VENDEDORES DEPTO. 2: $" + SALAR2);
        System.out.println("SALARIO VENDEDORES DEPTO. 3: $" + SALAR3);

        // Cerrar el scanner
        scanner.close();
    }
}
