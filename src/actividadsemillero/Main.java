
package actividadsemillero;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            continuar = menuPrincipal(input);
        }

        input.close();
        System.out.println("Programa finalizado.");
    }

    public static boolean menuPrincipal(Scanner input) {
        System.out.println("\nCalculadora");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        int numero = input.nextInt();

        switch (numero) {
            case 1 -> {
                System.out.println("Ingresaste a suma.");
                sumaNumeros(input);
            }
            case 2 -> {
                System.out.println("Ingresaste a resta.");
                restarNumeros(input);
            }
            case 3 -> {
                System.out.println("Ingresaste a multiplicación.");
                multiplicaNumeros(input);
            }
            case 4 -> {
                System.out.println("Ingresaste a división.");
                dividirNumeros(input);
            }
            case 5 -> {
                System.out.println("Salir del código.");
                return false;
            }
            default -> {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
        return true;
    }

    public static void sumaNumeros(Scanner input) {
        System.out.print("¿Cuántos números deseas ingresar para sumar? ");
        int cantidadNumeros = input.nextInt();
        
        int suma = 0;
        
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            int numero = input.nextInt();
            suma += numero;
        }
        System.out.println("La suma de los números ingresados es: " + suma);

        preguntarReiniciar(input);
    }

    public static void restarNumeros(Scanner input) {
        System.out.print("¿Cuántos números deseas ingresar para restar? ");
        int cantidadNumeros = input.nextInt();
        int resta = 0;
        
        if (cantidadNumeros > 0) {
            System.out.print("Ingresa el número 1: ");
            resta = input.nextInt();
            
            for (int i = 1; i < cantidadNumeros; i++) {
                System.out.print("Ingresa el número " + (i + 1) + ": ");
                int numero = input.nextInt();
                resta -= numero;
            }
            
            System.out.println("La resta de los números ingresados es: " + resta);
        } else {
            System.out.println("Debes ingresar al menos un número.");
        }

        preguntarReiniciar(input);
    }

    public static void multiplicaNumeros(Scanner input) {
        System.out.print("¿Cuántos números deseas ingresar para multiplicar? ");
        int cantidadNumeros = input.nextInt();
        
        int producto = 1;
        
        if (cantidadNumeros > 0) {
            for (int i = 0; i < cantidadNumeros; i++) {
                System.out.print("Ingresa el número " + (i + 1) + ": ");
                int numero = input.nextInt();
                producto *= numero;
            }
            System.out.println("El producto de los números ingresados es: " + producto);
        } else {
            System.out.println("Debes ingresar al menos un número.");
        }

        preguntarReiniciar(input);
    }

    public static void dividirNumeros(Scanner input) {
        System.out.print("¿Cuántos números deseas ingresar para dividir? ");
        int cantidadNumeros = input.nextInt();
        double resultado = 0.0;

        if (cantidadNumeros > 0) {
            System.out.print("Ingresa el número 1: ");
            resultado = input.nextDouble();

            for (int i = 1; i < cantidadNumeros; i++) {
                System.out.print("Ingresa el número " + (i + 1) + ": ");
                double numero = input.nextDouble();
                
                if (numero != 0) {
                    resultado /= numero;
                } else {
                    System.out.println("Error: No se puede dividir por cero. Finalizando operación.");
                    return;
                }
            }

            System.out.println("El resultado de la división de los números ingresados es: " + resultado);
        } else {
            System.out.println("Debes ingresar al menos un número.");
        }

        preguntarReiniciar(input);
    }

    public static void preguntarReiniciar(Scanner input) {
        System.out.println("¿Quieres realizar otra operación?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        int decision = input.nextInt();
        
        if (decision == 2) {
            System.out.println("Saliendo del programa.");
            System.exit(0);  // Salir del programa
        }
    }
}
