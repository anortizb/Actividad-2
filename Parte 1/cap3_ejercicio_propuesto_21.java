import java.util.Scanner;

public class cap3_ejercicio_propuesto_21 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitar los lados del triángulo
        System.out.print("Ingrese el lado a del triángulo: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el lado b del triángulo: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el lado c del triángulo: ");
        double c = scanner.nextDouble();

        // Calcular el perímetro
        double perimetro = a + b + c;

        // Calcular el semiperímetro
        double semiperimetro = perimetro / 2;

        // Calcular el área utilizando la fórmula de Herón
        // Área = √(s * (s - a) * (s - b) * (s - c)), donde s es el semiperímetro
        double area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));

        // Mostrar los resultados
        System.out.println("Perímetro: " + String.format("%.2f", perimetro));
        System.out.println("Semiperímetro: " + String.format("%.2f", semiperimetro));
        System.out.println("Área: " + String.format("%.2f", area));

        scanner.close();
    }
}
