import java.util.Scanner;

public class cap4_ejercicio_propuesto_23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A, B, C;
        double discriminante, raiz1, raiz2;

        System.out.print("Ingrese el valor de A: ");
        A = scanner.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        B = scanner.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        C = scanner.nextDouble();

        discriminante = B * B - 4 * A * C;

        if (discriminante > 0) {
            raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("Las soluciones son: x1 = " + raiz1 + " y x2 = " + raiz2);
        } else if (discriminante == 0) {
            raiz1 = -B / (2 * A);
            System.out.println("La solución es única: x = " + raiz1);
        } else {
            double realParte = -B / (2 * A);
            double imaginarioParte = Math.sqrt(-discriminante) / (2 * A);
            System.out.println("Las soluciones son complejas:");
            System.out.println("x1 = " + realParte + " + " + imaginarioParte + "i");
            System.out.println("x2 = " + realParte + " - " + imaginarioParte + "i");
        }

        scanner.close();
    }
}
