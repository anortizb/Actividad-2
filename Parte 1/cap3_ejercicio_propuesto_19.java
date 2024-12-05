import java.util.Scanner;

public class cap3_ejercicio_propuesto_19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado del triángulo equilátero: ");
        double lado = scanner.nextDouble();

        double perimetro = 3 * lado;

        double altura = (Math.sqrt(3) / 2) * lado;

        double area = (lado * altura) / 2;

        System.out.println("Perímetro: " + String.format("%.2f", perimetro));
        System.out.println("Altura: " + String.format("%.2f", altura));
        System.out.println("Área: " + String.format("%.2f", area));

        scanner.close();
    }
}
