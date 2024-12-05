import java.util.Scanner;

public class cap4_ejercicio_propuesto_24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pesoA, pesoB, pesoC;

        System.out.print("Ingrese el peso de la esfera A: ");
        pesoA = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera B: ");
        pesoB = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera C: ");
        pesoC = scanner.nextDouble();

        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A es la de mayor peso.");
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B es la de mayor peso.");
        } else {
            System.out.println("La esfera C es la de mayor peso.");
        }

        scanner.close();
    }
}
