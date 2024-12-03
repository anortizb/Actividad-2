import java.util.Scanner;

public class cap4_ejercicio_propuesto_24 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        double pesoA, pesoB, pesoC;

        // Leer los pesos de las tres esferas
        System.out.print("Ingrese el peso de la esfera A: ");
        pesoA = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera B: ");
        pesoB = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera C: ");
        pesoC = scanner.nextDouble();

        // Comparar los pesos de las esferas
        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A es la de mayor peso.");
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B es la de mayor peso.");
        } else {
            System.out.println("La esfera C es la de mayor peso.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
