import java.util.Scanner;

public class cap3_ejercicio_propuesto_19 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitar el valor del lado del triángulo
        System.out.print("Ingrese el valor del lado del triángulo equilátero: ");
        double lado = scanner.nextDouble();

        // Calcular el perímetro
        double perimetro = 3 * lado;

        // Calcular la altura (fórmula: h = (√3 / 2) * lado)
        double altura = (Math.sqrt(3) / 2) * lado;

        // Calcular el área (fórmula: área = (base * altura) / 2)
        double area = (lado * altura) / 2;

        System.out.println("Perímetro: " + String.format("%.2f", perimetro));
        System.out.println("Altura: " + String.format("%.2f", altura));
        System.out.println("Área: " + String.format("%.2f", area));

        scanner.close();
    }
}
