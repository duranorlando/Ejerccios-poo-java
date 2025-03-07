import java.util.Scanner;

public class ControlLuces {


    public static void prenderLuces() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("¿Es de noche? (true/false): ");
            boolean esNoche = scanner.nextBoolean();

            if (esNoche) {
                System.out.println("Luces prendidas");
            } else {
                System.out.println("Luces apagadas");
            }
        }
    }

    
    public static void movimiento() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("¿Hay movimiento? (true/false): ");
            boolean hayMovimiento = scanner.nextBoolean();

            if (hayMovimiento) {
                System.out.println("Luces prendidas");
            } else {
                System.out.println("Luces apagadas");
            }
        }
    }

    // Método para apagar las luces durante el día
    public static void apagarLuces() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("¿Es de día? (true/false): ");
            boolean esDia = scanner.nextBoolean();

            if (esDia) {
                System.out.println("Luces apagadas");
            } else {
                System.out.println("Luces prendidas");
            }
        }
    }

    public static void main(String[] args) {
    
        System.out.println("Control de luces basado en condiciones:");
        prenderLuces();
        movimiento();
        apagarLuces();
    }
}
