import java.util.Scanner;

public class AireAcondicionado {

    // Método para verificar la temperatura
    public static void verificarTemperatura() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la temperatura en grados Celsius: ");
            int temperatura = scanner.nextInt();

            if (temperatura > 28) {
                System.out.println("El aire acondicionado está ACTIVADO.");
            } else {
                System.out.println("El aire acondicionado está DESACTIVADO.");
            }
        }
    }

    
    public static void verificarHumedad() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el porcentaje de humedad: ");
            int humedad = scanner.nextInt();

            if (humedad > 60) {
                System.out.println("El aire acondicionado está ACTIVADO.");
            } else {
                System.out.println("El aire acondicionado está DESACTIVADO.");
            }
        }
    }

    public static void main(String[] args) {
        verificarTemperatura();
        verificarHumedad();
    }
}
