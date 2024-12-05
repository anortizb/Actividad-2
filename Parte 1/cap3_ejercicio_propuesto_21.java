import java.util.Scanner;

public class cap3_ejercicio_propuesto_21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado a del triángulo: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el lado b del triángulo: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el lado c del triángulo: ");
        double c = scanner.nextDouble();

        double perimetro = a + b + c;


        double semiperimetro = perimetro / 2;

        double area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));

        System.out.println("Perímetro: " + String.format("%.2f", perimetro));
        System.out.println("Semiperímetro: " + String.format("%.2f", semiperimetro));
        System.out.println("Área: " + String.format("%.2f", area));

        scanner.close();
    }
}
