import java.util.Scanner;

public class cap4_ejercicio_resuelto_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();

        if (A > B) {
            System.out.println("A es mayor que B");
        } else if (A == B) {
            System.out.println("A es igual a B");
        } else {
            System.out.println("A es menor que B");
        }

        scanner.close();
    }
}
