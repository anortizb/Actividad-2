import java.util.Scanner;

public class cap4_ejercicio_propuesto_23 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        double A, B, C; // Coeficientes de la ecuación
        double discriminante, raiz1, raiz2;

        // Leer los valores de A, B y C
        System.out.print("Ingrese el valor de A: ");
        A = scanner.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        B = scanner.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        C = scanner.nextDouble();

        // Calcular el discriminante
        discriminante = B * B - 4 * A * C;

        // Verificar el discriminante para determinar el número de soluciones
        if (discriminante > 0) {
            // Dos soluciones reales distintas
            raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("Las soluciones son: x1 = " + raiz1 + " y x2 = " + raiz2);
        } else if (discriminante == 0) {
            // Una única solución real (raíz doble)
            raiz1 = -B / (2 * A);
            System.out.println("La solución es única: x = " + raiz1);
        } else {
            // Soluciones complejas (números imaginarios)
            double realParte = -B / (2 * A);
            double imaginarioParte = Math.sqrt(-discriminante) / (2 * A);
            System.out.println("Las soluciones son complejas:");
            System.out.println("x1 = " + realParte + " + " + imaginarioParte + "i");
            System.out.println("x2 = " + realParte + " - " + imaginarioParte + "i");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
