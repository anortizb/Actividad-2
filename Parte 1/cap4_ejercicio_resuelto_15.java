import java.util.Scanner;

public class cap4_ejercicio_resuelto_15 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        double PESOA, PESOB, PESOC, PESOD;

        // Leer los pesos de las esferas
        System.out.print("Ingrese el peso de la esfera A: ");
        PESOA = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera B: ");
        PESOB = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera C: ");
        PESOC = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera D: ");
        PESOD = scanner.nextDouble();

        // Determinar cuál esfera es diferente y si es de mayor o menor peso
        if (PESOA == PESOB && PESOA == PESOC) {
            if (PESOD > PESOA) {
                System.out.println("LA ESFERA D ES LA DIFERENTE Y ES DE MAYOR PESO");
            } else {
                System.out.println("LA ESFERA D ES LA DIFERENTE Y ES DE MENOR PESO");
            }
        } else if (PESOA == PESOB && PESOA == PESOD) {
            System.out.println("LA ESFERA C ES LA DIFERENTE");
            if (PESOC > PESOA) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else if (PESOA == PESOC && PESOA == PESOD) {
            System.out.println("LA ESFERA B ES LA DIFERENTE");
            if (PESOB > PESOD) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else {
            System.out.println("LA ESFERA A ES LA DIFERENTE");
            if (PESOA > PESOB) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}
